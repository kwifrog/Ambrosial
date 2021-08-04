package kiwi.ambrosial.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class UtilConfig {

    public static ForgeConfigSpec.BooleanValue tagTooltip;

    public static void init(ForgeConfigSpec.Builder config) {
        tagTooltip = config.define("Show Tags on Tooltip [In Advanced F3+H Mode]", true);
    }
}
