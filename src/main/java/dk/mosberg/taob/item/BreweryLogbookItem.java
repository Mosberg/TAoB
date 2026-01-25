package dk.mosberg.taob.item;

import java.util.Set;
import dk.mosberg.taob.brewing.BrewingUnlockTracker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

/**
 * Brewery Logbook item: shows unlocked brewing recipes for the player. Extensible via data for
 * future features.
 */
public class BreweryLogbookItem extends Item {
    public BreweryLogbookItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        PlayerEntity player = context.getPlayer();
        World world = context.getWorld();
        if (!world.isClient && player instanceof ServerPlayerEntity serverPlayer) {
            Set<String> unlocked = BrewingUnlockTracker.getUnlocked(serverPlayer);
            if (unlocked.isEmpty()) {
                player.sendMessage(Text.translatable("item.taob.brewery_logbook.empty"), false);
            } else {
                player.sendMessage(Text.translatable("item.taob.brewery_logbook.header"), false);
                for (String recipeId : unlocked) {
                    // In a real mod, look up recipe name from data
                    player.sendMessage(Text.literal("- " + recipeId), false);
                }
            }
        }
        return ActionResult.SUCCESS;
    }
}
