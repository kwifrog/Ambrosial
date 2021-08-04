package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public static String GENERATED = "item/generated";

    public ModItemModelProvider(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, Ambrosial.MODID, helper);
    }

    @Override
    protected void registerModels() {
        ModelFile itemGenerated = getExistingFile(mcLoc(GENERATED));
        builder(itemGenerated, "raspberry");
        builder(itemGenerated, "blueberry");
        builder(itemGenerated, "blackberry");
        builder(itemGenerated, "strawberry");
        builder(itemGenerated, "grape");
    }

    private void builder(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
