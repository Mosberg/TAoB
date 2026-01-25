package dk.mosberg.taob.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

/**
 * Custom "Tipsy" status effect for alcohol consumption. Properties should be loaded dynamically
 * from JSON for extensibility.
 */
public class TipsyStatusEffect extends StatusEffect {
    public TipsyStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        // Example: apply mild confusion and movement boost
        if (!entity.getWorld().isClient) {
            // You can add logic here for confusion, slurred movement, etc.
            // For now, this is a stub for future expansion
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
