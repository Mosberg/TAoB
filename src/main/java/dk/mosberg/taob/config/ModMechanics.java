package dk.mosberg.taob.config;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
/**
 * Handles advanced brewing mechanics (fermentation, aging, infusion, potency, etc.). Loads mechanic
 * definitions from JSON or config.
 */
/**
 * ModMechanics handles advanced brewing logic: fermentation, aging, infusion, potency, etc.
 *
 * <p>
 * Mechanics are loaded from JSON schemas/templates in src/schemas/mechanics/ and
 * src/templates/mechanics/.
 * </p>
 */
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ModMechanics {
    // Aging mechanic parameters (populated from JSON)
    private static AgingConfig agingConfig = new AgingConfig();

    // Loads mechanics from a JSON file (now supports aging config)
    @SuppressWarnings("null")
    public static void loadMechanics(String filePath) {
        try (FileReader reader = new FileReader(filePath)) {
            Gson gson = new Gson();
            JsonObject root = gson.fromJson(reader, JsonObject.class);
            if (root.has("aging")) {
                JsonObject aging = root.getAsJsonObject("aging");
                agingConfig.speed = aging.has("speed") ? aging.get("speed").getAsInt() : 20;
                agingConfig.qualityBoost =
                        aging.has("qualityBoost") ? aging.get("qualityBoost").getAsDouble() : 0.1;
                if (aging.has("eligibleFluids")) {
                    for (var e : aging.getAsJsonArray("eligibleFluids")) {
                        String fluid = e.getAsString();
                        agingConfig.eligibleFluids.put(fluid, true);
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Failed to load mechanics: " + e.getMessage());
        }
    }

    // Query: Is a fluid eligible for aging?
    public static boolean isAgingEligible(String fluidId) {
        return agingConfig.eligibleFluids.getOrDefault(fluidId, false);
    }

    // Query: Get aging speed (ticks per stage)
    public static int getAgingSpeed() {
        return agingConfig.speed;
    }

    // Query: Get quality boost per stage
    public static double getAgingQualityBoost() {
        return agingConfig.qualityBoost;
    }

    // Example mechanic: alcohol potency
    public static int getAlcoholPotency(String fluidType) {
        // Stub: return potency based on fluid type
        if (fluidType.contains("strong"))
            return 3;
        if (fluidType.contains("weak"))
            return 1;
        return 2;
    }

    // Example mechanic: overlay logic
    public static String getOverlayKey(String flaskSize) {
        return switch (flaskSize) {
            case "small" -> "overlay.taob.fluid.small_flask_fluid_overlay";
            case "medium" -> "overlay.taob.fluid.medium_flask_fluid_overlay";
            case "large" -> "overlay.taob.fluid.large_flask_fluid_overlay";
            default -> "";
        };
    }

    // Aging config structure
    private static class AgingConfig {
        int speed = 20; // ticks per stage
        double qualityBoost = 0.1; // per stage
        Map<String, Boolean> eligibleFluids = new HashMap<>();
    }

    // Stub: Barrel tick logic integration point
    public static void tickBarrelAging(String fluidId) {
        if (!isAgingEligible(fluidId))
            return;
        // Here you would increment barrel "age" and apply quality boost
        // This is a stub for integration with BarrelBlock/BarrelItem
    }
}
