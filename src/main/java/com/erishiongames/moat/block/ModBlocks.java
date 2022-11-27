package com.erishiongames.moat.block;

import com.erishiongames.moat.MoatMain;
import com.erishiongames.moat.item.ModItems;
import com.erishiongames.moat.util.ModConfig;
import com.erishiongames.moat.item.ModItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoatMain.MOD_ID);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static RegistryObject<Block> registerOreBlock(String name) {
        RegistryObject<Block> createdBlock = BLOCKS.register(name.toLowerCase() + "_ore", () ->
                new Block(AbstractBlock.Properties
                        .of(Material.STONE)
                        .harvestLevel(ModConfig.ORE_HARVEST_LEVEL_MAP.get(name.toLowerCase()).get())
                        .harvestTool(ToolType.PICKAXE)
                        .requiresCorrectToolForDrops()
                        .strength(ModConfig.ORE_HARDNESS_MAP.get(name.toLowerCase()).get())));
        registerOreBlockItem(name, createdBlock);
        return createdBlock;
    }
    private static RegistryObject<Block> registerStorageBlock(String name) {
        RegistryObject<Block> createdStorageBlock = BLOCKS.register(name.toLowerCase() + "_block", () ->
                new Block(AbstractBlock.Properties
                        .of(Material.METAL)
                        .harvestLevel(ModConfig.STORAGE_BLOCK_HARVEST_LEVEL_MAP.get(name.toLowerCase()).get())
                        .harvestTool(ToolType.PICKAXE)
                        .requiresCorrectToolForDrops()
                        .strength(ModConfig.STORAGE_BLOCK_HARDNESS_MAP.get(name.toLowerCase()).get())));
        registerStorageBlockItem(name, createdStorageBlock);
        return createdStorageBlock;
    }

    private static <T extends Block> void registerOreBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name.toLowerCase() + "_ore", () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.MOAT_GROUP)));
    }
    private static <T extends Block> void registerStorageBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name.toLowerCase() + "_block", () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.MOAT_GROUP)));
    }


    public static final RegistryObject<Block> TIN_ORE = registerOreBlock("tin");
    public static final RegistryObject<Block> COPPER_ORE = registerOreBlock("copper");
    public static final RegistryObject<Block> SILVER_ORE = registerOreBlock("silver");
    public static final RegistryObject<Block> PLATINUM_ORE = registerOreBlock("platinum");
    public static final RegistryObject<Block> LEAD_ORE = registerOreBlock("lead");

    public static final RegistryObject<Block> TIN_BLOCK = registerStorageBlock("tin");
    public static final RegistryObject<Block> COPPER_BLOCK = registerStorageBlock("copper");
    public static final RegistryObject<Block> STEEL_BLOCK = registerStorageBlock("steel");
    public static final RegistryObject<Block> BRONZE_BLOCK = registerStorageBlock("bronze");
    public static final RegistryObject<Block> SILVER_BLOCK = registerStorageBlock("silver");
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerStorageBlock("platinum");
    public static final RegistryObject<Block> LEAD_BLOCK = registerStorageBlock("lead");
}




// Method to automate registering blocks, but leaves no variable behind
//    static ArrayList<String> oreArray = new ArrayList<>(Arrays.asList("TIN_ORE", "COPPER_ORE", "SILVER_ORE", "PLATINUM_ORE", "lEAD_ORE"));
//
//    public static void createRegistryBlocks(){
//        for (int i=0; i<oreArray.size(); i++){
//            registerOreBlock(oreArray.get(i));
//        }
//    }
