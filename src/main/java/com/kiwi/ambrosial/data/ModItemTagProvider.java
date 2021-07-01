package com.kiwi.ambrosial.data;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.registry.ModItems;
import com.kiwi.ambrosial.registry.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.utils.tags.ForgeTags;

import javax.annotation.Nullable;

@SuppressWarnings("unused")
public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(DataGenerator generatorIn, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, blockTagProvider, Ambrosial.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {

        // Crops
        tag(ForgeTags.CROPS).add(ModItems.DAIKON.get()).add(ModItems.KIWI.get());
        tag(ModTags.Items.CROPS_RADISH).add(ModItems.DAIKON.get());
        tag(ModTags.Items.CROPS_KIWI).add(ModItems.KIWI.get());
        tag(ForgeTags.SEEDS).add(ModItems.KIWI_SEEDS.get()).add(ModItems.DAIKON_SEEDS.get());
        tag(ModTags.Items.SEEDS_RADISH).add(ModItems.KIWI_SEEDS.get());
        tag(ModTags.Items.SEEDS_KIWI).add(ModItems.DAIKON_SEEDS.get());

        // Ingredients
        tag(ForgeTags.BREAD_WHEAT).add(ModItems.SLICED_BREAD.get()).add(ModItems.TOAST.get());


        // Meals

        // Blocks
        copy(ModTags.Blocks.SEA_PICKLE_PLANTABLE, ModTags.Items.SEA_PICKLE_PLANTABLE);
    }

}
