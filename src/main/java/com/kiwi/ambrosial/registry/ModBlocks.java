package com.kiwi.ambrosial.registry;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.blocks.DaikonsBlock;
import com.kiwi.ambrosial.blocks.KiwisBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Ambrosial.MODID);

    // Crops
    public static RegistryObject<Block> KIWI_CROP = BLOCKS.register("kiwis",
            () -> new KiwisBlock(Block.Properties.of(Material.PLANT).noCollission().instabreak().randomTicks()));
    public static RegistryObject<Block> DAIKON_CROP = BLOCKS.register("daikons",
            () -> new DaikonsBlock(Block.Properties.of(Material.PLANT).noCollission().instabreak().randomTicks()));
}
