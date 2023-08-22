package parser.procmonparser;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;
import datamodel.*;
import config.MetaConfig;
import parser.sysdigparser.SysdigOutputParser;
import parser.ParserUtils;
import parser.exception.UnknownEventException;
import parser.sysdigparser.syscalls.Fingerprint;
import parser.procmonparser.windowssyscalls.WinSyscall;
import parser.procmonparser.windowssyscalls.WinSyscallFactory;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVParser;
import com.opencsv.exceptions.CsvValidationException;

public class ProcmonOutputParser implements SysdigOutputParser {

    private File log;
    private long UID;

    private HashMap<String, FileEntity> files;
    private HashMap<String, ProcessEntity> processes;
    private HashMap<String, NetworkEntity> networks;
    private HashMap<String, RegistryEntity> registries;

    private HashMap<String, PtoFEvent> pfEvent; //keys are all timestamps:event:cwd
    private HashMap<String, PtoNEvent> pnEvent;
    private HashMap<String, PtoPEvent> ppEvent;
    private HashMap<String, NtoPEvent> npEvent;
    private HashMap<String, FtoPEvent> fpEvent;
    private HashMap<String, RtoPEvent> rpEvent;
    private HashMap<String, PtoREvent> prEvent;

    private Map<Fingerprint, WinSyscall> answering;

    private HashMap<String, String> createdProcess;

    private Map<String,PtoPEvent> backFlow; //key is pid+process
    private Map<String,PtoPEvent> forwardFlow;



    private String timezone;

    public ProcmonOutputParser(String pathToLog, String timezone) {
        files = new HashMap<>();
        processes = new HashMap<>();
        networks = new HashMap<>();
        registries = new HashMap<>();
        pfEvent = new HashMap<>();
        pnEvent = new HashMap<>();
        ppEvent = new HashMap<>();
        npEvent = new HashMap<>();
        fpEvent = new HashMap<>();
        rpEvent = new HashMap<>();
        prEvent = new HashMap<>();

        createdProcess = new HashMap<>();

        backFlow = new HashMap<>();
        forwardFlow = new HashMap<>();

        answering = new HashMap<>();

        log = new File(pathToLog);
        UID = 0;
        this.timezone = timezone;

        registerSystemCalls();
    }

