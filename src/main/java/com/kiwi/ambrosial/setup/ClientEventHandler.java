package com.kiwi.ambrosial.setup;

import com.kiwi.ambrosial.Ambrosial;
import com.kiwi.ambrosial.registry.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Ambrosial.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventHandler {

    public static void init(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.KIWI_CROP.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.DAIKON_CROP.get(), RenderType.cutout());
    }

}
