package kiwi.ambrosial.utils;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;

public class TextUtils {

    public static IFormattableTextComponent applyFormat(ITextComponent component, TextFormatting... color) {
        Style style = component.getStyle();
        for (TextFormatting format : color)
            style = style.applyFormats(format);
        return component.copy().setStyle(style);
    }
}
