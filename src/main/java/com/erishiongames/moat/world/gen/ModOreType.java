package com.erishiongames.moat.world.gen;

import com.erishiongames.moat.block.ModBlocks;
import com.erishiongames.moat.util.ModConfig;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

import java.util.HashMap;

public enum ModOreType {
    TIN(Lazy.of(ModBlocks.TIN_ORE), ModConfig.MAX_VEIN_SIZE_MAP.get("tin").get(), ModConfig.MIN_HEIGHT_MAP.get("tin").get(), ModConfig.MAX_HEIGHT_MAP.get("tin").get(), ModConfig.VEINS_PER_CHUNK_MAP.get("tin").get()),
    COPPER(Lazy.of(ModBlocks.COPPER_ORE), ModConfig.MAX_VEIN_SIZE_MAP.get("copper").get(), ModConfig.MIN_HEIGHT_MAP.get("copper").get(), ModConfig.MAX_HEIGHT_MAP.get("copper").get(), ModConfig.VEINS_PER_CHUNK_MAP.get("copper").get()),
    SILVER(Lazy.of(ModBlocks.SILVER_ORE), ModConfig.MAX_VEIN_SIZE_MAP.get("silver").get(), ModConfig.MIN_HEIGHT_MAP.get("silver").get(), ModConfig.MAX_HEIGHT_MAP.get("silver").get(), ModConfig.VEINS_PER_CHUNK_MAP.get("silver").get()),
    PLATINUM(Lazy.of(ModBlocks.PLATINUM_ORE), ModConfig.MAX_VEIN_SIZE_MAP.get("platinum").get(), ModConfig.MIN_HEIGHT_MAP.get("platinum").get(), ModConfig.MAX_HEIGHT_MAP.get("platinum").get(), ModConfig.VEINS_PER_CHUNK_MAP.get("platinum").get()),
    LEAD(Lazy.of(ModBlocks.LEAD_ORE), ModConfig.MAX_VEIN_SIZE_MAP.get("lead").get(), ModConfig.MIN_HEIGHT_MAP.get("lead").get(), ModConfig.MAX_HEIGHT_MAP.get("lead").get(), ModConfig.VEINS_PER_CHUNK_MAP.get("lead").get()),
    ;

    private final Lazy<Block> block;
    private final int MaxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;
    public static final HashMap<String, ModOreType> MOD_ORE_TYPE_MAP = new HashMap<>();



    ModOreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, int veinsPerChunk) {
        this.block = block;
        MaxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public static void generateModOreTypeMapValues(){
        MOD_ORE_TYPE_MAP.put("tin", TIN);
        MOD_ORE_TYPE_MAP.put("copper", COPPER);
        MOD_ORE_TYPE_MAP.put("silver", SILVER);
        MOD_ORE_TYPE_MAP.put("platinum", PLATINUM);
        MOD_ORE_TYPE_MAP.put("lead", LEAD);

    }


    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return MaxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }



    public static ModOreType get(Block block) {
        for (ModOreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
