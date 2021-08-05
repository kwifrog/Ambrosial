package kiwi.ambrosial.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class HungerConfig {
    public static ForgeConfigSpec.IntValue berry;
    public static ForgeConfigSpec.IntValue grape;
    public static ForgeConfigSpec.IntValue kiwi;
    public static ForgeConfigSpec.IntValue pineapple;
    public static ForgeConfigSpec.IntValue onion;
    public static ForgeConfigSpec.IntValue tomato;
    public static ForgeConfigSpec.IntValue cabbage;
    public static ForgeConfigSpec.IntValue radish;

    public static void init(ForgeConfigSpec.Builder config) {
        berry = config.defineInRange("Berries | Raspberry, Blueberry, Blackberry & Strawberry | (Default = 1)", 1, 0, Integer.MAX_VALUE);
        grape = config.defineInRange("Grapes (Default = 3)", 3, 0, Integer.MAX_VALUE);
        kiwi = config.defineInRange("Kiwi (Default = 3)", 3, 0, Integer.MAX_VALUE);
        pineapple = config.defineInRange("Pineapple (Default = 4)", 4, 0, Integer.MAX_VALUE);
        onion = config.defineInRange("Onion (Default = 2)", 2, 0, Integer.MAX_VALUE);
        tomato = config.defineInRange("Tomato (Default = 3)", 3, 0, Integer.MAX_VALUE);
        cabbage = config.defineInRange("Cabbage (Default = 3)", 3, 0, Integer.MAX_VALUE);
        radish = config.defineInRange("Radish (Default = 2)", 2, 0, Integer.MAX_VALUE);
    }
}
