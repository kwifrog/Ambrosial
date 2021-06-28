package com.kiwi.ambrosial.registry;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.items.FoodItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ambrosial.MODID);

    // Items
    public  static  final  RegistryObject<Item> CANNING_JAR = ITEMS.register("canning_jar",
            () -> new Item(new Item.Properties().tab(Ambrosial.ITEM_GROUP)));


    // Food
    public static final RegistryObject<Item> RADISH = ITEMS.register(
            "radish", () -> new Item(new Item.Properties().food(FoodItems.RADISH).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> KIWI = ITEMS.register(
            "kiwi", () -> new Item(new Item.Properties().food(FoodItems.KIWI).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> SLICED_BREAD = ITEMS.register(
            "sliced_bread", () -> new Item(new Item.Properties().food(FoodItems.SLICED_BREAD).tab(Ambrosial.ITEM_GROUP)));
    public static final RegistryObject<Item> TOAST = ITEMS.register(
            "toast", () -> new Item(new Item.Properties().food(FoodItems.TOAST).tab(Ambrosial.ITEM_GROUP)));


}
