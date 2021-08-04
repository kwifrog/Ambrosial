package kiwi.ambrosial.registry;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.items.AmbrosialFood;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;

@SuppressWarnings("unused")
public class AmbrosialItems {
    /* General */


    /* Fruits */
    public static final RegistryObject<Item> RASPBERRY = RegistryHandler.ITEMS.register("raspberry", () -> new Item(new Item.Properties().food(AmbrosialFood.RASPBERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> BLUEBERRY = RegistryHandler.ITEMS.register("blueberry", () -> new Item(new Item.Properties().food(AmbrosialFood.BLUEBERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> BLACKBERRY = RegistryHandler.ITEMS.register("blackberry", () -> new Item(new Item.Properties().food(AmbrosialFood.BLACKBERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> STRAWBERRY = RegistryHandler.ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(AmbrosialFood.STRAWBERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> GRAPE = RegistryHandler.ITEMS.register("grape", () -> new Item(new Item.Properties().food(AmbrosialFood.GRAPE).tab(Ambrosial.CREATIVE_TAB)));

    /* Veggies */


    /* Herbs */


    /* Fungus */


    /* Grains */


    /* Protein */

    public static void register() {

    }


}
