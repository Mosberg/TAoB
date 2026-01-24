


package dk.mosberg.taob.block;

import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

/**
 * Base class for dynamically registered barrels.
 */
public class BarrelBlock extends Block {
    private final String woodType;
    private final String metalType;

    public BarrelBlock(Settings settings, String woodType, String metalType) {
        super(settings);
        this.woodType = woodType;
        this.metalType = metalType;
    }

    public String getWoodType() {
        return woodType;
    }

    public String getMetalType() {
        return metalType;
    }

    // Registry for all dynamically created barrel blocks
    public static final Map<Identifier, BarrelBlock> BARREL_BLOCKS = new LinkedHashMap<>();

    public static void register(Identifier id, BarrelBlock block) {
        BARREL_BLOCKS.put(id, block);
        // Registration with Fabric/MC registry should be handled elsewhere
    }
}
