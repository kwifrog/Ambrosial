package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.AmbrosialItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

@SuppressWarnings("unused")
public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen) {
        super(gen, Ambrosial.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.ambrosial", "Ambrosial");
        add("ambrosial.item.kiwi.pick_from_bush", "Kiwis pop");

        add(AmbrosialItems.RASPBERRY.get(), "Raspberries");
        add(AmbrosialItems.BLUEBERRY.get(), "Blueberries");
        add(AmbrosialItems.BLACKBERRY.get(), "Blackberries");
        add(AmbrosialItems.STRAWBERRY.get(), "Strawberry");
        add(AmbrosialItems.GRAPE.get(), "Grapes");
        add(AmbrosialItems.KIWI.get(), "Kiwi");
        add(AmbrosialItems.PINEAPPLE.get(), "Pineapple");
        add(AmbrosialItems.ONION.get(), "Onion");
        add(AmbrosialItems.TOMATO.get(), "Tomato");
        add(AmbrosialItems.RADISH.get(), "Radish");
        add(AmbrosialItems.CABBAGE.get(), "Cabbage");

        add(AmbrosialItems.RADISH_SEED.get(), "Radish Seeds");
        add(AmbrosialItems.KIWI_SEED.get(), "Kiwi Seeds");

        //add(AmbrosialBlocks.RADISH_CROP.get(), "Radishes");
        //add(AmbrosialBlocks.KIWI_CROP.get(), "Kiwis");

        //add(AmbrosialBlocks.RASPBERRY_BUSHEL.get(), "Raspberry Bushel");
    }
}
