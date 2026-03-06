package model.registries;

import java.util.HashMap;
import java.util.Map;
import model.interfaces.DocumentPrototype;

public class DocumentRegistry {
    private final Map<String, DocumentPrototype> registry = new HashMap<>();

    //This allows to register the new DocumentPrototype into the map
    public void register(String name, DocumentPrototype prototype) {
        registry.put(name, prototype);
    }

    //This is the get method, that returns the object to be cloned
    public DocumentPrototype get(String name) {
        DocumentPrototype prototype = registry.get(name);
        if (prototype == null) {
            throw new RuntimeException("Prototype not found: " + name);
        }
        return prototype.cloneDoc();
    }
}
