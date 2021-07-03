package kiwi.ambrosial.registry;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.blocks.crops.DaikonBlock;
import kiwi.ambrosial.blocks.crops.FertilePickleBlock;
import kiwi.ambrosial.blocks.crops.KiwiBushBlock;
import net.minecraft.block.AbstractBlock;
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
            () -> new KiwiBushBlock(AbstractBlock.Properties.copy(Blocks.WHEAT)));
    public static RegistryObject<Block> DAIKON_CROP = BLOCKS.register("daikons",
            () -> new DaikonBlock(AbstractBlock.Properties.copy(Blocks.WHEAT)));
    public static RegistryObject<Block> PICKLE_CROP = BLOCKS.register("pickles",
            () -> new FertilePickleBlock(AbstractBlock.Properties.copy(Blocks.WHEAT)));
}
