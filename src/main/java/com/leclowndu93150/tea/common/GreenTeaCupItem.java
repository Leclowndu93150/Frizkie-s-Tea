package com.leclowndu93150.tea.common;

import com.leclowndu93150.tea.registry.ItemRegistry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import org.jetbrains.annotations.NotNull;

import static com.leclowndu93150.tea.registry.MobEffectRegistry.POISON_IMMUNITY_EFFECT;

public class GreenTeaCupItem extends Item {
    public GreenTeaCupItem(Properties pProperties) {
        super(new Properties().food(new FoodProperties.Builder()
                .saturationModifier(0)
                .nutrition(0)
                .alwaysEdible()
                .usingConvertsTo(ItemRegistry.CUP)
                .effect(new MobEffectInstance(POISON_IMMUNITY_EFFECT, 600), 1)
                .build()));
    }

    @Override
    public int getMaxStackSize(@NotNull ItemStack stack) {
        return 1;
    }

    @Override
    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack pStack) {
        return UseAnim.DRINK;
    }

    @Override
    public int getUseDuration(@NotNull ItemStack pStack, @NotNull LivingEntity p_344979_) {
        return 40;
    }

    @Override
    public @NotNull SoundEvent getDrinkingSound() {
        return super.getDrinkingSound();
    }
}
