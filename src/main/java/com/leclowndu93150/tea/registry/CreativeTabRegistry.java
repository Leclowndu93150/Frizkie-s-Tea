package com.leclowndu93150.tea.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.leclowndu93150.tea.TeaMain.MODID;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TEA_TAB = CREATIVE_MODE_TABS.register("tea_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.tea"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemRegistry.GREEN_TEA_BLEND.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.GREEN_TEA_BLEND.get());
                output.accept(ItemRegistry.BLACK_TEA_BLEND.get());
                output.accept(ItemRegistry.RED_TEA_BLEND.get());
                output.accept(ItemRegistry.BLACK_TEA_CUP.get());
                output.accept(ItemRegistry.GREEN_TEA_CUP.get());
                output.accept(ItemRegistry.RED_TEA_CUP.get());
                output.accept(ItemRegistry.BOILING_WATER_CUP.get());
                output.accept(ItemRegistry.CUP.get());
                output.accept(ItemRegistry.CLAY_CUP.get());
                output.accept(ItemRegistry.WATER_CUP.get());
                output.accept(ItemRegistry.COFFEE_CUP.get());
            }).build());

}
