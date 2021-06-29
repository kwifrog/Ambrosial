package com.kiwi.ambrosial.data;

import com.kiwi.ambrosial.Ambrosial;
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

    }
}
