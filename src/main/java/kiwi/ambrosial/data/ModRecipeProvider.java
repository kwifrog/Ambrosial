package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.AmbrosialItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

@SuppressWarnings("unused")
public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    private static ResourceLocation modid(String path) {
        return new ResourceLocation(Ambrosial.MODID, path);
    }

    //TODO Add Seed Recipes
    //TODO Other Recipes when Food is added
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        //recipesCooking(consumer);
        //recipesSmelting(consumer);
        //recipesShaped(consumer);
        recipesShapeless(consumer);
    }

    private void recipesCooking(Consumer<FinishedRecipe> consumer) {

    }

    private void recipesShaped(Consumer<FinishedRecipe> consumer) {

    }

    public void recipesShapeless(Consumer<FinishedRecipe> consumer) {
        seeds("kiwi_seeds", consumer, AmbrosialItems.KIWI_SEED.get(), AmbrosialItems.KIWI.get());
    }

    /* Adds smelting, smoker and campfire recipes */
    private static void cookFood(String name, Item ingredient, Item result, float experience, Consumer<FinishedRecipe> consumer) {
        String namePrefix = new ResourceLocation(Ambrosial.MODID, name).toString();
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ingredient), result, experience, 200)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient)).save(consumer, namePrefix + "_from_smelting");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ingredient), result, experience, 100)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient)).save(consumer, namePrefix + "_from_smoking");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ingredient), result, experience, 600)
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient)).save(consumer, namePrefix + "_from_campfire_cooking");
    }

    /* Shapeless recipes for seeds */
   public static void seeds(String name, Consumer<FinishedRecipe> consumer, ItemLike result, ItemLike ingredient) {
       String namePrefix = new ResourceLocation(Ambrosial.MODID, name).toString();
        ShapelessRecipeBuilder.shapeless(result, 1).group("ambrosial:seeds").requires(Ingredient.of(ingredient))
                .unlockedBy(name, InventoryChangeTrigger.TriggerInstance.hasItems(ingredient)).save(consumer);
    }
}
