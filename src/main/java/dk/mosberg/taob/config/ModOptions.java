package dk.mosberg.taob.config;

/**
 * User-facing options and toggles for mod features.
 */
/**
 * ModOptions exposes user-facing toggles for mod features (e.g., overlays, tooltips).
 *
 * <p>
 * Document all options in the README and config UI.
 * </p>
 */
public class ModOptions {
    // Example: user-facing toggles
    public static boolean overlaysEnabled = true;
    public static boolean showFluidAmounts = true;
    public static boolean enablePotencyColors = true;

    public static void loadOptions(String filePath) {
        // Stub: load options from config file
        System.out.println("Loading options from: " + filePath);
    }
}
