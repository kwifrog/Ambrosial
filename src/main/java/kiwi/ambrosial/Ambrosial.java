package kiwi.ambrosial;

import kiwi.ambrosial.setup.AmbrosialConfig;
import kiwi.ambrosial.setup.AmbrosialCreativeTab;
import kiwi.ambrosial.setup.ClientEventHandler;
import kiwi.ambrosial.setup.CommonEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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

        //ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, AmbrosialConfig.CLIENT_CONFIG);
        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, AmbrosialConfig.COMMON_CONFIG);


        MinecraftForge.EVENT_BUS.register(this);
    }
}
