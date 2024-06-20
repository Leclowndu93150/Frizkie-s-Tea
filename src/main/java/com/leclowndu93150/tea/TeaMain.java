package com.leclowndu93150.tea;

import com.leclowndu93150.tea.registry.CreativeTabRegistry;
import com.leclowndu93150.tea.registry.ItemRegistry;
import com.leclowndu93150.tea.registry.MobEffectRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(TeaMain.MODID)
public class TeaMain
{
    public static final String MODID = "tea";

    public TeaMain(IEventBus modEventBus)
    {
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        MobEffectRegistry.MOB_EFFECTS.register(modEventBus);
    }

}
