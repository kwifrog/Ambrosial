package kiwi.ambrosial;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public class AmbrosialItemGroup extends ItemGroup {

    public AmbrosialItemGroup(String label) {
        super(label);
    }

    @Override
    @Nonnull
    public ItemStack makeIcon() {
        return new ItemStack(Items.OBSIDIAN);
    }
}
