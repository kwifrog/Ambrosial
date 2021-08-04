package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.items.AmbrosialBlockItem;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;
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

    }

    private void generatedModel(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
