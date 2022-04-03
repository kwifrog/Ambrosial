package kiwi.ambrosial.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeServer()) {
            gen.addProvider(new ModRecipeProvider(gen));
            gen.addProvider(new ModLootTableProvider(gen));
            ModBlockTagProvider blockTags = new ModBlockTagProvider(gen, helper);
            gen.addProvider(new ModItemTagProvider(gen, blockTags, helper));
        }

        if (event.includeClient()) {
            gen.addProvider(new ModItemModelProvider(gen, helper));
            gen.addProvider(new ModLanguageProvider(gen));
            gen.addProvider(new ModBlockStateProvider(gen, helper));
        }
    }
}
