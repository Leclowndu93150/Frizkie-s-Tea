package com.leclowndu93150.tea.registry;

import com.leclowndu93150.tea.common.*;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.leclowndu93150.tea.TeaMain.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> CUP = ITEMS.register("cup" , () -> new CupItem(new Item.Properties()));
    public static final DeferredItem<Item> BOILING_WATER_CUP = ITEMS.register("boiling_water_cup", () -> new BoilingWaterItems(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_TEA_BLEND = ITEMS.registerSimpleItem("black_tea_blend");
    public static final DeferredItem<Item> RED_TEA_BLEND = ITEMS.registerSimpleItem("red_tea_blend");
    public static final DeferredItem<Item> GREEN_TEA_BLEND = ITEMS.registerSimpleItem("green_tea_blend");
    public static final DeferredItem<Item> BLACK_TEA_CUP = ITEMS.register("black_tea_cup", () -> new RedTeaCupItem(new Item.Properties()));
    public static final DeferredItem<Item> RED_TEA_CUP = ITEMS.register("red_tea_cup", () -> new BlackTeaCupItem(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_TEA_CUP = ITEMS.register("green_tea_cup", () -> new GreenTeaCupItem(new Item.Properties()));
    public static final DeferredItem<Item> CLAY_CUP = ITEMS.registerSimpleItem("clay_cup");
    public static final DeferredItem<Item> WATER_CUP = ITEMS.register("water_cup", () -> new WaterCupItem(new Item.Properties()));
    public static final DeferredItem<Item> COFFEE_CUP = ITEMS.registerSimpleItem("coffee_cup");
}

