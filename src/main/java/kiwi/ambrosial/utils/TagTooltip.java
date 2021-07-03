package kiwi.ambrosial.utils;

import kiwi.ambrosial.setup.Config;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@OnlyIn(Dist.CLIENT)
public class TagTooltip {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new TagTooltip());
    }

    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent event) {
        if(Config.SHOW_TOOLTIP_TAGS.get()&&event.getFlags().isAdvanced())
        {
            for(ResourceLocation tip : event.getItemStack().getItem().getTags())
                event.getToolTip().add(TextUtils.applyFormat(
                        new StringTextComponent(tip.toString()),
                        TextFormatting.GRAY
                ));
        }
    }
}
