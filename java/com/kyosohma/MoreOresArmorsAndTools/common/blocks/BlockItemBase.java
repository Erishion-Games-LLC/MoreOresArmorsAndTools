package com.kyosohma.MoreOresArmorsAndTools.common.blocks;

import com.kyosohma.MoreOresArmorsAndTools.MoreOresArmorsAndTools;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Properties().group(MoreOresArmorsAndTools.TAB));
    }
}
