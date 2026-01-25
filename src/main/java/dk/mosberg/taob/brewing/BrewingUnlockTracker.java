package dk.mosberg.taob.brewing;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;

/**
 * Tracks brewing recipe unlocks per player.
 */
public class BrewingUnlockTracker {
    private static final String NBT_KEY = "taob_brewing_unlocks";

    // Get unlocked recipe IDs for a player
    public static Set<String> getUnlocked(ServerPlayerEntity player) {
        NbtCompound tag = player.getPersistentData();
        Set<String> unlocked = new HashSet<>();
        if (tag.contains(NBT_KEY)) {
            for (String id : tag.getCompound(NBT_KEY).getKeys()) {
                if (tag.getCompound(NBT_KEY).getBoolean(id)) {
                    unlocked.add(id);
                }
            }
        }
        return unlocked;
    }

    // Unlock a recipe for a player
    public static void unlock(ServerPlayerEntity player, String recipeId) {
        NbtCompound tag = player.getPersistentData();
        NbtCompound unlocks = tag.getCompound(NBT_KEY);
        unlocks.putBoolean(recipeId, true);
        tag.put(NBT_KEY, unlocks);
    }

    // Check if a recipe is unlocked
    public static boolean isUnlocked(ServerPlayerEntity player, String recipeId) {
        NbtCompound tag = player.getPersistentData();
        NbtCompound unlocks = tag.getCompound(NBT_KEY);
        return unlocks.getBoolean(recipeId);
    }
}
