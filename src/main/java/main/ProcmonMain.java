package main;

import db.Neo4j;
import org.jgrapht.graph.DirectedPseudograph;
import datamodel.*;
import db.Postgres;
import graph.ProcmonGraph;
import parser.procmonparser.ProcessProcmonParserOutput;

import java.io.IOException;
import java.util.*;

public class ProcmonMain {

    private static void mergeEdges(DirectedPseudograph<EntityNode, EventEdge> input, List<EventEdge> processFileList, List<EventEdge> processNetworkList, List<EventEdge> processProcessList, List<EventEdge> processRegistryList){

        Set<EventEdge> edgeSet = input.edgeSet();
        List<EventEdge> edgeList = new LinkedList<>(edgeSet);
        for (EventEdge e : edgeList) {
            switch (e.getType()) {
                case "PtoF":
                case "FtoP":
                    processFileList.add(e);
                    break;
                case "PtoN":
                case "NtoP":
                    processNetworkList.add(e);
                    break;
                case "PtoR":
                case "RtoP":
                    processRegistryList.add(e);
                    break;
                case "PtoP":
                    processProcessList.add(e);
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("#################ProcmonMain Start...#################");
        String logFile = "input/procmon_log/shorter.csv";
        String timezone = "PST";

        ProcessProcmonParserOutput parserOutput = new ProcessProcmonParserOutput(logFile, timezone);
        Map<String, FileEntity> fileMap = parserOutput.getFileMap(); // str representation of file: file path
        Map<String, NetworkEntity> networkMap = parserOutput.getNetworkMap(); // str representation of process: pid + procname
        Map<String, ProcessEntity> processMap = parserOutput.getProcessMap();
        Map<String, RegistryEntity> registryMap = parserOutput.getRegistryMap();
        List<EventEdge> processFileLst = new ArrayList<>();
        List<EventEdge> processNetworkLst = new ArrayList<>();
        List<EventEdge> processProcessLst = new ArrayList<>();
        List<EventEdge> processRegistryLst = new ArrayList<>();

        ProcmonGraph graph = new ProcmonGraph(parserOutput);
        graph.GenerateGraph();
        mergeEdges(graph.getJg(), processFileLst, processNetworkLst, processProcessLst, processRegistryLst);

//        System.out.println("---------------------Start to generate postgres DB...");
//        Postgres postgres = new Postgres(fileMap, networkMap, processMap, registryMap, processFileLst, processNetworkLst, processProcessLst, processRegistryLst);
//        postgres.createDb();

        //Generate Neo4j database
        System.out.println("---------------------Start to generate neo4j DB...");
        Neo4j neo4jDb = new Neo4j(fileMap, networkMap, processMap, registryMap, processFileLst, processNetworkLst, processProcessLst, processRegistryLst);
        try {
            neo4jDb.createDb("neo4j");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}