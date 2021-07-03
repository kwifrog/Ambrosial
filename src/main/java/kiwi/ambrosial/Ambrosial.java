package kiwi.ambrosial;

import kiwi.ambrosial.registry.ModBlocks;
import kiwi.ambrosial.registry.ModItems;
import kiwi.ambrosial.registry.ModSounds;
import kiwi.ambrosial.setup.ClientEventHandler;
import kiwi.ambrosial.setup.CommonEventHandler;
import kiwi.ambrosial.setup.Config;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Ambrosial.MODID)
@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ambrosial
{
    public static final String MODID = "ambrosial";

    public static final  AmbrosialItemGroup ITEM_GROUP = new AmbrosialItemGroup(Ambrosial.MODID);

    public Ambrosial() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(ClientEventHandler::init);
        modEventBus.addListener(CommonEventHandler::init);

        //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT_CONFIG);

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModSounds.SOUNDS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}

