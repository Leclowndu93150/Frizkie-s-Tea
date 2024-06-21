package com.leclowndu93150.tea.datagen;

import com.leclowndu93150.tea.registry.ItemRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class TeaRecipes extends RecipeProvider {

    public TeaRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput pRecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.GREEN_TEA_BLEND)
                .pattern(" a ")
                .pattern("ogo")
                .pattern("ppp")
                .define('a', Items.STRING)
                .define('g', Items.GREEN_DYE)
                .define('o', Items.OAK_LEAVES)
                .define('p', Items.PAPER)
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.RED_TEA_BLEND)
                .pattern(" a ")
                .pattern("oro")
                .pattern("ppp")
                .define('a', Items.STRING)
                .define('g', Items.RED_DYE)
                .define('o', Items.OAK_LEAVES)
                .define('p', Items.PAPER)
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.BLACK_TEA_BLEND)
                .pattern(" a ")
                .pattern("oso")
                .pattern("ppp")
                .define('a', Items.STRING)
                .define('g', Items.SUGAR_CANE)
                .define('o', Items.OAK_LEAVES)
                .define('p', Items.PAPER)
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.CLAY_CUP)
                .pattern("c c")
                .pattern(" c ")
                .define('c', Items.CLAY_BALL)
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.GREEN_TEA_CUP)
                .pattern("a")
                .pattern("b")
                .define('a', ItemRegistry.GREEN_TEA_BLEND)
                .define('b', ItemRegistry.BOILING_WATER_CUP)
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.RED_TEA_CUP)
                .pattern("a")
                .pattern("b")
                .define('a', ItemRegistry.RED_TEA_BLEND)
                .define('b', ItemRegistry.BOILING_WATER_CUP)
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.BLACK_TEA_CUP)
                .pattern("a")
                .pattern("b")
                .define('a', ItemRegistry.BLACK_TEA_BLEND)
                .define('b', ItemRegistry.BOILING_WATER_CUP)
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegistry.COFFEE_CUP)
                .pattern("a")
                .pattern("b")
                .define('a', Items.COCOA_BEANS)
                .define('b', ItemRegistry.BOILING_WATER_CUP)
                .save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.WATER_CUP), RecipeCategory.MISC, ItemRegistry.BOILING_WATER_CUP, 10F, 100)
                .save(pRecipeOutput);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemRegistry.CLAY_CUP), RecipeCategory.MISC, ItemRegistry.CUP, 10F, 100)
                .save(pRecipeOutput);
    }

}
