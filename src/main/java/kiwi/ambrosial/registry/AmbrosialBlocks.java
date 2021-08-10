package kiwi.ambrosial.registry;

import kiwi.ambrosial.blocks.crops.BaseCropBlock;
import kiwi.ambrosial.blocks.crops.KiwiBushBlock;
import kiwi.ambrosial.items.BaseBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

@SuppressWarnings("unused")
public class AmbrosialBlocks {
    private static ToIntFunction<BlockState> getLightValueLit(int lightValue) {
        return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }

    /* Workstations */


    /* Crops */
    public static final RegistryObject<Block> RADISH_CROP = registerNoItem("radishes", () -> new BaseCropBlock(Block.Properties.copy(Blocks.CARROTS)));
    public static final RegistryObject<Block> KIWI_CROP = registerNoItem("kiwis", () -> new KiwiBushBlock(Block.Properties.copy(Blocks.WHEAT)));

    /* Crop Storage */
   /* public static final RegistryObject<Block> RASPBERRY_BUSHEL = register("raspberry_bushel", () ->
            new Block(Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.AZALEA).friction(0.8F)));*/

    public static void register() {

    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return RegistryHandler.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        RegistryHandler.ITEMS.register(name, () -> new BaseBlockItem(ret.get()));
        return ret;
    }
}
