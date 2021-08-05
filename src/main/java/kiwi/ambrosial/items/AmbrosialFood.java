package kiwi.ambrosial.items;

import kiwi.ambrosial.config.HungerConfig;
import net.minecraft.world.food.FoodProperties;

public class AmbrosialFood {

    public static final FoodProperties BERRY = (new FoodProperties.Builder().nutrition(HungerConfig.berry.get())).saturationMod(0.5F).fast().build();
    public static final FoodProperties GRAPE = (new FoodProperties.Builder().nutrition(HungerConfig.grape.get())).saturationMod(0.4F).build();
    public static final FoodProperties KIWI = (new FoodProperties.Builder().nutrition(HungerConfig.kiwi.get())).saturationMod(0.4F).build();
    public static final FoodProperties PINEAPPLE = (new FoodProperties.Builder().nutrition(HungerConfig.pineapple.get())).saturationMod(0.6F).build();

    public static final FoodProperties ONION = (new FoodProperties.Builder().nutrition(HungerConfig.onion.get())).saturationMod(0.3F).build();
    public static final FoodProperties TOMATO = (new FoodProperties.Builder().nutrition(HungerConfig.tomato.get())).saturationMod(0.3F).build();
    public static final FoodProperties RADISH = (new FoodProperties.Builder().nutrition(HungerConfig.radish.get())).saturationMod(0.3F).build();
    public static final FoodProperties CABBAGE = (new FoodProperties.Builder().nutrition(HungerConfig.cabbage.get())).saturationMod(0.3F).build();


    /* Herbs */


    /* Fungus */


    /* Protein */

}
