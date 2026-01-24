package dk.mosberg.taob.registry;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dk.mosberg.taob.TAoB;

public final class RegistryManifest {
    private static final Gson GSON = new Gson();
    private static final String CLASSPATH_PATH =
            "/data/" + TAoB.MOD_ID + "/taob_registry_manifest.json";

    private RegistryManifest() {}

    public static JsonObject loadOrThrow() {
        try (var in = RegistryManifest.class.getResourceAsStream(CLASSPATH_PATH)) {
            if (in == null)
                throw new IllegalStateException("Missing resource " + CLASSPATH_PATH);
            try (var reader = new InputStreamReader(in, StandardCharsets.UTF_8)) {
                return GSON.fromJson(reader, JsonObject.class);
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load registry manifest from " + CLASSPATH_PATH,
                    e);
        }
    }

    public static java.util.List<String> getStringList(JsonObject root, String key) {
        if (!root.has(key) || !root.get(key).isJsonArray())
            return java.util.List.of();
        var arr = root.getAsJsonArray(key);
        var out = new java.util.ArrayList<String>(arr.size());
        for (var el : arr)
            out.add(el.getAsString());
        return out;
    }
}
