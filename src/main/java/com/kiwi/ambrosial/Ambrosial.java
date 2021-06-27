package com.kiwi.ambrosial;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Ambrosial.MODID)
@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Ambrosial
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "ambrosial";

    public static final  AmbrosialItemGroup ITEM_GROUP = new AmbrosialItemGroup(Ambrosial.MODID);

    public Ambrosial() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