    private void registerSystemCalls(){
        //FtoP
        WinSyscallFactory f2pSystemCall = new WinSyscallFactory("FtoP",FileEntity.class,null)
                .addShortAction(this::addF2PEvent);
        for(String s : MetaConfig.ftopOperation) {
            WinSyscall systemCall = f2pSystemCall.getWinOperation(s);
            answering.put(systemCall.fingerPrint,systemCall);
        }
        //PtoF
        WinSyscallFactory p2fSystemCall = new WinSyscallFactory("PtoF",FileEntity.class,null)
                .addShortAction(this::addP2FEvent);
        for(String s : MetaConfig.ptofOperation) {
            WinSyscall systemCall = p2fSystemCall.getWinOperation(s);
            answering.put(systemCall.fingerPrint,systemCall);
        }

        //NtoP
        WinSyscallFactory n2pSystemCall = new WinSyscallFactory("NtoP",NetworkEntity.class,null)
                .addShortAction(this::addN2PEvent);
        for(String s : MetaConfig.ntopOperation) {
            WinSyscall systemCall = n2pSystemCall.getWinOperation(s);
            answering.put(systemCall.fingerPrint,systemCall);
        }

        //PtoN
        WinSyscallFactory p2nSystemCall = new WinSyscallFactory("PtoN",NetworkEntity.class,null)
                .addShortAction(this::addP2NEvent);
        for(String s : MetaConfig.ptonOperation) {
            WinSyscall systemCall = p2nSystemCall.getWinOperation(s);
            answering.put(systemCall.fingerPrint,systemCall);
        }

        //RtoP
        WinSyscallFactory r2pSystemCall = new WinSyscallFactory("RtoP",RegistryEntity.class,null)
                .addShortAction(this::addR2PEvent);
        for(String s : MetaConfig.rtopOperation) {
            WinSyscall systemCall = r2pSystemCall.getWinOperation(s);
            answering.put(systemCall.fingerPrint,systemCall);
        }

        //PtoR
        WinSyscallFactory p2rSystemCall = new WinSyscallFactory("PtoR",RegistryEntity.class,null)
                .addShortAction(this::addP2REvent);
        for(String s : MetaConfig.ptorOperation) {
            WinSyscall systemCall = p2rSystemCall.getWinOperation(s);
            answering.put(systemCall.fingerPrint,systemCall);
        }

        //Process Create
        WinSyscall pCreate = new WinSyscall("Process Create","PtoP",
                new Fingerprint("Process Create", FileEntity.class,null)).addShortAction((entities, mEvent)->{
            ProcessEntity parent = (ProcessEntity)entities[0];
            String eventNo = mEvent.get("eventno");
            String newProcessPath = mEvent.get("object");
            String timestampStart = mEvent.get("timestamp");
            String timestampEnd = mEvent.get("endTimestamp");
            String keyParent = parent.getPid() + parent.getName();

            String[] timestampsStart = timestampStart.split("\\.");
            PtoPEvent incomplete = new PtoPEvent(timestampsStart[0],timestampsStart[1], parent, null,"Process Create",
                    Long.parseLong(eventNo));
            incomplete.setEndTime(timestampEnd);
            createdProcess.put(newProcessPath, keyParent);
            forwardFlow.put(keyParent, incomplete);
        });
        answering.put(pCreate.fingerPrint, pCreate);

        WinSyscall pStart = new WinSyscall("Process Start","PtoP",
                new Fingerprint("Process Start", null,null)).addShortAction((Entities, mEvent)->{

            String eventNo = mEvent.get("eventno");
            String exePath = mEvent.get("exepath");
            String timestampStart = mEvent.get("timestamp");
            String key =timestampStart + ":Process Start:" + mEvent.get("process name");
            String keyParent = createdProcess.get(exePath);
            String[] timestampsStart = timestampStart.split("\\.");

            ProcessEntity process = (ProcessEntity)Entities[0];
            FileEntity f = files.getOrDefault(exePath, null);

            if(f != null && !f.getPath().equals("<NA>")){
                FtoPEvent fp = new FtoPEvent(timestampsStart[0],timestampsStart[1],
                        f, process,"Process Start",0,Long.parseLong(eventNo));
                fp.setEndTime(timestampStart);
                fpEvent.put(key,fp);
            }
            PtoPEvent forwardEvent = forwardFlow.get(keyParent);
            forwardEvent.setSink(process);
            ppEvent.put(key, forwardEvent);
        });
        answering.put(pStart.fingerPrint, pStart);
    }


