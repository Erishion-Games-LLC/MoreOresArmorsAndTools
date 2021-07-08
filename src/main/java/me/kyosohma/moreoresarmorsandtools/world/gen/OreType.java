package me.kyosohma.moreoresarmorsandtools.world.gen;

import me.kyosohma.moreoresarmorsandtools.core.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public enum OreType
{
    TIN(BlockInit.TIN_ORE, 14, 0, 90, 22),
    COPPER(BlockInit.COPPER_ORE, 14, 0, 90, 22),
    SILVER(BlockInit.SILVER_ORE, 13, 0, 45, 2),
    LEAD(BlockInit.LEAD_ORE, 11, 0, 30, 1),
    PLATINUM(BlockInit.PLATINUM_ORE, 11, 0, 30, 1);

    private final Supplier<BlockState> state;
    private final String name;
    private final int veinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;

    OreType(RegistryObject<Block> state, int veinSize, int minHeight, int maxHeight, int veinsPerChunk)
    {
        this.state = () -> state.get().getDefaultState();
        this.name = state.getId().getPath();
        this.veinSize = veinSize;
        this.minHeight = maxHeight;
        this.maxHeight = minHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public BlockState getState()
    {
        return state.get();
    }

    public String toString()
    {
        return name;
    }

    public int getVeinSize()
    {
        return veinSize;
    }

    public int getMinHeight()
    {
        return minHeight;
    }

    public int getMaxHeight()
    {
        return maxHeight;
    }

    public int getVeinsPerChunk()
    {
        return veinsPerChunk;
    }
}
