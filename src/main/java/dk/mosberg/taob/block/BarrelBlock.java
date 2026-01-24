


package dk.mosberg.taob.block;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

/**
 * Base class for dynamically registered barrels.
 */
public class BarrelBlock extends Block {
    public BarrelBlock(Settings settings) {
        super(settings);
    }

    // Registry for all dynamically created barrel blocks
    public static final Map<Identifier, BarrelBlock> BARREL_BLOCKS = new LinkedHashMap<>();

    public static void register(Identifier id, BarrelBlock block) {
        BARREL_BLOCKS.put(id, block);
        // Registration with Fabric/MC registry should be handled elsewhere
    }
}
