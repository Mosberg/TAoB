package dk.mosberg.taob.item;

import dk.mosberg.taob.component.ModDataComponents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

/**
 * Base class for dynamically registered barrel items.
 */
public class BarrelItem extends BlockItem {
    private final String woodType;
    private final String metalType;

    // Fluid content for this item instance
    private ModDataComponents.FluidContent fluidContent;

    public BarrelItem(Block block, Settings settings, String woodType, String metalType) {
        super(block, settings);
        this.woodType = woodType;
        this.metalType = metalType;
        this.fluidContent = new ModDataComponents.FluidContent("", 0, 0, 0, 0);
    }

    public String getWoodType() {
        return woodType;
    }

    public String getMetalType() {
        return metalType;
    }

    public ModDataComponents.FluidContent getFluidContent() {
        return fluidContent;
    }

    public void setFluidContent(ModDataComponents.FluidContent content) {
        this.fluidContent = content;
    }

    // No static registry; use DynamicRegistry for registration
}
