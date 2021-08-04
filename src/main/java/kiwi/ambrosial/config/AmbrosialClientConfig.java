package kiwi.ambrosial.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class AmbrosialClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec CLIENT_CONFIG;

    static {
        BUILDER.push("Utilities");
        UtilConfig.init(BUILDER);
        BUILDER.pop();
        CLIENT_CONFIG = BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        CommentedFileConfig file = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }

}
