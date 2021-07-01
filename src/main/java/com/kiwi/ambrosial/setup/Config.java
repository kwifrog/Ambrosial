package com.kiwi.ambrosial.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config {

    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    // COMMON

    // CLIENT
    public static  final String CATEGORY_CLIENT = "client";

    public static ForgeConfigSpec.BooleanValue SHOW_TOOLTIP_TAGS;

    static {

        // COMMON

        // CLIENT
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        CLIENT_BUILDER.comment("Client Settings").push(CATEGORY_CLIENT);
        SHOW_TOOLTIP_TAGS = CLIENT_BUILDER.comment("Should Tags show in the Tooltip?").define("showTooltipTags", true);
        CLIENT_BUILDER.pop();

        CLIENT_CONFIG = CLIENT_BUILDER.build();

    }

}
