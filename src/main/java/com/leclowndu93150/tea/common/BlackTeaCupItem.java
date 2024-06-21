package com.leclowndu93150.tea.common;

import com.leclowndu93150.tea.registry.ItemRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BlackTeaCupItem extends Item {
    public BlackTeaCupItem(Properties pProperties) {
        super(new Properties().food(new FoodProperties.Builder()
                .saturationModifier(0)
                .nutrition(0)
                .alwaysEdible()
                .usingConvertsTo(ItemRegistry.CUP)
                .build()));
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack pStack, @NotNull Level pLevel, LivingEntity pLivingEntity) {
        float newHealth = pLivingEntity.getHealth() + 4;
        pLivingEntity.setHealth(newHealth);
        return super.finishUsingItem(pStack, pLevel, pLivingEntity);
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
        pTooltipComponents.add(Component.literal("Heals you 2 full hearts !").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }

}
