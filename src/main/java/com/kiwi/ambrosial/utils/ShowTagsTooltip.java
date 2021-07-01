package com.kiwi.ambrosial.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.util.InputMappings;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public class ShowTagsTooltip {
    public KeyBinding showTagsBind = new KeyBinding("key.showtags", KeyConflictContext.UNIVERSAL, InputMappings.Type.KEYSYM, GLFW.GLFW_KEY_LEFT_SHIFT, "key.categories.inventory");

    public static void init() {
        MinecraftForge.EVENT_BUS.register(new ShowTagsTooltip());
    }

    public ShowTagsTooltip() {
        ClientRegistry.registerKeyBinding(showTagsBind);

    }

    private boolean isKeyBindDown(KeyBinding bind) {
        if (bind.isDown()) return true;
        InputMappings.Input key = bind.getKey();
        int keyCode = key.hashCode();
        long handle = Minecraft.getInstance().getGame().hashCode();
        return InputMappings.isKeyDown(handle, keyCode) && bind.getKeyModifier().isActive(bind.getKeyConflictContext());
    }

    @SubscribeEvent
    public void onTooltip(ItemTooltipEvent event) {
        if (event == null) return;
        List<ITextComponent> toolTip = event.getToolTip();
        if (!isKeyBindDown(showTagsBind)) {
            toolTip.add(new TranslationTextComponent("tooltip.showTags", showTagsBind.getTranslatedKeyMessage()));
            return;
        }
        for (ResourceLocation tag : event.getItemStack().getItem().getTags()) {
            toolTip.add(new TranslationTextComponent("tooltip.tag.prefix", new StringTextComponent(tag.toString())));
        }
    }
}
