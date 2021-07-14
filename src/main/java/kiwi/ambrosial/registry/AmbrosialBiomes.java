package kiwi.ambrosial.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.BiomeSubRegistryHelper;
import kiwi.ambrosial.Ambrosial;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmbrosialBiomes {

    private static final BiomeSubRegistryHelper HELPER = Ambrosial.REGISTRY_HELPER.getBiomeSubHelper();

    public static final BiomeSubRegistryHelper.KeyedBiome TEST_BIOME = HELPER.createBiome("test_biome", () -> createTestBiome(0.1F, 0.2F));

    public static  void addBiomesToGeneration() {
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(TEST_BIOME.getKey(), 1));
    }

    public static void addBiomeTypes() {
        BiomeDictionary.addTypes(TEST_BIOME.getKey(), BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HOT);
    }

    private static Biome createTestBiome(float depth, float scale) {
        return (new Biome.Builder())
                .precipitation(Biome.RainType.SNOW)
                .biomeCategory(Biome.Category.SWAMP)
                .depth(depth)
                .scale(scale)
                .temperature(0.7F)
                .downfall(0.8F)
                .specialEffects((new BiomeAmbience.Builder())
                        .waterColor(0xEB4034)
                        .waterFogColor(0x52EB34)
                        .fogColor(0x7134EB)
                        .skyColor(getSkyColorWithTemperatureModifier(0.7F))
                        .ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS)
                        .grassColorOverride(0x34D2EB)
                        .foliageColorOverride(0xF567DD)
                        .build())
                .mobSpawnSettings(new MobSpawnInfo.Builder().build())
                .generationSettings((new BiomeGenerationSettings.Builder())
                        .surfaceBuilder(ConfiguredSurfaceBuilders.SWAMP)
                        .build()).build();
    }

    private static int getSkyColorWithTemperatureModifier(float temperature) {
        float lvt_1_1_ = temperature / 3.0F;
        lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
        return MathHelper.hsvToRgb(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }

}
