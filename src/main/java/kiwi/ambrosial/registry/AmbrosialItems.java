package kiwi.ambrosial.registry;

import kiwi.ambrosial.items.AmbrosialFood;
import kiwi.ambrosial.items.FoodPigItem;
import kiwi.ambrosial.items.FoodRabbitItem;
import kiwi.ambrosial.items.FoodSeedItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

@SuppressWarnings("unused")
public class AmbrosialItems {
    /* General */


    /* Fruits */
    public static final RegistryObject<Item> RASPBERRY = RegistryHandler.ITEMS.register("raspberry", () -> new FoodRabbitItem(new Item.Properties().food(AmbrosialFood.BERRY)));
    public static final RegistryObject<Item> BLUEBERRY = RegistryHandler.ITEMS.register("blueberry", () -> new FoodRabbitItem(new Item.Properties().food(AmbrosialFood.BERRY)));
    public static final RegistryObject<Item> BLACKBERRY = RegistryHandler.ITEMS.register("blackberry", () -> new FoodRabbitItem(new Item.Properties().food(AmbrosialFood.BERRY)));
    public static final RegistryObject<Item> STRAWBERRY = RegistryHandler.ITEMS.register("strawberry", () -> new FoodRabbitItem(new Item.Properties().food(AmbrosialFood.BERRY)));
    public static final RegistryObject<Item> GRAPE = RegistryHandler.ITEMS.register("grape", () -> new FoodRabbitItem(new Item.Properties().food(AmbrosialFood.GRAPE)));
    public static final RegistryObject<Item> KIWI = RegistryHandler.ITEMS.register("kiwi", () -> new FoodRabbitItem(new Item.Properties().food(AmbrosialFood.KIWI)));
    public static final RegistryObject<Item> PINEAPPLE = RegistryHandler.ITEMS.register("pineapple", () -> new FoodRabbitItem(new Item.Properties().food(AmbrosialFood.PINEAPPLE)));

    /* Veggies */
    public static final RegistryObject<Item> ONION = RegistryHandler.ITEMS.register("onion", () -> new FoodPigItem(new Item.Properties().food(AmbrosialFood.ONION)));
    public static final RegistryObject<Item> TOMATO = RegistryHandler.ITEMS.register("tomato", () -> new FoodPigItem(new Item.Properties().food(AmbrosialFood.TOMATO)));
    public static final RegistryObject<Item> RADISH = RegistryHandler.ITEMS.register("radish", () -> new FoodPigItem(new Item.Properties().food(AmbrosialFood.RADISH)));
    public static final RegistryObject<Item> CABBAGE = RegistryHandler.ITEMS.register("cabbage", () -> new FoodPigItem(new Item.Properties().food(AmbrosialFood.CABBAGE)));

    /* Seeds */
    public static final RegistryObject<Item> RADISH_SEED = RegistryHandler.ITEMS.register("radish_seeds", () -> new FoodSeedItem(AmbrosialBlocks.RADISH_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> KIWI_SEED = RegistryHandler.ITEMS.register("kiwi_seeds", () -> new FoodSeedItem(AmbrosialBlocks.KIWI_CROP.get(), new Item.Properties()));

    /* Herbs */


    /* Fungus */


    /* Grains */


    /* Protein */


    public static void register() {

    }


}
