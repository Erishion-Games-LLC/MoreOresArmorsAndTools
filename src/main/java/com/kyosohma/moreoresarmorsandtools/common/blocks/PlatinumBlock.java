package com.kyosohma.MoreOresArmorsAndTools.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PlatinumBlock extends Block {
    public PlatinumBlock() {
        super(AbstractBlock.Properties.create((Material.IRON))
                .hardnessAndResistance(5.0f,6.0f)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(3)
                .sound(SoundType.METAL)
        );
    }
}