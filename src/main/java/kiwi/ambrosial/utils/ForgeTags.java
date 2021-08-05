package kiwi.ambrosial.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;

/**
 * Thanks to VectorWing for this!
 * References to tags under the Forge namespace.
 * These tags are generic concepts, meant to be shared with other mods for compatibility.
 */

public class ForgeTags {

    public static final Tag.Named<Item> BREAD = forgeItemTag("bread");
    public static final Tag.Named<Item> BREAD_WHEAT = forgeItemTag("bread/wheat");
    
    public static final Tag.Named<Item> COOKED_BEEF = forgeItemTag("cooked_beef");
    public static final Tag.Named<Item> COOKED_CHICKEN = forgeItemTag("cooked_chicken");
    public static final Tag.Named<Item> COOKED_PORK = forgeItemTag("cooked_pork");
    public static final Tag.Named<Item> COOKED_MUTTON = forgeItemTag("cooked_mutton");
    //public static final Tag.Named<Item> COOKED_EGGS = forgeItemTag("cooked_eggs");
    public static final Tag.Named<Item> COOKED_FISH = forgeItemTag("cooked_fish");
    public static final Tag.Named<Item> COOKED_FISH_COD = forgeItemTag("cooked_fish/cod");
    public static final Tag.Named<Item> COOKED_FISH_SALMON = forgeItemTag("cooked_fish/salmon");

    public static final Tag.Named<Item> EGGS = forgeItemTag("eggs");

    public static final Tag.Named<Item> GRAIN = forgeItemTag("grain");
    public static final Tag.Named<Item> GRAIN_WHEAT = forgeItemTag("grain/wheat");

    public static final Tag.Named<Item> MILK = forgeItemTag("milk");
    public static final Tag.Named<Item> MILK_BUCKET = forgeItemTag("milk/milk");

    public static final Tag.Named<Item> RAW_BEEF = forgeItemTag("raw_beef");
    public static final Tag.Named<Item> RAW_CHICKEN = forgeItemTag("raw_chicken");
    public static final Tag.Named<Item> RAW_PORK = forgeItemTag("raw_pork");
    public static final Tag.Named<Item> RAW_MUTTON = forgeItemTag("raw_mutton");
    public static final Tag.Named<Item> RAW_FISHES = forgeItemTag("raw_fishes");
    public static final Tag.Named<Item> RAW_FISHES_COD = forgeItemTag("raw_fishes/cod");
    public static final Tag.Named<Item> RAW_FISHES_SALMON = forgeItemTag("raw_fishes/salmon");
    public static final Tag.Named<Item> RAW_FISHES_TROPICAL = forgeItemTag("raw_fishes/tropical_fish");

    public static final Tag.Named<Item> CROPS = forgeItemTag("crops");
    public static final Tag.Named<Item> CROPS_RASPBERRY = forgeItemTag("crops/raspberry");
    public static final Tag.Named<Item> CROPS_BLUEBERRY = forgeItemTag("crops/blueberry");
    public static final Tag.Named<Item> CROPS_BLACKBERRY = forgeItemTag("crops/blackberry");
    public static final Tag.Named<Item> CROPS_STRAWBERRY = forgeItemTag("crops/strawberry");
    public static final Tag.Named<Item> CROPS_GRAPES = forgeItemTag("crops/grape");
    public static final Tag.Named<Item> CROPS_KIWI = forgeItemTag("crops/kiwi");
    public static final Tag.Named<Item> CROPS_PINEAPPLE = forgeItemTag("crops/pineapple");
    public static final Tag.Named<Item> CROPS_ONION = forgeItemTag("crops/onion");
    public static final Tag.Named<Item> CROPS_TOMATO = forgeItemTag("crops/tomato");
    public static final Tag.Named<Item> CROPS_CABBAGE = forgeItemTag("crops/cabbage");
    public static final Tag.Named<Item> CROPS_RADISH = forgeItemTag("crops/radish");

    public static final Tag.Named<Item> FRUITS = forgeItemTag("fruits");
    public static final Tag.Named<Item> FRUITS_RASPBERRY = forgeItemTag("fruits/raspberry");
    public static final Tag.Named<Item> FRUITS_BLUEBERRY = forgeItemTag("fruits/blueberry");
    public static final Tag.Named<Item> FRUITS_BLACKBERRY = forgeItemTag("fruits/blackberry");
    public static final Tag.Named<Item> FRUITS_STRAWBERRY = forgeItemTag("fruits/strawberry");
    public static final Tag.Named<Item> FRUITS_GRAPES = forgeItemTag("fruits/grape");
    public static final Tag.Named<Item> FRUITS_KIWI = forgeItemTag("fruits/kiwi");
    public static final Tag.Named<Item> FRUITS_PINEAPPLE = forgeItemTag("fruits/pineapple");

    public static final Tag.Named<Item> VEGETABLES = forgeItemTag("vegetables");
    public static final Tag.Named<Item> VEGETABLES_BEETROOT = forgeItemTag("vegetables/beetroot");
    public static final Tag.Named<Item> VEGETABLES_CARROT = forgeItemTag("vegetables/carrot");
    public static final Tag.Named<Item> VEGETABLES_POTATO = forgeItemTag("vegetables/potato");
    public static final Tag.Named<Item> VEGETABLES_ONION = forgeItemTag("vegetables/onion");
    public static final Tag.Named<Item> VEGETABLES_TOMATO = forgeItemTag("vegetables/tomato");
    public static final Tag.Named<Item> VEGETABLES_CABBAGE = forgeItemTag("vegetables/cabbage");
    public static final Tag.Named<Item> VEGETABLES_RADISH = forgeItemTag("vegetables/radish");

    private  static Tag.Named<Item> forgeItemTag(String path) {
        return ItemTags.bind(new ResourceLocation("forge", path).toString());
    }

}
