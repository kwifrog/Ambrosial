package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, Ambrosial.MODID, helper);
    }

    private String blockName(Block block) {
        return Objects.requireNonNull(block.getRegistryName().getPath());
    }

    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(Ambrosial.MODID, "block/" + path);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    private void blockItem(Block block) {
        String path = block.getRegistryName().getPath();
        simpleBlockItem(block, models().getExistingFile(modLoc(ModelProvider.BLOCK_FOLDER + "/" + path)));
    }

    private void stageBlock(Block block, IntegerProperty ageProperty, Property<?>... ignored) {
        VariantBlockStateBuilder builder = getVariantBuilder(block)
                .forAllStatesExcept(blockState -> {
                    int ageSuffix = blockState.getValue(ageProperty);
                    String stageName = blockName(block) + "_stage" + ageSuffix;
                    return ConfiguredModel.builder().modelFile(models().crop(stageName, resourceBlock(stageName))).build();
                }, ignored);
    }
}
