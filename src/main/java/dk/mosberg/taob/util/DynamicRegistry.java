package dk.mosberg.taob.util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Utility for dynamic runtime registration of mod content (blocks, items, etc.). Supports
 * resource-driven and config-driven extensibility.
 */
public class DynamicRegistry<T> {
    private final Map<String, T> registry = new HashMap<>();
    private final Consumer<T> registerAction;

    public DynamicRegistry(Consumer<T> registerAction) {
        this.registerAction = registerAction;
    }

    public void register(String id, T entry) {
        registry.put(id, entry);
        registerAction.accept(entry);
    }

    public T get(String id) {
        return registry.get(id);
    }

    public Map<String, T> getAll() {
        return registry;
    }
}
