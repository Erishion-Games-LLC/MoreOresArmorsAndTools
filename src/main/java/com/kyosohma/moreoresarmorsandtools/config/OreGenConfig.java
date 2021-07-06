package com.kyosohma.MoreOresArmorsAndTools.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {

    public static ForgeConfigSpec.BooleanValue GENERATE_TIN;
    public static ForgeConfigSpec.BooleanValue GENERATE_COPPER;
    public static ForgeConfigSpec.BooleanValue GENERATE_SILVER;
    public static ForgeConfigSpec.BooleanValue GENERATE_LEAD;
    public static ForgeConfigSpec.BooleanValue GENERATE_PLATINUM;

    public static ForgeConfigSpec.IntValue TIN_PER_CHUNK;
    public static ForgeConfigSpec.IntValue copper_per_chunk;
    public static ForgeConfigSpec.IntValue silver_per_chunk;
    public static ForgeConfigSpec.IntValue lead_per_chunk;
    public static ForgeConfigSpec.IntValue platinum_per_chunk;

    public static ForgeConfigSpec.IntValue tin_min_height;
    public static ForgeConfigSpec.IntValue copper_min_height;
    public static ForgeConfigSpec.IntValue silver_min_height;
    public static ForgeConfigSpec.IntValue lead_min_height;
    public static ForgeConfigSpec.IntValue platinum_min_height;

    public static ForgeConfigSpec.IntValue tin_max_height;
    public static ForgeConfigSpec.IntValue copper_max_height;
    public static ForgeConfigSpec.IntValue silver_max_height;
    public static ForgeConfigSpec.IntValue lead_max_height;
    public static ForgeConfigSpec.IntValue platinum_max_height;

    public static ForgeConfigSpec.IntValue tin_vein_size;
    public static ForgeConfigSpec.IntValue copper_vein_size;
    public static ForgeConfigSpec.IntValue silver_vein_size;
    public static ForgeConfigSpec.IntValue lead_vein_size;
    public static ForgeConfigSpec.IntValue platinum_vein_size;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("OreGen Config");

        GENERATE_TIN = server.comment("Should Tin Ore Spawn").define("OreGen.GENERATE_TIN", true);
        GENERATE_COPPER = server.comment("Should Copper Ore Spawn").define("OreGen.GENERATE_COPPER", true);
        GENERATE_SILVER = server.comment("Should Silver Ore Spawn").define("OreGen.GENERATE_SILVER", true);
        GENERATE_LEAD = server.comment("Should Lead Ore Spawn").define("OreGen.GENERATE_LEAD", true);
        GENERATE_PLATINUM = server.comment("Should Platinum Ore Spawn").define("OreGen.GENERATE_PLATINUM", true);

        TIN_PER_CHUNK = server.comment("Maximum number of Tin Ore veins in one chunk").defineInRange("OreGen.TIN_PER_CHUNK", 22, 1, 9999);
        copper_per_chunk = server.comment("Maximum number of Copper Ore veins in one chunk").defineInRange("OreGen.copper_per_chunk", 22, 1, 9999);
        silver_per_chunk = server.comment("Maximum number of Silver Ore veins in one chunk").defineInRange("OreGen.silver_per_chunk", 2, 1, 9999);
        lead_per_chunk = server.comment("Maximum number of Lead Ore veins in one chunk").defineInRange("OreGen.lead_per_chunk", 1, 1, 9999);
        platinum_per_chunk = server.comment("Maximum number of Platinum Ore veins in one chunk").defineInRange("OreGen.platinum_per_chunk", 1, 1, 9999);

        tin_min_height = server.comment("What Y-Level Tin Ore starts spawning").defineInRange("OreGen.tin_min_height", 0, 0, 255);
        copper_min_height = server.comment("What Y-Level Copper Ore starts spawning").defineInRange("OreGen.copper_min_height", 0, 0, 255);
        silver_min_height = server.comment("What Y-Level Silver Ore starts spawning").defineInRange("OreGen.silver_min_height", 0, 0, 255);
        lead_min_height = server.comment("What Y-Level Lead Ore starts spawning").defineInRange("OreGen.lead_min_height", 0, 0, 255);
        platinum_min_height = server.comment("What Y-Level Platinum Ore starts spawning").defineInRange("OreGen.platinum_min_height", 0, 0, 255);

        tin_max_height = server.comment("What Y-Level Tin Ore stops spawning").defineInRange("OreGen.tin_max_height", 90, 0, 255);
        copper_max_height = server.comment("What Y-Level Copper Ore stops spawning").defineInRange("OreGen.copper_max_height", 90, 0, 255);
        silver_max_height = server.comment("What Y-Level Silver Ore stops spawning").defineInRange("OreGen.silver_max_height", 45, 0, 255);
        lead_max_height = server.comment("What Y-Level Lead Ore stops spawning").defineInRange("OreGen.lead_max_height", 30, 0, 255);
        platinum_max_height = server.comment("What Y-Level Platinum Ore stops spawning").defineInRange("OreGen.platinum_max_height", 30, 0, 255);

        tin_vein_size = server.comment("Maximum number of Tin Ore in one vein").defineInRange("OreGen.tin_vein_size", 14, 1, 50);
        copper_vein_size = server.comment("Maximum number of Copper Ore in one vein").defineInRange("OreGen.copper_vein_size", 14, 1, 50);
        silver_vein_size = server.comment("Maximum number of Silver Ores in one vein").defineInRange("OreGen.silver_vein_size", 13, 1, 50);
        lead_vein_size = server.comment("Maximum number of Lead Ore in one vein").defineInRange("OreGen.lead_vein_size", 11, 1, 50);
        platinum_vein_size = server.comment("Maximum number of Platinum Ore in one vein").defineInRange("OreGen.platinum_vein_size", 11, 1, 50);
    }
}
