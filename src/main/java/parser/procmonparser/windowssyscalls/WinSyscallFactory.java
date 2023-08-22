package parser.procmonparser.windowssyscalls;

import parser.sysdigparser.syscalls.Fingerprint;

import java.util.ArrayList;
import java.util.List;

public class WinSyscallFactory {
    private static long id = 0;
    private String type;
    private List<ShortAction> shortActions;
    private Class cStart;
    private Class cEnd;

    public WinSyscallFactory(String type, Class c1, Class c2){
        this.type = type;
        this.shortActions = new ArrayList<>();
        cStart = c1;
        cEnd = c2;
    }

    public WinSyscallFactory addShortAction(ShortAction action){
        shortActions.add(action);
        return this;
    }

    public WinSyscall getWinOperation(String event) {
        WinSyscall instance = new WinSyscall(""+id++, type,
                new Fingerprint(event, cStart, cEnd));
        for(ShortAction action : shortActions)
            instance = instance.addShortAction(action);
        return instance;
    }
}
