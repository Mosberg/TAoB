package dk.mosberg.taob.brewing;

import java.util.HashSet;
import java.util.Set;
import dk.mosberg.taob.component.ModDataComponents;
import net.minecraft.server.network.ServerPlayerEntity;

/**
 * Tracks brewing recipe unlocks per player.
 */
public class BrewingUnlockTracker {
    // Get unlocked recipes for a player
    @SuppressWarnings("unchecked")
    public static Set<String> getUnlocked(ServerPlayerEntity player) {
        if (player == null)
            return new HashSet<>();
        Set<String> unlocks = (Set<String>) ModDataComponents.BREWING_UNLOCKS;
        if (unlocks == null) {
            return new HashSet<>();
        }
        return unlocks;
    }

    // Unlock a recipe for a player
    public static void unlock(ServerPlayerEntity player, String recipeId) {
        if (player == null || recipeId == null)
            return;
        Set<String> unlocks = new HashSet<>(getUnlocked(player));
        unlocks.add(recipeId);
    }


    // Check if a recipe is unlocked
    public static boolean isUnlocked(ServerPlayerEntity player, String recipeId) {
        if (player == null || recipeId == null)
            return false;
        return getUnlocked(player).contains(recipeId);
    }
}
