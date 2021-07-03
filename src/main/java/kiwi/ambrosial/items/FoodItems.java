package kiwi.ambrosial.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("deprecation")
public class FoodItems {

    // Crops
    public static final Food KIWI = (new Food.Builder()).nutrition(2).saturationMod(0.5f).build();
    public static final Food DAIKON = (new Food.Builder()).nutrition(2).saturationMod(0.3f).build();

    // Small Edibles
    public static final Food ROASTED_CARROT = (new Food.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final Food ROASTED_BEETROOT = (new Food.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final Food ROASTED_DAIKON = (new Food.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final Food ROASTED_SEA_PICKLE = (new Food.Builder().nutrition(2).saturationMod(0.6F))
            .effect(new EffectInstance(Effects.CONFUSION,100, 0), 0.6F).build();

    // Spreads
    public static final Food KIWI_JAM = (new Food.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final Food MELON_JAM = (new Food.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final Food SWEET_BERRY_JAM = (new Food.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final Food APPLE_BUTTER = (new Food.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final Food PUMPKIN_BUTTER = (new Food.Builder()).nutrition(4).saturationMod(0.5F).build();
    public static final Food ONION_BACON_JAM = (new Food.Builder()).nutrition(4).saturationMod(0.5F).build();

    // Pickles

    // Bread
    public static final Food SLICED_BREAD = (new Food.Builder()).nutrition(1).saturationMod(0.4f).build();
    public static final  Food TOAST = (new  Food.Builder()).nutrition(3).saturationMod(0.5f).build();

    // Sandwiches

    // Sushi

}
