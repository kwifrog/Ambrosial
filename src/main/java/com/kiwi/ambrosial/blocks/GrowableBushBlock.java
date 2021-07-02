package com.kiwi.ambrosial.blocks;

import net.minecraft.block.*;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.util.Constants;

import java.util.Random;

@SuppressWarnings("deprecation")
public class GrowableBushBlock extends BushBlock implements IGrowable {

    public static final IntegerProperty AGE = BlockStateProperties.AGE_7;

    public GrowableBushBlock(AbstractBlock.Properties properties) {
        super(properties);
    }

   public int getMaxAge() {
        return 7;
   }

   protected int getAge(BlockState state) {
        return state.getValue(AGE);
   }

   public BlockState getStateForAge(int age) {
        return this.defaultBlockState().setValue(AGE, age);
   }

   @Override
   public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        int age = state.getValue(AGE);
        if (age < getMaxAge() && worldIn.getRawBrightness(pos.above(),0) >= 9 && ForgeHooks.onCropsGrowPre(worldIn, pos, state, rand.nextInt(5) == 0)) {
            worldIn.setBlock(pos, state.setValue(AGE, age + 1), Constants.BlockFlags.BLOCK_UPDATE);
            ForgeHooks.onCropsGrowPost(worldIn, pos, state);
        }
   }

    @Override
    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return PlantType.CROP;
    }

    public void growCrops(World worldIn, BlockPos pos, BlockState state) {
        int newAge = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
        int maxAge = this.getMaxAge();
        if (newAge > maxAge) {
            newAge = maxAge;
        }

        worldIn.setBlock(pos, this.getStateForAge(newAge), Constants.BlockFlags.BLOCK_UPDATE);
    }

    protected int getBonemealAgeIncrease(World worldIn) {
        return MathHelper.nextInt(worldIn.random, 2, 4);
    }

   @Override
    public boolean isValidBonemealTarget(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return state.getValue(AGE) < getMaxAge();
   }

   @Override
    public boolean isBonemealSuccess(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return state.getValue(AGE) < 7;
   }

   @Override
    public void performBonemeal(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
        this.growCrops(worldIn, pos, state);
   }
   @Override
   protected boolean mayPlaceOn(BlockState state, IBlockReader worldIn, BlockPos pos) {
       return state.getBlock() instanceof FarmlandBlock;
   }

   @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(AGE);
   }
}
