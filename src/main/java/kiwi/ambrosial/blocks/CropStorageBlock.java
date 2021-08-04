package kiwi.ambrosial.blocks;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class CropStorageBlock extends Block {
    public CropStorageBlock(Properties properties) {
        super(Block.Properties.of(Material.VEGETABLE));
        this.properties.strength(2.0F, 3.0F);
        this.properties.sound(SoundType.AZALEA);
    }

    @Override
    public void fillItemCategory(CreativeModeTab tab, NonNullList<ItemStack> items) {
        super.fillItemCategory(tab, items);
    }
}
