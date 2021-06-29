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

    @Override
    public void fillItemList(NonNullList<ItemStack> items) {

        registerCrops(items);
        registerIngredients(items);
        registerItems(items);

    }

    private void registerCrops(NonNullList<ItemStack> items) {
        items.add(new ItemStack(ModItems.KIWI.get()));
        items.add(new ItemStack(ModItems.KIWI_SEEDS.get()));
        items.add(new ItemStack(ModItems.DAIKON.get()));
        items.add(new ItemStack(ModItems.DAIKON_SEEDS.get()));
    }

    private void registerIngredients(NonNullList<ItemStack> items) {
        items.add(new ItemStack(ModItems.SLICED_BREAD.get()));
        items.add(new ItemStack(ModItems.TOAST.get()));
    }

    private void registerItems(NonNullList<ItemStack> items) {
        items.add(new ItemStack(ModItems.CANNING_JAR.get()));
    }
}
