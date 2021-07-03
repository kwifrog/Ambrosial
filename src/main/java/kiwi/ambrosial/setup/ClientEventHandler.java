package kiwi.ambrosial.setup;

import kiwi.ambrosial.Ambrosial;
import kiwi.ambrosial.registry.ModBlocks;
import kiwi.ambrosial.utils.TagTooltip;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler {

    public static void init(final FMLClientSetupEvent event) {
        RenderType cutout = RenderType.cutout();
        RenderTypeLookup.setRenderLayer(ModBlocks.KIWI_CROP.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.DAIKON_CROP.get(), cutout);
        RenderTypeLookup.setRenderLayer(ModBlocks.PICKLE_CROP.get(),cutout);

        TagTooltip.init();
    }

}
