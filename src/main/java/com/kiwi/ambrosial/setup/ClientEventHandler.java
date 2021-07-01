package com.kiwi.ambrosial.setup;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.registry.ModBlocks;
import com.kiwi.ambrosial.utils.ShowTagsTooltip;
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

        ShowTagsTooltip.init();
    }

}
