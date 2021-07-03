package kiwi.ambrosial.blocks.crops;

import kiwi.ambrosial.registry.ModItems;
import kiwi.ambrosial.registry.ModSounds;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

@SuppressWarnings("deprecation")
public class KiwiBushBlock extends GrowableBushBlock implements IGrowable {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
    private static final int KIWI_BEARING_AGE  = 7;
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
            box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
            box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
            box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
            box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
            box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public KiwiBushBlock(AbstractBlock.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE_BY_AGE[state.getValue(AGE)];
    }

    @Override
    public ItemStack getCloneItemStack(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.KIWI_SEEDS.get());
    }

    @Override
    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        int age = state.getValue(AGE);
        boolean isMature = age == KIWI_BEARING_AGE;
        if (!isMature && player.getItemInHand(handIn).getItem() == Items.BONE_MEAL) {
            return ActionResultType.PASS;
        } else if (isMature) {
            int j = 1 + worldIn.random.nextInt(2);
            popResource(worldIn, pos, new ItemStack(ModItems.KIWI.get(), j));
            worldIn.playSound(null, pos, ModSounds.ITEM_KIWI_PICK_FROM_BUSH.get(), SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
            worldIn.setBlock(pos, state.setValue(AGE, KIWI_BEARING_AGE -3), 2);
            return ActionResultType.sidedSuccess(worldIn.isClientSide);
        } else {
            return super.use(state, worldIn, pos, player, handIn, hit);
        }
    }
}
