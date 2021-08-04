package kiwi.ambrosial.utils;

import kiwi.ambrosial.config.UtilConfig;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
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
        if (UtilConfig.tagTooltip.get()&&event.getFlags().isAdvanced()) {
            event.getToolTip().add(new TextComponent(""));
            event.getToolTip().add(new TextComponent("Tags:").withStyle(ChatFormatting.DARK_GRAY));
            for (ResourceLocation tip : event.getItemStack().getItem().getTags())
                event.getToolTip().add(new TextComponent("- " + tip.toString()).withStyle(ChatFormatting.DARK_GRAY));

        }
    }
}
