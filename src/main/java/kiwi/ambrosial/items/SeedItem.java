package kiwi.ambrosial.items;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.blocks.crops.BaseCropBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class SeedItem extends ItemNameBlockItem {
    public SeedItem(Block block, Properties properties) {
        super(block, new Item.Properties().tab(Ambrosial.CREATIVE_TAB));
        ((BaseCropBlock) block).setSeed(this);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        BlockPos hitPos = context.getClickedPos();
        Level world = context.getLevel();
        BlockState state = world.getBlockState(hitPos);
        if (state.is(Blocks.FARMLAND)) {
            return super.useOn(context);
        }
        return InteractionResult.FAIL;
    }

}
