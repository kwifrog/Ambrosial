package kiwi.ambrosial.events;

import net.minecraftforge.common.MinecraftForge;

public class EventsHandler {
    public static void setupEvents() {
        MinecraftForge.EVENT_BUS.register(new TemptationEvent());
    }
}
