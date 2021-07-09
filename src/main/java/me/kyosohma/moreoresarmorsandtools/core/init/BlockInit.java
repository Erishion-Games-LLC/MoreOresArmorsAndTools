package me.kyosohma.moreoresarmorsandtools.core.init;

import me.kyosohma.moreoresarmorsandtools.MoreOresArmorsAndTools;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreOresArmorsAndTools.MODID);

    //Ores
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3.0F, 4.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3.0F, 4.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3.0F, 4.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3.0F, 4.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(3.0F, 4.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    //Blocks
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.ICE).strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(1).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_ORANGE).strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(1).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_BLUE).strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_BLUE).strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.DIAMOND).strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5.0F, 6.0F).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops().sound(SoundType.METAL)));
}
