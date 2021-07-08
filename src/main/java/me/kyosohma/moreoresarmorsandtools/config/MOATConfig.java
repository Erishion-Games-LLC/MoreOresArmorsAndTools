package me.kyosohma.moreoresarmorsandtools.config;

import me.kyosohma.moreoresarmorsandtools.world.gen.OreType;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import org.apache.commons.lang3.tuple.Pair;

import java.util.EnumMap;
import java.util.Map;

@Mod.EventBusSubscriber
public class MOATConfig
{
    public static final ForgeConfigSpec COMMON_SPEC;
    public static final Common COMMON;

    static
    {
        Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = specPair.getRight();
        COMMON = specPair.getLeft();
    }

    public static class Common
    {
        private final Map<OreType, OreSettings> oreConfig = new EnumMap<>(OreType.class);

        public Common(ForgeConfigSpec.Builder builder)
        {
            builder.comment("World generation settings for MOAT").push("world_generation");

            for (OreType ore : OreType.values())
            {
                builder.comment("Generation settings for " + ore).push(ore.toString());

                ForgeConfigSpec.BooleanValue shouldGenerate = builder
                        .comment("Determines if the ore should generate")
                        .define("shouldGenerate", true);
                ForgeConfigSpec.IntValue veinSize = builder
                        .comment("Maximum number of blocks in a vein")
                        .defineInRange("veinSize", ore.getVeinSize(), 1, 512);
                ForgeConfigSpec.IntValue minHeight = builder
                        .comment("Minimum height for the ore generation")
                        .defineInRange("minHeight", ore.getMinHeight(), 0, 255);
                ForgeConfigSpec.IntValue maxHeight = builder
                        .comment("Maximum height (exclusive) for the ore generation")
                        .defineInRange("maxHeight", ore.getMaxHeight(), 1, 256);
                ForgeConfigSpec.IntValue veinsPerChunk = builder
                        .comment("Maximum height for the ore generation")
                        .defineInRange("veinsPerChunk", ore.getVeinsPerChunk(), 1, 128);

                oreConfig.put(ore, new OreSettings(shouldGenerate, veinSize, minHeight, maxHeight, veinsPerChunk));

                builder.pop();
            }

            builder.pop();
        }

        public Map<OreType, OreSettings> getOreConfig()
        {
            return oreConfig;
        }
    }
}
