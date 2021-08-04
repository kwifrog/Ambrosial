package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.AmbrosialBlocks;
import kiwi.ambrosial.registry.RegistryHandler;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

@SuppressWarnings("unused")
public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, Ambrosial.MODID, helper);
    }

    private String blockName(Block block) {
        return Objects.requireNonNull(block.getRegistryName()).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(Ambrosial.MODID, "block/" + path);
    }

    @Override
    protected void registerStatesAndModels() {

        /* Bushels */
        bushelBlock(AmbrosialBlocks.RASPBERRY_BUSHEL.get(), "raspberry");

        RegistryHandler.BLOCKS.getEntries().forEach((block) -> blockItems(block.get()));
    }

    private void blocks(Block block) {
        String path = block.getRegistryName().getPath();
        String loc = ModelProvider.BLOCK_FOLDER + "/" + path;
        simpleBlock(block, models().singleTexture(path, modLoc(ModelProvider.BLOCK_FOLDER + "/block"), "all", modLoc(loc)));
    }

    private void bushelBlock(Block block, String cropName) {
        simpleBlock(block, models()
                .cubeBottomTop(blockName(block), resourceBlock(cropName + "_bushel_side"), resourceBlock("bushel_bottom"), resourceBlock(cropName + "_bushel_top")));
    }

    private void blockItems(Block block) {
        String path = block.getRegistryName().getPath();
        simpleBlockItem(block, models().getExistingFile(modLoc(ModelProvider.BLOCK_FOLDER + "/" + path)));
    }
}
