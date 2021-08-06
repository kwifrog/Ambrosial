package kiwi.ambrosial.setup;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.events.EventsHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Ambrosial.MODID)
public class CommonEventHandler {

    public static void init(final FMLCommonSetupEvent event) {
            EventsHandler.setupEvents();
            Compostables.register();
    }
}
