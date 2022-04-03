package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen) {
        super(gen, Ambrosial.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.ambrosial", "Ambrosial");
    }
}
