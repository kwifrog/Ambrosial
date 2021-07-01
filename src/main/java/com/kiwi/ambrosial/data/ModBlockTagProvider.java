package com.kiwi.ambrosial.data;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.registry.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

@SuppressWarnings("unused")
public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, Ambrosial.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        // Sea Pickles
        tag(ModTags.Blocks.SEA_PICKLE_PLANTABLE)
                .add(Blocks.SAND).add(Blocks.RED_SAND)
                .add(Blocks.BRAIN_CORAL_BLOCK).add(Blocks.TUBE_CORAL_BLOCK).add(Blocks.BUBBLE_CORAL_BLOCK).add(Blocks.FIRE_CORAL_BLOCK).add(Blocks.HORN_CORAL_BLOCK);
    }
}
