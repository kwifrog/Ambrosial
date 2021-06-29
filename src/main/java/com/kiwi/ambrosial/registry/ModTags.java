package com.kiwi.ambrosial.registry;

import com.kiwi.ambrosial.Ambrosial;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("unused")
public class ModTags {
    public static final class Items {

        // Crops
        public static final ITag.INamedTag<Item> CROPS_RADISH = forge("crops/radish");
        public static final ITag.INamedTag<Item> CROPS_KIWI = forge("crops/kiwi");
        public static final ITag.INamedTag<Item> SEEDS_RADISH = forge("seeds/radish");
        public static final ITag.INamedTag<Item> SEEDS_KIWI = forge("seeds/kiwi");

        // Ingredients


        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation(Ambrosial.MODID, path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(Ambrosial.MODID, path).toString());
        }
    }

    //public static final class Blocks {

   // }
}
