package kiwi.ambrosial.setup;

import kiwi.ambrosial.registry.AmbrosialBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class CropRenderer {
    public static void registerCutout() {

        ItemBlockRenderTypes.setRenderLayer(AmbrosialBlocks.RADISH_CROP.get(), RenderType.cutoutMipped());
        ItemBlockRenderTypes.setRenderLayer(AmbrosialBlocks.KIWI_CROP.get(), RenderType.cutoutMipped());

    }
}
