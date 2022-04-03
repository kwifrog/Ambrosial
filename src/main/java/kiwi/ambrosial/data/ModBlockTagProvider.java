package kiwi.ambrosial.data;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(DataGenerator gen, @Nullable ExistingFileHelper helper) {
        super(gen, Ambrosial.MODID, helper);
    }

    @Override
    public String getName() {
        return "Ambrosial Block Tags";
    }
}
