package kiwi.ambrosial.setup;

import kiwi.ambrosial.Ambrosial;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Ambrosial.MODID)
public class CommonEventHandler {

    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }

    /* public static void registerCompostables() {
        ComposterBlock.COMPOSTABLES.put();
    } */
}
