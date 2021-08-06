package kiwi.ambrosial.setup;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.AmbrosialBlocks;
import kiwi.ambrosial.utils.TagTooltip;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler {

    public static void init(final FMLClientSetupEvent event) {
        TagTooltip.init();
        CropRenderer.registerCutout();

    }

}
