package com.kiwi.ambrosial.data;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.blocks.DaikonsBlock;
import com.kiwi.ambrosial.blocks.KiwisBlock;
import com.kiwi.ambrosial.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.Property;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper existingFileHelper) {
        super(gen, Ambrosial.MODID, existingFileHelper);
    }

    private String blockName(Block block) {
        return Objects.requireNonNull(block.getRegistryName()).getPath();
    }

    public ResourceLocation resourceBlock(String path) {
        return new ResourceLocation(Ambrosial.MODID, "block/" + path);
    }

    @Override
    protected void registerStatesAndModels() {
        this.stageBlock(ModBlocks.DAIKON_CROP.get(), DaikonsBlock.AGE);
        //this.stageBlock(ModBlocks.KIWI_CROP.get(), KiwisBlock.AGE);
    }

    public void stageBlock(Block block, IntegerProperty ageProperty, Property<?>... ignored) {
        VariantBlockStateBuilder builder = getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    int ageSuffix = state.getValue(ageProperty);
                    String stageName = blockName(block) + "_stage" + ageSuffix;
                    return ConfiguredModel.builder()
                            .modelFile(models().cross(stageName, resourceBlock(stageName))).build();
                }, ignored);
    }

}