package com.kiwi.ambrosial.items;

import net.minecraft.item.Food;

public class FoodItems {

    // Bread
    public static final Food SLICED_BREAD = (new Food.Builder())
            .nutrition(1).saturationMod(0.4f).build();
    public static final  Food TOAST = (new  Food.Builder())
            .nutrition(3).saturationMod(0.5f).build();

}
