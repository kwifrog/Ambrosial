package com.kiwi.ambrosial.setup;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.registry.ModItems;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import vectorwing.farmersdelight.mixin.accessors.ChickenEntityAccessor;
import vectorwing.farmersdelight.mixin.accessors.PigEntityAccessor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mod.EventBusSubscriber(modid = Ambrosial.MODID)
public class CommonEventHandler {

    public static void init (final FMLCommonSetupEvent event) {

        event.enqueueWork(() -> {
            registerCompostables();

            List<ItemStack> chickenFood = new ArrayList<>();
            Collections.addAll(chickenFood, ChickenEntityAccessor.getFoodItems().getItems());
            chickenFood.add(new ItemStack(ModItems.DAIKON_SEEDS.get()));
            chickenFood.add(new ItemStack(ModItems.KIWI_SEEDS.get()));
            ChickenEntityAccessor.setFoodItems(Ingredient.of(chickenFood.stream()));

            List<ItemStack> pigFood = new ArrayList<>();
            Collections.addAll(pigFood, PigEntityAccessor.getFoodItems().getItems());
            pigFood.add(new ItemStack(ModItems.DAIKON.get()));
            PigEntityAccessor.setFoodItems(Ingredient.of(pigFood.stream()));

        });

    }

    public static void registerCompostables() {
        // 30% Chance
        ComposterBlock.COMPOSTABLES.put(ModItems.DAIKON_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(ModItems.KIWI_SEEDS.get(), 0.3F);

        // 45% Chance
        ComposterBlock.COMPOSTABLES.put(ModItems.KIWI.get(), 0.45F);

        // 65% Chance
        ComposterBlock.COMPOSTABLES.put(ModItems.DAIKON.get(), 0.65F);
    }

}
