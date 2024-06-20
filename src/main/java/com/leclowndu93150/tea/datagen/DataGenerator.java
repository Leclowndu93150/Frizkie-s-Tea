package com.leclowndu93150.tea.datagen;

import com.leclowndu93150.tea.TeaMain;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        net.minecraft.data.DataGenerator generator = event.getGenerator();
        event.getGenerator().addProvider(event.includeServer(), new LanguageProvider(generator.getPackOutput(), TeaMain.MODID, "en_us") {
            @Override
            protected void addTranslations() {
                add("itemGroup.tea", "Frizkie's Tea");
                add("item.tea.boiled_water_bucket", "Boiled Water Bucket");
                add("item.tea.boiled_water_cup", "Boiled Water Cup");
                add("item.tea.black_tea_blend", "Black Tea Blend");
                add("item.tea.red_tea_blend", "Red Tea Blend");
                add("item.tea.green_tea_blend", "Green Tea Blend");
                add("item.tea.black_tea_cup", "Cup of Green Tea");
                add("item.tea.red_tea_cup", "Cup of Red Tea");
                add("item.tea.green_tea_cup", "Cup of Green Tea");
                add("item.tea.cup", "Cup");
                add("item.tea.clay_cup", "Clay Cup");
                add("item.tea.water_cup", "Cup of Water");
                add("item.tea.coffee_cup", "Cup of Coffee");
                add("effect.tea.poison_immunity", "Poison Immunity");
            }
        });
    }
}
