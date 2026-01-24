package dk.mosberg.taob.config;

import java.util.HashMap;
import java.util.Map;

/**
 * Central mod config class. Holds toggles and settings for gameplay, mechanics, and features.
 */
/**
 * ModConfigs manages all gameplay toggles and settings for The Art of Brewing.
 *
 * <p>
 * Keys should be documented in the README and/or config UI. Example keys: "enableAging",
 * "allowOverlays", "progressionUnlocked".
 * </p>
 */
public class ModConfigs {
    private static final Map<String, Boolean> toggles = new HashMap<>();
    private static final Map<String, Object> settings = new HashMap<>();

    public static void setToggle(String key, boolean value) {
        toggles.put(key, value);
    }

    public static boolean getToggle(String key, boolean defaultValue) {
        return toggles.getOrDefault(key, defaultValue);
    }

    public static void setSetting(String key, Object value) {
        settings.put(key, value);
    }

    public static Object getSetting(String key, Object defaultValue) {
        return settings.getOrDefault(key, defaultValue);
    }
}
