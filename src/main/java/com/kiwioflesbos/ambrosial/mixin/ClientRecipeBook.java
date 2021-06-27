/* package com.kiwioflesbos.ambrosial.mixin;

import net.minecraft.client.util.RecipeBookCategories;
import net.minecraft.item.crafting.IRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import vectorwing.farmersdelight.crafting.CookingPotRecipe;
import vectorwing.farmersdelight.crafting.CuttingBoardRecipe;

@Mixin(ClientRecipeBook.class)
public class ClientRecipeBook {

    @Inject(at = @At("HEAD"), method = "getCategory", cancellable = true)
    private static void getCategory(IRecipe<?> recipe, CallbackInfoReturnable<RecipeBookCategories> cir) {
        if (recipe.getType() == CookingPotRecipe.TYPE || recipe.getType() == CuttingBoardRecipe.TYPE) {
            cir.setReturnValue(RecipeBookCategories.UNKNOWN);
        }
    }

}*/
