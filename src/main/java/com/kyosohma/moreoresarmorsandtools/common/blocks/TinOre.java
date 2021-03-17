package com.kyosohma.moreoresarmorsandtools.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TinOre extends OreBlock {
    public TinOre() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0F, 4.0F)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
