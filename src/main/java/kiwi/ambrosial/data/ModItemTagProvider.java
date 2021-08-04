package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.AmbrosialItems;
import kiwi.ambrosial.utils.ForgeTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
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

        tag(ForgeTags.BREAD).addTag(ForgeTags.BREAD_WHEAT);
        tag(ForgeTags.BREAD_WHEAT).add(Items.BREAD);

        tag(ForgeTags.COOKED_BEEF).add(Items.COOKED_BEEF);
        tag(ForgeTags.COOKED_CHICKEN).add(Items.COOKED_CHICKEN);
        tag(ForgeTags.COOKED_PORK).add(Items.COOKED_PORKCHOP);
        tag(ForgeTags.COOKED_MUTTON).add(Items.COOKED_MUTTON);
        //tag(ForgeTags.COOKED_EGGS).add();
        tag(ForgeTags.COOKED_FISH).addTags(
                ForgeTags.COOKED_FISH_COD,
                ForgeTags.COOKED_FISH_SALMON);
        tag(ForgeTags.COOKED_FISH_COD).add(Items.COOKED_COD);
        tag(ForgeTags.COOKED_FISH_SALMON).add(Items.COOKED_SALMON);

        tag(ForgeTags.EGGS).add(Items.EGG);

        tag(ForgeTags.GRAIN).addTag(ForgeTags.GRAIN_WHEAT);
        tag(ForgeTags.GRAIN_WHEAT).add(Items.WHEAT);

        tag(ForgeTags.MILK).addTag(ForgeTags.MILK_BUCKET);
        tag(ForgeTags.MILK_BUCKET).add(Items.MILK_BUCKET);

        tag(ForgeTags.RAW_BEEF).add(Items.BEEF);
        tag(ForgeTags.RAW_CHICKEN).add(Items.CHICKEN);
        tag(ForgeTags.RAW_PORK).add(Items.PORKCHOP);
        tag(ForgeTags.RAW_MUTTON).add(Items.MUTTON);
        tag(ForgeTags.RAW_FISH).addTags(
                ForgeTags.RAW_FISH_COD,
                ForgeTags.RAW_FISH_SALMON,
                ForgeTags.RAW_FISH_TROPICAL);
        tag(ForgeTags.RAW_FISH_COD).add(Items.COD);
        tag(ForgeTags.RAW_FISH_SALMON).add(Items.SALMON);
        tag(ForgeTags.RAW_FISH_TROPICAL).add(Items.TROPICAL_FISH);

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

        tag(ForgeTags.VEGETABLES).addTags(
                ForgeTags.VEGETABLES_BEETROOT,
                ForgeTags.VEGETABLES_CARROT,
                ForgeTags.VEGETABLES_POTATO);
        tag(ForgeTags.VEGETABLES_BEETROOT).add(Items.BEETROOT);
        tag(ForgeTags.VEGETABLES_CARROT).add(Items.CARROT);
        tag(ForgeTags.VEGETABLES_POTATO).add(Items.POTATO);
    }
}
