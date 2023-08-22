package graph;

import org.jgrapht.graph.DirectedPseudograph;
import datamodel.*;
import parser.procmonparser.ProcessProcmonParserOutput;
import java.util.HashMap;
import java.util.Map;

public class ProcmonGraph {

    public DirectedPseudograph<EntityNode, EventEdge> jg;
    private HashMap<Long,EntityNode> entityNodeMap;
    private ProcessProcmonParserOutput procmonProcess;
    public EntityNode POIEvent;


    public ProcmonGraph(ProcessProcmonParserOutput parserOutput){
        jg = new DirectedPseudograph<>(EventEdge.class);
        POIEvent = null;
        entityNodeMap = new HashMap<>();
        procmonProcess = parserOutput;

    }


    public DirectedPseudograph<EntityNode, EventEdge> getJg() {
        return jg;
    }

    public void GenerateGraph(){
        addFileToProcessEvent(procmonProcess.getFileProcessMap());
        addNetworkToProcessEvent(procmonProcess.getNetworkProcessMap());
        addProcessToFileEvent(procmonProcess.getProcessFileMap());
        addProcessToProcessEvent(procmonProcess.getProcessProcessMap());
        addProcessToNetworkEvent(procmonProcess.getProcessNetworkMap());
        addProcessToRegistryEvent(procmonProcess.getProcessRegistryMap());
        addRegistryToProcessEvent(procmonProcess.getRegistryProcessMap());
        assignEdgeId();
    }

    private void assignEdgeId(){
        long edgeID = 1;
        for (EventEdge e : jg.edgeSet()){
            e.id = edgeID;
            edgeID++;
        }
    }

    //TODO: maybe we don't need this method.
    private EntityNode createNodeFromEntity(Entity e) {
        if (e instanceof FileEntity) return new EntityNode(e);
        if (e instanceof ProcessEntity) return new EntityNode(e);
        if (e instanceof NetworkEntity) return new EntityNode(e);
        if (e instanceof RegistryEntity) return new EntityNode(e);
        return null;
    }

    private void addEventToGraph(EntityEvent event, EventEdge edge, boolean reverse) {
        EntityNode source, sink;
        if (entityNodeMap.containsKey(event.getSource().getUniqID())) {
            source = entityNodeMap.get(event.getSource().getUniqID());
        } else {
            source = createNodeFromEntity(event.getSource());
            entityNodeMap.put(source.getID(), source);
        }

        if (entityNodeMap.containsKey(event.getSink().getUniqID())) {
            sink = entityNodeMap.get(event.getSink().getUniqID());
        } else {
            sink = createNodeFromEntity(event.getSink());
            entityNodeMap.put(sink.getID(), sink);
        }

        if (reverse) {
            EntityNode temp = source;
            source = sink;
            sink = temp;
        }
        jg.addVertex(source);
        jg.addVertex(sink);
        jg.addEdge(source, sink, edge);
    }

    private void addProcessToFileEvent(Map<String, PtoFEvent> pfmap) {
        for(PtoFEvent event: pfmap.values()){
            EventEdge edge = new EventEdge(event);
            addEventToGraph(event, edge, false);
        }
    }

    private void addFileToProcessEvent(Map<String, FtoPEvent> fpmap) {
        for(FtoPEvent event: fpmap.values()){
            EventEdge edge = new EventEdge(event);
            addEventToGraph(event, edge, true);
        }
    }

    private void addProcessToProcessEvent(Map<String, PtoPEvent> ppmap) {
        for(PtoPEvent event: ppmap.values()){
            EventEdge edge = new EventEdge(event);
            addEventToGraph(event, edge, false);
        }
    }

    private void addNetworkToProcessEvent(Map<String, NtoPEvent> npmap) {
        for(NtoPEvent event: npmap.values()){
            EventEdge edge = new EventEdge(event);
            addEventToGraph(event, edge, true);
        }
    }

    private void addProcessToNetworkEvent(Map<String, PtoNEvent> pnmap) {
        for(PtoNEvent event: pnmap.values()){
            EventEdge edge = new EventEdge(event);
            addEventToGraph(event, edge, false);
        }
    }

    private void addRegistryToProcessEvent(Map<String, RtoPEvent> rpmap) {
        for(RtoPEvent event: rpmap.values()){
            EventEdge edge = new EventEdge(event);
            addEventToGraph(event, edge, true);
        }
    }

    private void addProcessToRegistryEvent(Map<String, PtoREvent> prmap) {
        for(PtoREvent event: prmap.values()){
            EventEdge edge = new EventEdge(event);
            addEventToGraph(event, edge, false);
        }
    }
}
