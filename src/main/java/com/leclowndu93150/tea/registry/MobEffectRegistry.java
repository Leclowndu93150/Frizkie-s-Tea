package com.leclowndu93150.tea.registry;

import com.leclowndu93150.tea.common.PoisonImmunityEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.leclowndu93150.tea.TeaMain.MODID;

public class MobEffectRegistry {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, MODID);
    public static final Supplier<PoisonImmunityEffect> POISON_IMMUNITY_EFFECT = MOB_EFFECTS.register("poison_immunity", () -> new PoisonImmunityEffect(
            MobEffectCategory.BENEFICIAL,
            0xFFDE8F
    ));
}
