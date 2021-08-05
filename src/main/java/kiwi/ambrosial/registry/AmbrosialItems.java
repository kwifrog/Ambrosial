package kiwi.ambrosial.registry;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.items.AmbrosialFood;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

@SuppressWarnings("unused")
public class AmbrosialItems {
    /* General */


    /* Fruits */
    public static final RegistryObject<Item> RASPBERRY = RegistryHandler.ITEMS.register("raspberry", () -> new Item(new Item.Properties().food(AmbrosialFood.BERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> BLUEBERRY = RegistryHandler.ITEMS.register("blueberry", () -> new Item(new Item.Properties().food(AmbrosialFood.BERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> BLACKBERRY = RegistryHandler.ITEMS.register("blackberry", () -> new Item(new Item.Properties().food(AmbrosialFood.BERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> STRAWBERRY = RegistryHandler.ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(AmbrosialFood.BERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> GRAPE = RegistryHandler.ITEMS.register("grape", () -> new Item(new Item.Properties().food(AmbrosialFood.GRAPE).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> KIWI = RegistryHandler.ITEMS.register("kiwi", () -> new Item(new Item.Properties().food(AmbrosialFood.KIWI).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> PINEAPPLE = RegistryHandler.ITEMS.register("pineapple", () -> new Item(new Item.Properties().food(AmbrosialFood.PINEAPPLE).tab(Ambrosial.CREATIVE_TAB)));

    /* Veggies */
    public static final RegistryObject<Item> ONION = RegistryHandler.ITEMS.register("onion", () -> new Item(new Item.Properties().food(AmbrosialFood.ONION).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> TOMATO = RegistryHandler.ITEMS.register("tomato", () -> new Item(new Item.Properties().food(AmbrosialFood.TOMATO).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> RADISH = RegistryHandler.ITEMS.register("radish", () -> new Item(new Item.Properties().food(AmbrosialFood.RADISH).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> CABBAGE = RegistryHandler.ITEMS.register("cabbage", () -> new Item(new Item.Properties().food(AmbrosialFood.CABBAGE).tab(Ambrosial.CREATIVE_TAB)));


    /* Herbs */


    /* Fungus */


    /* Grains */


    /* Protein */

    public static void register() {

    }


}
