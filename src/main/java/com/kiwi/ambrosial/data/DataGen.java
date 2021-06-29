package com.kiwi.ambrosial.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        if (event.includeServer()) {
            ModBlockTagProvider blockTags = new ModBlockTagProvider(gen, helper);
            gen.addProvider(blockTags);
            gen.addProvider(new ModItemTagProvider(gen, blockTags, helper));
        }

        if (event.includeClient()) {
            gen.addProvider(new ModBlockStateProvider(gen, helper));
            gen.addProvider(new ModItemModels(gen, helper));
        }

    }

}
