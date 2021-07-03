package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ITag;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import vectorwing.farmersdelight.utils.tags.ForgeTags;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }

    private static ResourceLocation modid(String path) {
        return new ResourceLocation(Ambrosial.MODID, path);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        recipesIngredients(consumer);
        recipesFood(consumer);
        recipesMeals(consumer);

        recipesSmelting(consumer);
        recipesCooking(consumer);

        recipesCuttingBoard(consumer);
        recipesCookingPot(consumer);
    }

    private void recipesIngredients(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.KIWI_SEEDS.get(), 1)
                .requires(ModItems.KIWI.get())
                .unlockedBy("has_kiwi", has(ModItems.KIWI.get()))
                .unlockedBy("has_kiwi_seeds", has(ModItems.KIWI_SEEDS.get()))
                .group("ambrosial")
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(ModItems.DAIKON_SEEDS.get(), 1)
                .requires(ModItems.DAIKON.get())
                .unlockedBy("has_daikon", has(ModItems.DAIKON.get()))
                .unlockedBy("has_daikon_seeds", has(ModItems.DAIKON_SEEDS.get()))
                .group("ambrosial")
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.CANNING_JAR.get())
                .define('#', Blocks.GLASS).define('$', Items.IRON_INGOT)
                .pattern(" $ ").pattern("# #").pattern(" # ")
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .group("ambrosial")
                .save(consumer);
    }

    private void recipesSmelting(Consumer<IFinishedRecipe> consumer) {
        smeltFood("toast", ModItems.SLICED_BREAD.get(), ModItems.TOAST.get(), 0.35F, consumer);
    }

    private void recipesCooking(Consumer<IFinishedRecipe> consumer) {
        cookFood("toast", ModItems.SLICED_BREAD.get(), ModItems.TOAST.get(), 0.35F, consumer);
    }

    private void recipesFood(Consumer<IFinishedRecipe> consumer) {

    }

    private void recipesMeals(Consumer<IFinishedRecipe> consumer) {

    }

    private void recipesCuttingBoard(Consumer<IFinishedRecipe> consumer) {
        cutFood("sliced_bread", Items.BREAD, ForgeTags.TOOLS_KNIVES, ModItems.SLICED_BREAD.get(), 4, consumer);
    }

    private void recipesCookingPot(Consumer<IFinishedRecipe> consumer) {

    }

    private static void cookFood(String name, IItemProvider ingredient, IItemProvider result, float experience, Consumer<IFinishedRecipe> consumer) {
        String namePrefix = new ResourceLocation(Ambrosial.MODID, name).toString();
        CookingRecipeBuilder.smelting(Ingredient.of(ingredient),
                result, experience, 200)
                .unlockedBy(name, InventoryChangeTrigger.Instance.hasItems(ingredient))
                .save(consumer);
        CookingRecipeBuilder.cooking(Ingredient.of(ingredient),
                result, experience, 600, IRecipeSerializer.CAMPFIRE_COOKING_RECIPE)
                .unlockedBy(name, InventoryChangeTrigger.Instance.hasItems(ingredient))
                .save(consumer, namePrefix + "_from_campfire_cooking");
        CookingRecipeBuilder.cooking(Ingredient.of(ingredient),
                result, experience, 100, IRecipeSerializer.SMOKING_RECIPE)
                .unlockedBy(name, InventoryChangeTrigger.Instance.hasItems(ingredient))
                .save(consumer, namePrefix + "_from_smoking");
    }

    private static void smeltFood(String name, IItemProvider ingredient, IItemProvider result, float experience, Consumer<IFinishedRecipe> consumer) {
        String namePrefix = new ResourceLocation(Ambrosial.MODID, name).toString();
        CookingRecipeBuilder.smelting(Ingredient.of(ingredient),
                result, experience, 200)
                .unlockedBy(name, InventoryChangeTrigger.Instance.hasItems(ingredient))
                .save(consumer, namePrefix + "_from_smelting");
    }

    private static void cutFood(String name, IItemProvider ingredient, ITag.INamedTag<Item> tool, IItemProvider result, int amount,  Consumer<IFinishedRecipe> consumer) {
        String namePrefix = new ResourceLocation(Ambrosial.MODID, name).toString();
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ingredient),
                Ingredient.of(tool), result, amount).build(consumer, namePrefix + "_from_cutting");
    }
}
