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

        // Generated Models (Regular Items)
        ModelFile itemGenerated = getExistingFile(mcLoc(GENERATED));
        generatedModel(itemGenerated, "raspberry");
        generatedModel(itemGenerated, "blueberry");
        generatedModel(itemGenerated, "blackberry");
        generatedModel(itemGenerated, "strawberry");
        generatedModel(itemGenerated, "grape");
        generatedModel(itemGenerated, "kiwi");
        generatedModel(itemGenerated, "pineapple");
        generatedModel(itemGenerated, "onion");
        generatedModel(itemGenerated, "tomato");
        generatedModel(itemGenerated, "radish");
        generatedModel(itemGenerated, "cabbage");

    }

    private void generatedModel(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