    public void getEntities() throws IOException {
        System.out.println("Parsing...");
        long start = System.currentTimeMillis();
        CSVParser csvParser = new CSVParserBuilder().withEscapeChar('\0').withSeparator(',').build();
        try(CSVReader csvReader = new CSVReaderBuilder(new FileReader(log)).withCSVParser(csvParser).build()) {
            String[] titleLine = csvReader.readNext();
            Map<String, Integer> titleIndex = new HashMap<>();
            for(int i = 0; i < titleLine.length; i++) {
                titleIndex.put(titleLine[i], i);
            }
            int seq = 0;
            String[] currentLine;
            boolean hasCmd = titleIndex.containsKey("Command Line");
            while((currentLine = csvReader.readNext())!=null){
                if(!currentLine[titleIndex.get("Result")].equals("SUCCESS")) continue;

                Map<String, String> matcher = new HashMap<>();
                matcher.put("pid", currentLine[0]);
                matcher.put("process", currentLine[titleIndex.get("Process Name")]);
                matcher.put("exepath", currentLine[titleIndex.get("Image Path")]);
                matcher.put("object", currentLine[titleIndex.get("Path")]);
                matcher.put("event", currentLine[titleIndex.get("Operation")]);
                matcher.put("details", currentLine[titleIndex.get("Detail")]);
                String duration = currentLine[titleIndex.get("Duration")];
                matcher.put("eventclass", currentLine[titleIndex.get("Event Class")]);
                matcher.put("latency", duration);
                matcher.put("parentPID", currentLine[titleIndex.get("Parent PID")]);
                if (hasCmd) matcher.put("cmdLine", currentLine[titleIndex.get("Command Line")]);
                matcher.put("eventno", Integer.toString(seq++));

                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a z", Locale.US);
                try {
                    String timeString = currentLine[titleIndex.get("Date & Time")];
                    String microSeconds = currentLine[titleIndex.get("Time of Day")].split("\\.|\\s")[1];
                    Date parsedDate = dateFormat.parse(timeString + " " + timezone);
                    long timestamp = parsedDate.getTime()/1000;
                    String startTime = timestamp+"" + "." + microSeconds;
                    double dur = Double.parseDouble(duration);
                    double temp =Double.parseDouble("." + microSeconds);
                    double endTime = dur + temp;
                    String endTimeFractional = String.format("%.7f", endTime).split("\\.")[1];
                    long cat = Double.valueOf(endTime).longValue();
                    long endTimestamp = timestamp + cat;
                    matcher.put("timestamp", startTime);
                    matcher.put("endTimestamp", endTimestamp+"" + "." + endTimeFractional);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if(!matcher.isEmpty()) {
                    try {
                        processEvent(matcher);
                    } catch (Exception e) {
//                  e.printStackTrace();
//                  System.out.println(e.getMessage());
                    }
                }
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Parsing(in parser) time Cost:"+(end-start)/1000.0);
    }

    private void processEvent(Map<String, String> event) throws UnknownEventException {
        Entity[] eventEntities = extractEntities(event);

        //fingerprint should be event_type + start_class + end_class
        Fingerprint f;
        if(eventEntities[1] != null) {
            f = new Fingerprint(event.get("event"), eventEntities[1].getClass(), null);
        } else {
            f = new Fingerprint(event.get("event"), null, null);
        }
        WinSyscall systemCall = answering.getOrDefault(f, null);
        if (systemCall == null) {
            throw new UnknownEventException("Unknown event: "+event.get("event"));
        } else {
            systemCall.react(eventEntities, event);
        }
    }

    private Entity[] extractEntities(Map<String, String> m){
        Entity[] res = new Entity[2];

        //extract process
        long id = 0L;
        String pid = m.get("pid");
        String process = m.get("process");
        String processKey = pid+process;
        String[] timestamp = m.get("timestamp").split("\\.");
        String exePath = m.get("exepath");
        String cmdLind = m.get("cmdLine");
        res[0] = processes.computeIfAbsent(processKey,key ->new ProcessEntity( id, pid,
                null, null, null, timestamp[0], timestamp[1], process, UID++, exePath, cmdLind));

        String pathOrIp = m.get("object");

        //extract networkIps
        res[1] = null;
        if (m.get("eventclass").equals("Network")) {
            String IPString = pathOrIp.replaceAll("\\s", "");
            String sourceIP;
            String sourcePort;
            String desIP;
            String desPort;

            if (pathOrIp.matches(MetaConfig.procmonIPv4Regex)) {
                String[] srcAndDest = IPString.split("->");
                String[] src = srcAndDest[0].split(":");
                String[] dest = srcAndDest[1].split(":");
                sourceIP = src[0];
                sourcePort = src[1];
                desIP = dest[0];
                desPort = dest[1];
                res[1] = networks.computeIfAbsent(IPString,
                        key -> new NetworkEntity( id, timestamp[0], timestamp[1], sourceIP, desIP, sourcePort, desPort, UID++));
            } else if (pathOrIp.matches(MetaConfig.procmonIPv6Regex)) {
                String[] srcAndDest = IPString.split("->");
                String[] src = srcAndDest[0].split(":");
                String[] dest = srcAndDest[1].split(":");
                sourcePort = src[src.length - 1];
                desPort = dest[dest.length - 1];
                sourceIP = srcAndDest[0].substring(0, srcAndDest[0].length() - sourcePort.length() - 1);
                desIP = srcAndDest[1].substring(0, srcAndDest[1].length() - desPort.length() - 1);
                res[1] = networks.computeIfAbsent(IPString,
                        key -> new NetworkEntity( id, timestamp[0], timestamp[1], sourceIP, desIP, sourcePort, desPort, UID++));
            }

        //extract file path
        } else if(!pathOrIp.equals("") && (m.get("eventclass").equals("File System") || m.get("eventclass").equals("Process"))) {
            String[] fileNames = pathOrIp.split("\\\\");
            res[1] = files.computeIfAbsent(pathOrIp,
                    key -> new FileEntity( id, timestamp[0],
                            timestamp[1], null, null, pathOrIp, UID++, fileNames[fileNames.length - 1]));
        } else if(!pathOrIp.equals("") && m.get("eventclass").equals("Registry")) {
            res[1] = registries.computeIfAbsent(pathOrIp,
                    key -> new RegistryEntity( id, timestamp[0], timestamp[1], pathOrIp, UID++));
        }

        return res;
    }

    private <T extends EntityEvent> T extractEventInfo(T e, Map<String, String> eventMap,
                                                       Entity source, Entity sink) {
        long eventNo = Long.parseLong(eventMap.get("eventno"));
        String timestampStart = eventMap.get("timestamp");
        String timestampEnd = eventMap.get("endTimestamp");
        String event = eventMap.get("event");

        String details = eventMap.get("details");
        long size = ParserUtils.extractProcmonSize(details);

        e.setStartTime(timestampStart);
        e.setEndTime(timestampEnd);
        e.setSource(source);
        e.setSink(sink);
        e.setEvent(event);
        e.setSize(size);
        e.setEventNo(eventNo);
        return e;
    }

    private String extractEventKey(Map<String, String> map) {
        //TODO come up with a key in procmon log to uniquely identify an event.
        String timestampStart = map.get("timestamp");
        String event = map.get("event");
        String process = map.get("process");
        return timestampStart+":"+event + ":" + process;
    }

    private void addF2PEvent(Entity[] entities, Map<String, String> event) {
        FtoPEvent e = extractEventInfo(new FtoPEvent(), event, entities[1], entities[0]);
        fpEvent.put(extractEventKey(event), e);
    }

    private void addP2FEvent(Entity[] entities, Map<String, String> event) {
        PtoFEvent e = extractEventInfo(new PtoFEvent(), event, entities[0], entities[1]);
        if (e.getSize() != -1L) pfEvent.put(extractEventKey(event), e);
    }

    private void addP2NEvent(Entity[] entities, Map<String, String> event) {
        PtoNEvent e = extractEventInfo(new PtoNEvent(), event, entities[0], entities[1]);
        if (e.getSize() != -1L) pnEvent.put(extractEventKey(event), e);
    }

    private void addN2PEvent(Entity[] entities, Map<String, String> event) {
        NtoPEvent e = extractEventInfo(new NtoPEvent(), event, entities[1], entities[0]);
        if (e.getSize() != -1L) npEvent.put(extractEventKey(event), e);
    }

    private void addP2REvent(Entity[] entities, Map<String, String> event) {
        PtoREvent e = extractEventInfo(new PtoREvent(), event, entities[0], entities[1]);
        if (e.getSize() != -1L) prEvent.put(extractEventKey(event), e);
    }

    private void addR2PEvent(Entity[] entities, Map<String, String> event) {
        RtoPEvent e = extractEventInfo(new RtoPEvent(), event, entities[1], entities[0]);
        if (e.getSize() != -1L) rpEvent.put(extractEventKey(event), e);
    }

    public HashMap<String, PtoFEvent> getPtoFMap() {
        return this.pfEvent;
    }

    public HashMap<String, PtoNEvent> getPtoNMap() {
        return this.pnEvent;
    }

    public HashMap<String, PtoPEvent> getPtoPMap() {
        return this.ppEvent;
    }

    public HashMap<String, NtoPEvent> getNtoPMap() {
        return this.npEvent;
    }

    public HashMap<String, FtoPEvent> getFtoPMap() {
        return this.fpEvent;
    }

    public Map<String, FileEntity> getFileMap() {
        return this.files;
    }

    public Map<String, ProcessEntity> getProcessMap() {
        return this.processes;
    }

    public Map<String, NetworkEntity> getNetworkMap() {
        return this.networks;
    }

    public Map<String, RegistryEntity> getRegistryMap() {
        return this.registries;
    }

    public HashMap<String, PtoREvent> getPtoRMap() {
        return this.prEvent;
    }

    public HashMap<String, RtoPEvent> getRtoPMap() {
        return this.rpEvent;
    }
}
