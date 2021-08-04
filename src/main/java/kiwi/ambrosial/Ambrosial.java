package kiwi.ambrosial;

import kiwi.ambrosial.config.AmbrosialClientConfig;
import kiwi.ambrosial.registry.AmbrosialBlocks;
import kiwi.ambrosial.registry.AmbrosialItems;
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

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, AmbrosialClientConfig.CLIENT_CONFIG, "ambrosial-client.toml");
        AmbrosialClientConfig.loadConfig(AmbrosialClientConfig.CLIENT_CONFIG, FMLPaths.CONFIGDIR.get().resolve("ambrosial-client.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);
    }
}
