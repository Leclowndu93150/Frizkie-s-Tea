package com.leclowndu93150.tea.registry;

import com.leclowndu93150.tea.common.BlackTeaCupItem;
import com.leclowndu93150.tea.common.BoilingWaterItems;
import com.leclowndu93150.tea.common.GreenTeaCupItem;
import com.leclowndu93150.tea.common.RedTeaCupItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.leclowndu93150.tea.TeaMain.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> BOILED_WATER_CUP = ITEMS.register("boiled_water_cup", () -> new BoilingWaterItems(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_TEA_BLEND = ITEMS.registerSimpleItem("black_tea_blend");
    public static final DeferredItem<Item> RED_TEA_BLEND = ITEMS.registerSimpleItem("red_tea_blend");
    public static final DeferredItem<Item> GREEN_TEA_BLEND = ITEMS.registerSimpleItem("green_tea_blend");
    public static final DeferredItem<Item> BLACK_TEA_CUP = ITEMS.register("black_tea_cup", () -> new BlackTeaCupItem(new Item.Properties()));
    public static final DeferredItem<Item> RED_TEA_CUP = ITEMS.register("red_tea_cup", () -> new RedTeaCupItem(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_TEA_CUP = ITEMS.register("green_tea_cup", () -> new GreenTeaCupItem(new Item.Properties()));
    public static final DeferredItem<Item> CUP = ITEMS.registerSimpleItem("cup");
    public static final DeferredItem<Item> CLAY_CUP = ITEMS.registerSimpleItem("clay_cup");
    public static final DeferredItem<Item> WATER_CUP = ITEMS.registerSimpleItem("water_cup");
    public static final DeferredItem<Item> COFFEE_CUP = ITEMS.registerSimpleItem("coffee_cup");
}
