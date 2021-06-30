package com.kiwi.ambrosial;

import com.kiwi.ambrosial.registry.ModBlocks;
import com.kiwi.ambrosial.registry.ModItems;
import com.kiwi.ambrosial.registry.ModSounds;
import com.kiwi.ambrosial.setup.ClientEventHandler;
import com.kiwi.ambrosial.setup.CommonEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
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

        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModSounds.SOUNDS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
