package com.kiwi.ambrosial.data;

import com.kiwi.ambrosial.Ambrosial;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModels  extends ItemModelProvider {

    public static final String GENERATED = "item/generated";

    public ModItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Ambrosial.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc(GENERATED));

        builder(itemGenerated, "toast");
        builder(itemGenerated, "sliced_bread");
        builder(itemGenerated, "canning_jar");
        builder(itemGenerated, "radish");
        builder(itemGenerated, "kiwi");
    }

    private void builder(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
