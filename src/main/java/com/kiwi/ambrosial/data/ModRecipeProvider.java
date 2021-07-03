package com.kiwi.ambrosial.data;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.registry.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    private static ResourceLocation modid(String path) {
        return new ResourceLocation(Ambrosial.MODID, path);
    }

    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        recipesIngredients(consumer);
        //recipesSmelting(consumer);
        //recipesCooking(consumer);
        //recipesFood(consumer);
        //recipesMeals(consumer);
    }

    private void recipesIngredients(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.KIWI_SEEDS.get(), 1)
                .requires(ModItems.KIWI.get())
                .unlockedBy("has_item", has(ModItems.KIWI.get()))
                .group("ambrosial")
                .save(consumer, modid("kiwi_seeds"));
    }

    private void recipesSmelting(Consumer<IFinishedRecipe> consumer) {
    }

    private void recipesCooking(Consumer<IFinishedRecipe> consumer) {
    }

    private void recipesFood(Consumer<IFinishedRecipe> consumer) {

    }

    private void recipesMeals(Consumer<IFinishedRecipe> consumer) {

    }

}
