package dk.mosberg.taob.config;

/**
 * Stores persistent mod settings (e.g., progression, unlocked recipes, etc.).
 */
/**
 * ModSettings stores persistent mod state (progression, unlocked recipes, etc.).
 *
 * <p>
 * Document all settings keys and their effects.
 * </p>
 */
public class ModSettings {
    // Example: persistent unlocked recipes and user settings
    public static java.util.Set<String> unlockedRecipes = new java.util.HashSet<>();
    public static int lastAlcoholPotency = 0;
    public static String lastUsedFlask = "";

    public static void loadSettings(String filePath) {
        // Stub: load settings from file
        System.out.println("Loading settings from: " + filePath);
    }
}
