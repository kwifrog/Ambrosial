package kiwi.ambrosial;

import kiwi.ambrosial.registry.AmbrosialItems;
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
        return new ItemStack(AmbrosialItems.BLUEBERRY.get());
    }
}
