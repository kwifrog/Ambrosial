package kiwi.ambrosial.data;

import com.google.common.collect.Sets;
import kiwi.ambrosial.Ambrosial;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class ModItemModelProvider extends ItemModelProvider {
    public static String GENERATED = "item/generated";

    public ModItemModelProvider(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, Ambrosial.MODID, helper);
    }

    @Override
    protected void registerModels() {
        Set<Item> items = ForgeRegistries.ITEMS.getValues().stream().filter(i -> Ambrosial.MODID.equals(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(i)).getNamespace()))
                .collect(Collectors.toSet());

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
        generatedModel(itemGenerated, "radish_seeds");
        generatedModel(itemGenerated, "kiwi_seeds");
    }

    private void generatedModel(ModelFile itemGenerated, String name) {
        getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

    private void blockBasedModel(Item item, String suffix) {
        withExistingParent(itemName(item), resourceBlock(itemName(item) + suffix));
    }

    private String itemName(Item item) {
        return item.getRegistryName().getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(Ambrosial.MODID, "block/" + path);
    }


}
