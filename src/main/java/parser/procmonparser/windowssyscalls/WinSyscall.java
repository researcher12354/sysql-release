package parser.procmonparser.windowssyscalls;

import datamodel.Entity;
import parser.sysdigparser.syscalls.Fingerprint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WinSyscall {
    public String name;
    public String type;
    public Fingerprint fingerPrint;
    public List<ShortAction> shortActions;

    public WinSyscall(String name, String type, Fingerprint fingerPrint){
        this.name = name;
        this.type = type;
        this.fingerPrint = fingerPrint;
        this.shortActions = new ArrayList<>();
    }

    public WinSyscall addShortAction(ShortAction action){
        shortActions.add(action);
        return this;
    }


    public void react(Entity[] eventEntities, Map<String, String> event) {
        for(ShortAction action:shortActions)
            action.apply(eventEntities, event);
    }
}
