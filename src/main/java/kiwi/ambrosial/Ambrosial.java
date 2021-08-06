package kiwi.ambrosial;

import kiwi.ambrosial.config.AmbrosialConfig;
import kiwi.ambrosial.registry.RegistryHandler;
import kiwi.ambrosial.setup.ClientEventHandler;
import kiwi.ambrosial.setup.CommonEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@SuppressWarnings("unused")
@Mod(Ambrosial.MODID)
@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ambrosial {
    public  static final String MODID = "ambrosial";
    public static final AmbrosialCreativeTab CREATIVE_TAB = new AmbrosialCreativeTab(Ambrosial.MODID);

    public Ambrosial() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(ClientEventHandler::init);
        modEventBus.addListener(CommonEventHandler::init);

        RegistryHandler.register();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, AmbrosialConfig.CLIENT_CONFIG, "ambrosial-client.toml");
        AmbrosialConfig.loadConfig(AmbrosialConfig.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("ambrosial-client.toml").toString());

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AmbrosialConfig.COMMON_CONFIG, "ambrosial-common.toml");
        AmbrosialConfig.loadConfig(AmbrosialConfig.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("ambrosial-common.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);
    }
}
