package com.kiwi.ambrosial;

import com.kiwi.ambrosial.registry.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public class AmbrosialItemGroup extends ItemGroup {

    public AmbrosialItemGroup(String label) {
        super(label);
    }

    @Override
    @Nonnull
    public ItemStack makeIcon() {
        return new ItemStack(ModItems.SLICED_BREAD.get());
    }

    private void registerIngredients(NonNullList<ItemStack> items) {
        items.add(new ItemStack(ModItems.SLICED_BREAD.get()));
    }
}
