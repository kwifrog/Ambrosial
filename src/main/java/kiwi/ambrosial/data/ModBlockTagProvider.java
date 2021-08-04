package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(DataGenerator gen, @Nullable ExistingFileHelper helper) {
        super(gen, Ambrosial.MODID, helper);
    }
}
