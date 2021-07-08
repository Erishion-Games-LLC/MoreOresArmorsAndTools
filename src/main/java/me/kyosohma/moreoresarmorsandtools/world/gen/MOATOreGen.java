package me.kyosohma.moreoresarmorsandtools.world.gen;

import me.kyosohma.moreoresarmorsandtools.MoreOresArmorsAndTools;
import me.kyosohma.moreoresarmorsandtools.config.MOATConfig;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MoreOresArmorsAndTools.MODID)
public class MOATOreGen
{
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void generateOres(BiomeLoadingEvent event)
    {
        Biome.Category category = event.getCategory();
        // Only generate in the overworld
        if (category != Biome.Category.NETHER && category != Biome.Category.THEEND)
        {
            BiomeGenerationSettingsBuilder generation = event.getGeneration();
            MOATConfig.COMMON.getOreConfig().forEach((oreType, oreSettings) ->
            {
                if (oreSettings.shouldGenerate().get())
                    addOreFeature(generation,
                            oreType.getState(),
                            oreSettings.getVeinSize().get(),
                            oreSettings.getMinHeight().get(),
                            oreSettings.getMaxHeight().get(),
                            oreSettings.getVeinsPerChunk().get());
            });
        }
    }

    private static void addOreFeature(BiomeGenerationSettingsBuilder settings, BlockState state, int veinSize, int minHeight, int maxHeight, int veinsPerChunk)
    {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, state, veinSize))
                        .withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square()
                        .count(veinsPerChunk));
    }
}
