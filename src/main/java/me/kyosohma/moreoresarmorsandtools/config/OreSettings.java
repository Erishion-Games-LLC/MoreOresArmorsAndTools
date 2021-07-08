package me.kyosohma.moreoresarmorsandtools.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreSettings
{
    private final ForgeConfigSpec.BooleanValue shouldGenerate;
    private final ForgeConfigSpec.IntValue veinSize;
    private final ForgeConfigSpec.IntValue minHeight;
    private final ForgeConfigSpec.IntValue maxHeight;
    private final ForgeConfigSpec.IntValue veinsPerChunk;

    public OreSettings(ForgeConfigSpec.BooleanValue shouldGenerate, ForgeConfigSpec.IntValue veinSize, ForgeConfigSpec.IntValue minHeight, ForgeConfigSpec.IntValue maxHeight, ForgeConfigSpec.IntValue veinsPerChunk)
    {
        this.shouldGenerate = shouldGenerate;
        this.veinSize = veinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public ForgeConfigSpec.BooleanValue shouldGenerate()
    {
        return shouldGenerate;
    }

    public ForgeConfigSpec.IntValue getVeinSize()
    {
        return veinSize;
    }

    public ForgeConfigSpec.IntValue getMinHeight()
    {
        return minHeight;
    }

    public ForgeConfigSpec.IntValue getMaxHeight()
    {
        return maxHeight;
    }

    public ForgeConfigSpec.IntValue getVeinsPerChunk()
    {
        return veinsPerChunk;
    }
}
