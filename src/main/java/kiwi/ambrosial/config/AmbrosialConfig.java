package kiwi.ambrosial.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class AmbrosialConfig {
    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec COMMON_CONFIG;

    static {
        /* CLIENT */
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        CLIENT_BUILDER.push("Utilities");
        UtilConfig.init(CLIENT_BUILDER);
        CLIENT_BUILDER.pop();
        CLIENT_CONFIG = CLIENT_BUILDER.build();

        /* COMMON */
        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

        COMMON_BUILDER.push("Hunger Value Settings (1 = Half Hunger Shank)");
        HungerConfig.init(COMMON_BUILDER);
        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        CommentedFileConfig file = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }

}
