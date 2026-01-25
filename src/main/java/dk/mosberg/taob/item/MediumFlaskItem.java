package dk.mosberg.taob.item;

import dk.mosberg.taob.component.ModDataComponents;
import net.minecraft.item.Item;

/**
 * Base class for dynamically registered medium flask items.
 */
public class MediumFlaskItem extends Item {
    private final String woodType;
    private final String color;

    // Fluid content for this item instance
    private ModDataComponents.FluidContent fluidContent;

    public MediumFlaskItem(Settings settings, String woodType, String color) {
        super(settings);
        this.woodType = woodType;
        this.color = color;
        this.fluidContent = new ModDataComponents.FluidContent("", 0, 0, 0, 0);
    }

    public String getWoodType() {
        return woodType;
    }

    public String getColor() {
        return color;
    }

    public ModDataComponents.FluidContent getFluidContent() {
        return fluidContent;
    }

    public void setFluidContent(ModDataComponents.FluidContent content) {
        this.fluidContent = content;
    }

    // No static registry; use DynamicRegistry for registration
}
