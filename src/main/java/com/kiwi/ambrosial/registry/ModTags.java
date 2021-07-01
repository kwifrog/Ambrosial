package com.kiwi.ambrosial.registry;

import com.kiwi.ambrosial.Ambrosial;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("unused")
public class ModTags {
    public static final class Items {

        // Crops
        public static final ITag.INamedTag<Item> CROPS_RADISH = createTag("crops/radish");
        public static final ITag.INamedTag<Item> CROPS_KIWI = createTag("crops/kiwi");
        public static final ITag.INamedTag<Item> SEEDS_RADISH = createTag("seeds/radish");
        public static final ITag.INamedTag<Item> SEEDS_KIWI = createTag("seeds/kiwi");

        // Ingredients


        // Blocks
        public static final ITag.INamedTag<Item> SEA_PICKLE_PLANTABLE = createTag("sea_pickle_plantable");

        private static ITag.INamedTag<Item> createTag(String path) {
            return ItemTags.bind(new ResourceLocation(Ambrosial.MODID, path).toString());
        }
    }

    public static final class Blocks {

        public static final ITag.INamedTag<Block> SEA_PICKLE_PLANTABLE = createTag("sea_pickle_plantable");

        private static ITag.INamedTag<Block> createTag(String path) {
            return BlockTags.bind(new ResourceLocation(Ambrosial.MODID, path).toString());
        }
    }
}
