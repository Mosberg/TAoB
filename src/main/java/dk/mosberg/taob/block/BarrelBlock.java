package dk.mosberg.taob.block;

import dk.mosberg.taob.component.ModDataComponents;
import net.minecraft.block.Block;

/**
 * Base class for dynamically registered barrels.
 */
public class BarrelBlock extends Block {
    private final String woodType;
    private final String metalType;

    // Fluid content for this block instance (for demo; real impl may use block entity)
    private ModDataComponents.FluidContent fluidContent;

    public BarrelBlock(Settings settings, String woodType, String metalType) {
        super(settings);
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
