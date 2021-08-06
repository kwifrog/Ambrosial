package kiwi.ambrosial.items;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BaseBlockItem extends BlockItem {
    public BaseBlockItem(Block block) {
        super(block, new Item.Properties().tab(Ambrosial.CREATIVE_TAB));
    }
}
