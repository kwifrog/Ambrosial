package kiwi.ambrosial.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

@SuppressWarnings("unused")
public class AmbrosialCreativeTab extends CreativeModeTab {

    public AmbrosialCreativeTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.GOLDEN_APPLE);
    }
}
