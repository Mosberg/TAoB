package dk.mosberg.taob.util;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Loads and provides access to dynamic fluid properties (viscosity, color, interactions, etc.) from
 * resource files.
 */
public class FluidPropertiesLoader {
    private static final Logger LOGGER = LoggerFactory.getLogger("taob");
    private final Map<String, JsonObject> fluidProperties = new HashMap<>();

    public void loadFluidProperties(Path dir) {
        try {
            var files = ResourceScanner.scan(dir, p -> p.toString().endsWith(".json"));
            for (Path path : files) {
                try (BufferedReader reader = Files.newBufferedReader(path)) {
                    JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
                    String fluidId = obj.get("fluid").getAsString();
                    fluidProperties.put(fluidId, obj);
                } catch (Exception e) {
                    LOGGER.error("Failed to load fluid properties from {}", path, e);
                }
            }
            LOGGER.info("Loaded {} fluid property definitions.", fluidProperties.size());
        } catch (Exception e) {
            LOGGER.error("Failed to scan fluid properties directory", e);
        }
    }

    public JsonObject getFluidProperties(String fluidId) {
        return fluidProperties.get(fluidId);
    }

    public Map<String, JsonObject> getAll() {
        return fluidProperties;
    }
}
