package kiwi.ambrosial.registry;

import kiwi.ambrosial.items.AmbrosialBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class AmbrosialBlocks {

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
        RegistryHandler.ITEMS.register(name, () -> new AmbrosialBlockItem(ret.get()));
        return ret;
    }
}
