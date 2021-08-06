package kiwi.ambrosial.items;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.blocks.crops.GrowableBushBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class BushSeedItem extends ItemNameBlockItem {
    public BushSeedItem(Block block, Properties properties) {
        super(block, new Properties().tab(Ambrosial.CREATIVE_TAB));
        ((GrowableBushBlock) block).setSeed(this);
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
