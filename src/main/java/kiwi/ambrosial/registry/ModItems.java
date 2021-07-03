package kiwi.ambrosial.registry;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.items.FoodItems;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ambrosial.MODID);

    // Crops
    public static final RegistryObject<Item> KIWI = ITEMS.register(
            "kiwi", () -> new Item(new Item.Properties().food(FoodItems.KIWI).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> DAIKON = ITEMS.register(
            "daikon", () -> new Item(new Item.Properties().food(FoodItems.DAIKON).tab(Ambrosial.ITEM_GROUP)));
    // Seeds
    public  static  final  RegistryObject<Item> KIWI_SEEDS = ITEMS.register("kiwi_seeds",
            () -> new BlockNamedItem(ModBlocks.KIWI_CROP.get(), new Item.Properties().tab(Ambrosial.ITEM_GROUP)));
    public  static  final  RegistryObject<Item> DAIKON_SEEDS = ITEMS.register("daikon_seeds",
            () -> new BlockNamedItem(ModBlocks.DAIKON_CROP.get(),new Item.Properties().tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> PICKLE_SPORES = ITEMS.register("pickle_spores",
            () -> new BlockNamedItem(ModBlocks.PICKLE_CROP.get(), new Item.Properties().tab(Ambrosial.ITEM_GROUP)));

    // Food
    public static final RegistryObject<Item> SLICED_BREAD = ITEMS.register(
            "sliced_bread", () -> new Item(new Item.Properties().food(FoodItems.SLICED_BREAD).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> TOAST = ITEMS.register(
            "toast", () -> new Item(new Item.Properties().food(FoodItems.TOAST).tab(Ambrosial.ITEM_GROUP)));

    // Items
    public  static  final  RegistryObject<Item> CANNING_JAR = ITEMS.register("canning_jar",
            () -> new Item(new Item.Properties().tab(Ambrosial.ITEM_GROUP)));
}
