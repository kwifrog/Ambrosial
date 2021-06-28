package com.kiwi.ambrosial.registry;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.items.Foods;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Ambrosial.MODID);

    // Food
    public static final RegistryObject<Item> SLICED_BREAD = ITEMS.register(
            "sliced_bread", () -> new Item(new Item.Properties().food(Foods.SLICED_BREAD).tab(Ambrosial.ITEM_GROUP)));

}
