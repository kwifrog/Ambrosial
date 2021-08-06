package kiwi.ambrosial.blocks.crops;

import kiwi.ambrosial.items.SeedItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

import java.util.Random;

@SuppressWarnings({"unused", "deprecation"})
public class BaseBushBlock extends BushBlock implements BonemealableBlock {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_7;
    private SeedItem seed;

    public BaseBushBlock(Block.Properties properties) {
        super(properties);
    }

    public int getMaxAge() {
        return 7;
    }

    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    protected int getAge(BlockState state) {
        return state.getValue(AGE);
    }

    public BlockState getStateForAge(int age) {
        return defaultBlockState().setValue(AGE, age);
    }

    public boolean isMaxAge(BlockState state) {
        return state.getValue(getAgeProperty()) >= getMaxAge();
    }

    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.CROP;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return !isMaxAge(state);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, Random rand) {
        if (!level.isAreaLoaded(pos, 1)) return;
        if (level.getRawBrightness(pos, 0) >= 9) {
            int age = getAge(state);
            if (age < getMaxAge()) {
                float speed = getGrowthSpeed(this, level, pos);
                if (ForgeHooks.onCropsGrowPre(level, pos, state, rand.nextInt((int)(25.0F / speed) + 1) == 0)) {
                    level.setBlock(pos, getStateForAge(age + 1), 2);
                    ForgeHooks.onCropsGrowPost(level, pos, state);
                }
            }
        }
    }

    public void growCrops(Level level, BlockPos pos, BlockState state) {
        int newAge = getAge(state) + getBonemealAgeIncrease(level);
        int maxAge = getMaxAge();
        if (newAge > maxAge) {
            newAge = maxAge;
        }
        level.setBlock(pos, getStateForAge(newAge), 2);
    }

    protected int getBonemealAgeIncrease(Level level) {
        return Mth.nextInt(level.random, 2, 4);
    }
    
    protected static float getGrowthSpeed(Block block, BlockGetter world, BlockPos pos) {
        float maxSpeed = 1.0F;
        BlockPos blockPos = pos.below();
        
        for (int x = -1; x <= 1; ++x) {
            for (int y = -1; y <= 1; ++y) {
                float minSpeed = 0.0F;
                BlockState blockState = world.getBlockState(blockPos.offset(x, 0, y));
                if (blockState.canSustainPlant(world, blockPos.offset(x, 0, y), Direction.UP, (IPlantable) block)) {
                    minSpeed = 1.0F;
                    if (blockState.isFertile(world, pos.offset(x, 0, y))) {
                        minSpeed = 3.0F;
                    }
                }
                
                if (x != 0 || y != 0) {
                    minSpeed /= 4.0F;
                }
                
                maxSpeed += minSpeed;
            }
        }
        
        BlockPos blockPos1 = pos.north();
        BlockPos blockPos2 = pos.south();
        BlockPos blockPos3 = pos.west();
        BlockPos blockPos4 = pos.east();
        boolean flag = world.getBlockState(blockPos3).is(block) || world.getBlockState(blockPos4).is(block);
        boolean flag1 = world.getBlockState(blockPos1).is(block) || world.getBlockState(blockPos2).is(block);
        if (flag && flag1) {
            maxSpeed /= 2.0F;
        } else {
            boolean flag2 = world.getBlockState(blockPos3.north()).is(block) || world.getBlockState(blockPos4.north()).is(block) || world.getBlockState(blockPos4.south()).is(block) || world.getBlockState(blockPos3.south()).is(block);
            if (flag2) {
                maxSpeed /= 2.0F;
            }
        }

        return maxSpeed;
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter world, BlockPos pos, BlockState state, boolean bool) {
        return !isMaxAge(state);
    }

    @Override
    public boolean isBonemealSuccess(Level level, Random random, BlockPos pos, BlockState state) {
        return !isMaxAge(state);
    }

    public void performBonemeal(ServerLevel level, Random rand, BlockPos pos, BlockState state) {
        growCrops(level, pos, state);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter world, BlockPos pos) {
        return state.getBlock() instanceof FarmBlock;
    }
    public void setSeed(SeedItem seed) {
        this.seed = seed;
    }

    protected ItemLike getBaseSeedId() {
        return seed;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
