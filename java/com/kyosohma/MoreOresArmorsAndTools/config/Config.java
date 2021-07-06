package com.kyosohma.MoreOresArmorsAndTools.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.kyosohma.MoreOresArmorsAndTools.MoreOresArmorsAndTools;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.io.File;

@Mod.EventBusSubscriber
public class Config
{
    private static final ForgeConfigSpec.Builder server_builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec server_config = server_builder.build();

    private static final ForgeConfigSpec.Builder client_builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec client_config = client_builder.build();

    public static void loadConfig(ForgeConfigSpec config, String path)
    {
        MoreOresArmorsAndTools.LOGGER.info("Loading Config: " + path);
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        MoreOresArmorsAndTools.LOGGER.info("Built config: " + path);
        file.load();
        MoreOresArmorsAndTools.LOGGER.info("loaded Config: " + path);
        config.setConfig(file);
    }
}
