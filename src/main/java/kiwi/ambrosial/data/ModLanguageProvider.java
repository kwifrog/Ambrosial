package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.AmbrosialBlocks;
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

        //add(AmbrosialBlocks.RASPBERRY_BUSHEL.get(), "Raspberry Bushel");
    }
}
