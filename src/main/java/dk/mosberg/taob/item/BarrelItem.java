


package dk.mosberg.taob.item;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;

/**
 * Base class for dynamically registered barrel items.
 */
public class BarrelItem extends BlockItem {
    public BarrelItem(Block block, Settings settings) {
        super(block, settings);
    }

    // Registry for all dynamically created barrel items
    public static final Map<Identifier, BarrelItem> BARREL_ITEMS = new LinkedHashMap<>();

    public static void register(Identifier id, BarrelItem item) {
        BARREL_ITEMS.put(id, item);
        // Registration with Fabric/MC registry should be handled elsewhere
    }
}
