package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.AmbrosialItems;
import kiwi.ambrosial.utils.ForgeTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(DataGenerator gen, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper helper) {
        super(gen, blockTagsProvider, Ambrosial.MODID, helper);
    }

    @Override
    protected void addTags() {

        registerForgeTags();
        registerModTags();

    }

    @SuppressWarnings("unchecked")
    private void registerModTags() {

    }

    @SuppressWarnings("unchecked")
    private void registerForgeTags() {

        /* Crops */
        tag(ForgeTags.CROPS).addTags(
                ForgeTags.CROPS_RASPBERRY,
                ForgeTags.CROPS_BLUEBERRY,
                ForgeTags.CROPS_BLACKBERRY,
                ForgeTags.CROPS_STRAWBERRY,
                ForgeTags.CROPS_GRAPES);
        tag(ForgeTags.CROPS_RASPBERRY).add(AmbrosialItems.RASPBERRY.get());
        tag(ForgeTags.CROPS_BLUEBERRY).add(AmbrosialItems.BLUEBERRY.get());
        tag(ForgeTags.CROPS_BLACKBERRY).add(AmbrosialItems.BLACKBERRY.get());
        tag(ForgeTags.CROPS_STRAWBERRY).add(AmbrosialItems.STRAWBERRY.get());
        tag(ForgeTags.CROPS_GRAPES).add(AmbrosialItems.GRAPE.get());

        /* Fruit */
        tag(ForgeTags.FRUITS).addTags(
                ForgeTags.FRUITS_RASPBERRY,
                ForgeTags.FRUITS_BLUEBERRY,
                ForgeTags.FRUITS_BLACKBERRY,
                ForgeTags.FRUITS_STRAWBERRY,
                ForgeTags.FRUITS_GRAPES);
        tag(ForgeTags.FRUITS_RASPBERRY).add(AmbrosialItems.RASPBERRY.get());
        tag(ForgeTags.FRUITS_BLUEBERRY).add(AmbrosialItems.BLUEBERRY.get());
        tag(ForgeTags.FRUITS_BLACKBERRY).add(AmbrosialItems.BLACKBERRY.get());
        tag(ForgeTags.FRUITS_STRAWBERRY).add(AmbrosialItems.STRAWBERRY.get());
        tag(ForgeTags.FRUITS_GRAPES).add(AmbrosialItems.GRAPE.get());
    }
}
