package com.leclowndu93150.tea.common;

import com.leclowndu93150.tea.registry.MobEffectRegistry;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.Nullable;

import static com.leclowndu93150.tea.registry.MobEffectRegistry.POISON_IMMUNITY_EFFECT;

public class GreenTeaCupItem extends Item {
    public GreenTeaCupItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public @Nullable FoodProperties getFoodProperties(ItemStack stack, @Nullable LivingEntity entity) {
        return new FoodProperties.Builder()
                .nutrition(0)
                .alwaysEdible()
                .saturationModifier(0)
                .effect(new MobEffectInstance(POISON_IMMUNITY_EFFECT.get(), 20 * 30, 0), 1)
                .build();
    }
}
