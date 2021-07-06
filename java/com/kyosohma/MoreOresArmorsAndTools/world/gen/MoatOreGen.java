package com.kyosohma.MoreOresArmorsAndTools.world.gen;

import com.kyosohma.MoreOresArmorsAndTools.config.OreGenConfig;
import com.kyosohma.MoreOresArmorsAndTools.core.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class MoatOreGen {

    public static void generateOres(final BiomeLoadingEvent event) {

    public final int ONLY_OVERWORLD= (!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND)));

        if((OreGenConfig.GENERATE_TIN.get()) && ONLY_OVERWORLD)
        {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.TIN_ORE.get()
                    .getDefaultState(), OreGenConfig.tin_vein_size.get(), OreGenConfig.tin_min_height.get(), OreGenConfig.tin_max_height.get(), OreGenConfig.tin_per_chunk.get());
        }




        if((OreGenConfig.generate_copper.get()) && (!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND))))
        {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.COPPER_ORE.get().getDefaultState(), OreGenConfig.copper_vein_size.get(), OreGenConfig.copper_min_height.get(), OreGenConfig.copper_max_height.get(), OreGenConfig.copper_per_chunk.get());
        }
        if((OreGenConfig.generate_silver.get()) && (!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND))))
        {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.SILVER_ORE.get().getDefaultState(), 13, 0, 45, 2);
        }
        if((OreGenConfig.generate_lead.get()) && (!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND))))
        {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.LEAD_ORE.get().getDefaultState(), 11, 0, 30, 1);
        }
        if((OreGenConfig.generate_platinum.get()) && (!(event.getCategory().equals(Biome.Category.NETHER) && event.getCategory().equals(Biome.Category.THEEND))))
        {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.PLATINUM_ORE.get().getDefaultState(), 11, 0, 30, 1);
        }
    }
    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amountPerChunk) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().count(amountPerChunk));
    }
}