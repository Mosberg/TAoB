package dk.mosberg.taob.util;

import java.io.FileReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Utility to automate recipe registration from JSON files. (Stub: actual MC/Fabric registration
 * logic must be added)
 */
public class RecipeRegistrar {
    private static final Logger LOGGER = LoggerFactory.getLogger("taob");

    public static void registerRecipe(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
            // TODO: Register recipe with Minecraft/Fabric API
            LOGGER.info("Loaded recipe: {}", filePath);
        } catch (Exception e) {
            LOGGER.error("Failed to load recipe: {}", filePath, e);
        }
    }
}
