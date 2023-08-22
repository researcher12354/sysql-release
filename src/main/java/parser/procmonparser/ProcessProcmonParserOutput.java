package parser.procmonparser;

import datamodel.*;
import parser.sysdigparser.SysdigOutputParser;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProcessProcmonParserOutput {
    private Map<String, PtoFEvent> processFileMap;
    private Map<String, PtoNEvent> processNetworkMap;  // this event direction is decided by the information flow direction
    private Map<String, PtoPEvent> processProcessMap;
    private Map<String, NtoPEvent> networkProcessMap;  // this event direction is decided by the information flow direction
    private Map<String, PtoREvent> prmap;
    private Map<String, RtoPEvent> rpmap;
    private Map<String, FtoPEvent> fileProcessMap;
    private SysdigOutputParser parser;

    private Map<String, FileEntity> fileMap;
    private Map<String, ProcessEntity> processMap;
    private Map<String, NetworkEntity> networkMap;
    private Map<String, RegistryEntity> registryMap;

    public ProcessProcmonParserOutput(String logFilePath, String timezone){
        parser = new ProcmonOutputParser(logFilePath, timezone);
        try {
            parser.getEntities();
        } catch (IOException e){
            System.out.println("The log file doesn't exist");
        }
        processFileMap = parser.getPtoFMap();
        processNetworkMap = parser.getPtoNMap();
        processProcessMap = parser.getPtoPMap();
        networkProcessMap = parser.getNtoPMap();
        fileProcessMap = parser.getFtoPMap();
        prmap = parser.getPtoRMap();
        rpmap = parser.getRtoPMap();

        processNetworkMap = new HashMap<>();
        networkProcessMap = new HashMap<>();

        fileMap = parser.getFileMap();
        processMap = parser.getProcessMap();
        networkMap = parser.getNetworkMap();
        registryMap = parser.getRegistryMap();
    }
    public Map<String, PtoFEvent> getProcessFileMap() {
        return processFileMap;
    }

    public Map<String, PtoNEvent> getProcessNetworkMap() {
        return processNetworkMap;
    }

    public Map<String, PtoPEvent> getProcessProcessMap() {
        return processProcessMap;
    }

    public Map<String, NtoPEvent> getNetworkProcessMap() {
        return networkProcessMap;
    }

    public Map<String, FtoPEvent> getFileProcessMap() {
        return fileProcessMap;
    }

    public Map<String, RtoPEvent> getRegistryProcessMap() {
        return rpmap;
    }

    public Map<String, PtoREvent> getProcessRegistryMap() {
        return prmap;
    }

    public Map<String, FileEntity> getFileMap() {
        return fileMap;
    }

    public Map<String, ProcessEntity> getProcessMap() {
        return processMap;
    }

    public Map<String, NetworkEntity> getNetworkMap() {
        return networkMap;
    }

    public Map<String, RegistryEntity> getRegistryMap() {
        return registryMap;
    }

    public SysdigOutputParser getParser() { return parser; }

}
