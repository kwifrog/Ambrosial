package kiwi.ambrosial.registry;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.items.AmbrosialFood;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class AmbrosialItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ambrosial.MODID);

    /* General */


    /* Fruits */
    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry", () -> new Item(new Item.Properties().food(AmbrosialFood.RASPBERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry", () -> new Item(new Item.Properties().food(AmbrosialFood.BLUEBERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry", () -> new Item(new Item.Properties().food(AmbrosialFood.BLACKBERRY).tab(Ambrosial.CREATIVE_TAB)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(AmbrosialFood.STRAWBERRY).tab(Ambrosial.CREATIVE_TAB)));

    /* Veggies */


    /* Herbs */


    /* Fungus */


    /* Grains */


    /* Protein */


}
