package com.erishiongames.moat.world.gen;

import com.erishiongames.moat.util.ModConfig;
import net.minecraft.block.Blocks;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.Dimension;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;


public class ModOreGeneration {

    public static void generateOres(final BiomeLoadingEvent biomeLoadingEvent) {
            for (String s : ModConfig.SPAWNING_MATERIALS_ARRAY) {
                if (ModConfig.ORES_TO_GENERATE_MAP.get(s).get().equals(true)) {
                    spawnOreInAllBiomesInSpecificDimension(ModOreType.MOD_ORE_TYPE_MAP.get(s), biomeLoadingEvent, Dimension.OVERWORLD.toString());}
            }
        }

    private static void spawnOreInAllBiomesInSpecificDimension(ModOreType modOreType, final BiomeLoadingEvent biomeLoadingEvent, String dimension){
        biomeLoadingEvent
                .getGeneration()
                .addFeature(
                        GenerationStage.Decoration.UNDERGROUND_ORES,
                        makeOreFeature(modOreType, dimension));
    }

    private static void spawnOreInSpecificVanillaBiome(RegistryKey<Biome> biome, ModOreType modOreType, final BiomeLoadingEvent biomeLoadingEvent, String dimension){
        if(biomeLoadingEvent
                .getName().toString()
                .contains(biome.getRegistryName().toString())){
            biomeLoadingEvent
                    .getGeneration()
                    .addFeature(
                            GenerationStage.Decoration.UNDERGROUND_ORES,
                            makeOreFeature(modOreType, dimension));}
    }

    private static void spawnOreInSpecificModBiome(Biome biome, ModOreType modOreType, final BiomeLoadingEvent biomeLoadingEvent, String dimension){

        if(biomeLoadingEvent
                .getName().toString()
                .contains(biome.getRegistryName().toString())){
            biomeLoadingEvent
                    .getGeneration()
                    .addFeature(
                            GenerationStage.Decoration.UNDERGROUND_ORES,
                            makeOreFeature(modOreType, dimension));}
    }

    private static ConfiguredFeature<?, ?> makeOreFeature(ModOreType modOreType, String dimensionToSpawnIn) {
        OreFeatureConfig oreFeatureConfig = null;

        switch (dimensionToSpawnIn) {
            case "ResourceKey[minecraft:dimension / minecraft:overworld]":  oreFeatureConfig = getOverworldFeatureConfig(modOreType); break;
            case "ResourceKey[minecraft:dimension / minecraft:the_nether]": oreFeatureConfig = getNetherFeatureConfig(modOreType); break;
            case "ResourceKey[minecraft:dimension / minecraft:the_end]":    oreFeatureConfig = getEndFeatureConfig(modOreType); break;
        }
        ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement =
                Placement.RANGE.configured(new TopSolidRangeConfig(
                        modOreType.getMinHeight(),
                        modOreType.getMinHeight(),
                        modOreType.getMaxHeight()));

        return registerOreFeature(modOreType, oreFeatureConfig, configuredPlacement);
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(ModOreType modOreType, OreFeatureConfig oreFeatureConfig, ConfiguredPlacement<?> configuredPlacement){
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, modOreType.getBlock().get().getRegistryName(),
                Feature.ORE.configured(oreFeatureConfig)
                        .decorated(configuredPlacement).squared().count(modOreType.getVeinsPerChunk()));
    }

    private static OreFeatureConfig getOverworldFeatureConfig(ModOreType modModOreType) {
        return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                modModOreType.getBlock().get().defaultBlockState(), modModOreType.getMaxVeinSize());
    }

    private static OreFeatureConfig getNetherFeatureConfig(ModOreType modOreType) {
        return new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                modOreType.getBlock().get().defaultBlockState(), modOreType.getMaxVeinSize());
    }

    private static OreFeatureConfig getEndFeatureConfig(ModOreType ore) {
        return new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE),
                ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());
    }
}