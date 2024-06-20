package com.leclowndu93150.tea.common;

import com.leclowndu93150.tea.registry.ItemRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RedTeaCupItem extends Item {
    public RedTeaCupItem(Properties pProperties) {
        super(new Properties().food(new FoodProperties.Builder()
                .saturationModifier(0)
                .nutrition(0)
                .alwaysEdible()
                .usingConvertsTo(ItemRegistry.CUP)
                .effect(new MobEffectInstance(MobEffects.SATURATION, 1200), 1)
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

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.literal("Protects you from hunger for a whole minute !").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
