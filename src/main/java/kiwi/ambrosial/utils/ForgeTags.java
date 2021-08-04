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

    /* Crops */
    public static final Tag.Named<Item> CROPS = forgeTagItem("crops");
    public static final Tag.Named<Item> CROPS_RASPBERRY = forgeTagItem("crops/raspberry");
    public static final Tag.Named<Item> CROPS_BLUEBERRY = forgeTagItem("crops/blueberry");
    public static final Tag.Named<Item> CROPS_BLACKBERRY = forgeTagItem("crops/blackberry");
    public static final Tag.Named<Item> CROPS_STRAWBERRY = forgeTagItem("crops/strawberry");
    public static final Tag.Named<Item> CROPS_GRAPES = forgeTagItem("crops/grape");

    /* Fruit */
    public static final Tag.Named<Item> FRUITS = forgeTagItem("fruits");
    public static final Tag.Named<Item> FRUITS_RASPBERRY = forgeTagItem("fruits/raspberry");
    public static final Tag.Named<Item> FRUITS_BLUEBERRY = forgeTagItem("fruits/blueberry");
    public static final Tag.Named<Item> FRUITS_BLACKBERRY = forgeTagItem("fruits/blackberry");
    public static final Tag.Named<Item> FRUITS_STRAWBERRY = forgeTagItem("fruits/strawberry");
    public static final Tag.Named<Item> FRUITS_GRAPES = forgeTagItem("fruits/grape");

    /* Veggies */


    private  static Tag.Named<Item> forgeTagItem(String path) {
        return ItemTags.bind(new ResourceLocation("forge", path).toString());
    }

}
