package dk.mosberg.taob.item;

import dk.mosberg.taob.component.ModDataComponents;
import net.minecraft.item.Item;

/**
 * Base class for dynamically registered small flask items.
 */
public class SmallFlaskItem extends Item {
    private final String woodType;
    private final String color;

    // Fluid content for this item instance
    private ModDataComponents.FluidContent fluidContent;

    public SmallFlaskItem(Settings settings, String woodType, String color) {
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

    /**
     * Attempts to mix the contents of this flask with another flask. If a valid mix is found,
     * updates this flask's fluid content to the result. Returns true if a mix occurred.
     */
    public boolean tryMixWith(SmallFlaskItem other) {
        var myFluid = this.getFluidContent();
        var otherFluid = other.getFluidContent();
        String result = dk.mosberg.taob.TAoB.getFluidMixResult(myFluid.fluidType, myFluid.amount,
                otherFluid.fluidType, otherFluid.amount);
        if (result != null) {
            // For simplicity, set to result, sum amounts, reset age/stage
            this.setFluidContent(new dk.mosberg.taob.component.ModDataComponents.FluidContent(
                    result, myFluid.amount + otherFluid.amount,
                    myFluid.maxAmount + otherFluid.maxAmount, 0, 0));
            return true;
        }
        return false;
    }
}
