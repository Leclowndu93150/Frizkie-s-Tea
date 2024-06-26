package com.leclowndu93150.tea.common;

import com.leclowndu93150.tea.registry.ItemRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

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
        return 8;
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
        pTooltipComponents.add(Component.literal("Gives you poison immunity for 30 seconds !").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }

}
