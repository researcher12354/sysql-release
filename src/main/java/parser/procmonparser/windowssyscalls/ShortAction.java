package parser.procmonparser.windowssyscalls;

import datamodel.Entity;

import java.util.Map;

public interface ShortAction {
    void apply(Entity[] eventEntities, Map<String, String> event);
}
