package dk.mosberg.taob.component;

import net.minecraft.nbt.NbtCompound;

/**
 * Handles fluid content for items/blocks using NBT and data components.
 */
public class ModDataComponents {
    /**
     * FluidContent stores all fluid-related data for items/blocks.
     *
     * <p>
     * Fields: - fluidType: The type of fluid (e.g., "ale", "mead"). - amount: Current amount of
     * fluid. - maxAmount: Maximum capacity. - age: Age in ticks or cycles (for aging mechanics). -
     * stage: Fermentation or brewing stage.
     *
     * <p>
     * All fields are serialized to NBT for persistence.
     */
    public static class FluidContent {
        public String fluidType;
        public int amount;
        public int maxAmount;
        public int age;
        public int stage;

        public FluidContent(String fluidType, Integer amount, Integer maxAmount, Integer age,
                Integer stage) {
            this.fluidType = fluidType;
            this.amount = amount;
            this.maxAmount = maxAmount;
            this.age = age;
            this.stage = stage;
        }

        public NbtCompound toNbt() {
            NbtCompound nbt = new NbtCompound();
            nbt.putString("fluidType", fluidType);
            nbt.putInt("amount", amount);
            nbt.putInt("maxAmount", maxAmount);
            nbt.putInt("age", age);
            nbt.putInt("stage", stage);
            return nbt;
        }

        public static FluidContent fromNbt(NbtCompound nbt) {
            return new FluidContent(nbt.getString("fluidType"), nbt.getInt("amount"),
                    nbt.getInt("maxAmount"), nbt.getInt("age"), nbt.getInt("stage"));
        }
    }
}
