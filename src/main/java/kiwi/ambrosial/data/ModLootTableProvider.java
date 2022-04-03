package kiwi.ambrosial.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;

public class ModLootTableProvider extends LootTableProvider {
    public ModLootTableProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    public String getName() {
        return "Ambrosial Loot Tables";
    }
}
