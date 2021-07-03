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

    // Veggies
    public static final RegistryObject<Item> ROASTED_CARROT = ITEMS.register(
            "roasted_carrot", () -> new Item(new Item.Properties().food(FoodItems.ROASTED_CARROT).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> ROASTED_BEETROOT = ITEMS.register(
            "roasted_beetroot", () -> new Item(new Item.Properties().food(FoodItems.ROASTED_BEETROOT).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> ROASTED_DAIKON = ITEMS.register(
            "roasted_daikon", () -> new Item(new Item.Properties().food(FoodItems.ROASTED_DAIKON).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> ROASTED_SEA_PICKLE = ITEMS.register(
            "roasted_sea_pickle", () -> new Item(new Item.Properties().food(FoodItems.ROASTED_SEA_PICKLE).tab(Ambrosial.ITEM_GROUP)));

    // Spreads
    public static final RegistryObject<Item> KIWI_JAM = ITEMS.register(
            "kiwi_jam", () -> new Item(new Item.Properties().food(FoodItems.KIWI_JAM).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> MELON_JAM = ITEMS.register(
            "melon_jam", () -> new Item(new Item.Properties().food(FoodItems.MELON_JAM).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> SWEET_BERRY_JAM = ITEMS.register(
            "sweet_berry_jam", () -> new Item(new Item.Properties().food(FoodItems.SWEET_BERRY_JAM).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> APPLE_BUTTER = ITEMS.register(
            "apple_butter", () -> new Item(new Item.Properties().food(FoodItems.APPLE_BUTTER).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> PUMPKIN_BUTTER = ITEMS.register(
            "pumpkin_butter", () -> new Item(new Item.Properties().food(FoodItems.PUMPKIN_BUTTER).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> ONION_BACON_JAM = ITEMS.register(
            "onion_bacon_jam", () -> new Item(new Item.Properties().food(FoodItems.ONION_BACON_JAM).tab(Ambrosial.ITEM_GROUP)));

    // Pickles

    // Bread
    public static final RegistryObject<Item> SLICED_BREAD = ITEMS.register(
            "sliced_bread", () -> new Item(new Item.Properties().food(FoodItems.SLICED_BREAD).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> TOAST = ITEMS.register(
            "toast", () -> new Item(new Item.Properties().food(FoodItems.TOAST).tab(Ambrosial.ITEM_GROUP)));

    // Meals

    // Items
    public  static  final  RegistryObject<Item> CANNING_JAR = ITEMS.register("canning_jar",
            () -> new Item(new Item.Properties().tab(Ambrosial.ITEM_GROUP)));
}
