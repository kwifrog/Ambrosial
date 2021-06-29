package com.kiwi.ambrosial.registry;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.blocks.DaikonBlock;
import com.kiwi.ambrosial.blocks.KiwiBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


@SuppressWarnings("unused")
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ambrosial.MODID);

    // Crops
    public static RegistryObject<Block> KIWI_CROP = BLOCKS.register("kiwis",
            () -> new KiwiBlock(Block.Properties.copy(Blocks.WHEAT)));
    public static RegistryObject<Block> DAIKON_CROP = BLOCKS.register("daikons",
            () -> new DaikonBlock(Block.Properties.copy(Blocks.WHEAT)));
}
