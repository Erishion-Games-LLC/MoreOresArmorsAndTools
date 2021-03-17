package com.kyosohma.moreoresarmorsandtools.core.init;

import com.kyosohma.moreoresarmorsandtools.MoreOresArmorsAndTools;
import com.kyosohma.moreoresarmorsandtools.common.blocks.BlockItemBase;
import com.kyosohma.moreoresarmorsandtools.common.items.ItemBase;
import com.kyosohma.moreoresarmorsandtools.common.items.armors.MoatArmorMaterial;
import com.kyosohma.moreoresarmorsandtools.common.items.tools.MoatItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreOresArmorsAndTools.MOD_ID);

    //Ingots
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", ItemBase::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", ItemBase::new);
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", ItemBase::new);
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", ItemBase::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
    //Nuggets
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", ItemBase::new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ItemBase::new);
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", ItemBase::new);
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", ItemBase::new);
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", ItemBase::new);
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", ItemBase::new);
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", ItemBase::new);
    //Block Items/Ores
    public static final RegistryObject<BlockItem> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BlockItemBase(BlockInit.TIN_ORE.get()));
    public static final RegistryObject<BlockItem> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(BlockInit.COPPER_ORE.get()));
    public static final RegistryObject<BlockItem> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () -> new BlockItemBase(BlockInit.SILVER_ORE.get()));
    public static final RegistryObject<BlockItem> LEAD_ORE_ITEM = ITEMS.register("lead_ore", () -> new BlockItemBase(BlockInit.LEAD_ORE.get()));
    public static final RegistryObject<BlockItem> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore", () -> new BlockItemBase(BlockInit.PLATINUM_ORE.get()));
    //Block Items/Blocks
    public static final RegistryObject<BlockItem> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BlockItemBase(BlockInit.TIN_BLOCK.get()));
    public static final RegistryObject<BlockItem> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(BlockInit.COPPER_BLOCK.get()));
    public static final RegistryObject<BlockItem> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItemBase(BlockInit.SILVER_BLOCK.get()));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_ITEM = ITEMS.register("lead_block", () -> new BlockItemBase(BlockInit.LEAD_BLOCK.get()));
    public static final RegistryObject<BlockItem> PLATINUM_BLOCK_ITEM = ITEMS.register("platinum_block", () -> new BlockItemBase(BlockInit.PLATINUM_BLOCK.get()));
    public static final RegistryObject<BlockItem> BRONZE_BLOCK_ITEM = ITEMS.register("bronze_block", () -> new BlockItemBase(BlockInit.BRONZE_BLOCK.get()));
    public static final RegistryObject<BlockItem> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(BlockInit.STEEL_BLOCK.get()));
    //Tools/Swords
    public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(MoatItemTier.TIN, 4, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(MoatItemTier.COPPER, 4, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(MoatItemTier.BRONZE, 5, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(MoatItemTier.STEEL, 5, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(MoatItemTier.SILVER, 5, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> LEAD_SWORD = ITEMS.register("lead_sword", () -> new SwordItem(MoatItemTier.LEAD, 5, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new SwordItem(MoatItemTier.PLATINUM, 6, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    //Tools/Pickaxes
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(MoatItemTier.TIN, 2, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(MoatItemTier.COPPER, 2, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(MoatItemTier.BRONZE, 3, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(MoatItemTier.STEEL, 3, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(MoatItemTier.SILVER, 3, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", () -> new PickaxeItem(MoatItemTier.LEAD, 3, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(MoatItemTier.PLATINUM, 4, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    //Tools/Axes
    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(MoatItemTier.TIN, 8, -3.2F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(MoatItemTier.COPPER, 8, -3.2F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(MoatItemTier.BRONZE, 8, -3.1F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(MoatItemTier.STEEL, 8, -3.1F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(MoatItemTier.SILVER, 8, -3.1F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> LEAD_AXE = ITEMS.register("lead_axe", () -> new AxeItem(MoatItemTier.LEAD, 8, -3.1F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new AxeItem(MoatItemTier.PLATINUM, 8, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    //Tools/Shovels
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(MoatItemTier.TIN, 3, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(MoatItemTier.COPPER, 3, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(MoatItemTier.BRONZE, 4, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(MoatItemTier.STEEL, 4, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(MoatItemTier.SILVER, 4, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> LEAD_SHOVEL = ITEMS.register("lead_shovel", () -> new ShovelItem(MoatItemTier.LEAD, 4, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new ShovelItem(MoatItemTier.PLATINUM, 5, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    //Tools/Hoes
    public static final RegistryObject<HoeItem> TIN_HOE  = ITEMS.register("tin_hoe", () -> new HoeItem(MoatItemTier.TIN, 0, -2.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> COPPER_HOE  = ITEMS.register("copper_hoe", () -> new HoeItem(MoatItemTier.COPPER, 0, -2.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> BRONZE_HOE  = ITEMS.register("bronze_hoe", () -> new HoeItem(MoatItemTier.BRONZE, 0, -1.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> STEEL_HOE  = ITEMS.register("steel_hoe", () -> new HoeItem(MoatItemTier.STEEL, 0, -1.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> SILVER_HOE  = ITEMS.register("silver_hoe", () -> new HoeItem(MoatItemTier.SILVER, 0, -1.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> LEAD_HOE  = ITEMS.register("lead_hoe", () -> new HoeItem(MoatItemTier.LEAD, 0, -1.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> PLATINUM_HOE  = ITEMS.register("platinum_hoe", () -> new HoeItem(MoatItemTier.PLATINUM, 0, 0.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    //Armor/Helmet
    public static final RegistryObject<ArmorItem> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem(MoatArmorMaterial.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(MoatArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(MoatArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(MoatArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(MoatArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> LEAD_HELMET = ITEMS.register("lead_helmet", () -> new ArmorItem(MoatArmorMaterial.LEAD, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(MoatArmorMaterial.PLATINUM, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    //Armor/Chestplate
    public static final RegistryObject<ArmorItem> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ArmorItem(MoatArmorMaterial.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(MoatArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(MoatArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(MoatArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ArmorItem(MoatArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate", () -> new ArmorItem(MoatArmorMaterial.LEAD, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () -> new ArmorItem(MoatArmorMaterial.PLATINUM, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    //Armor/Leggings
    public static final RegistryObject<ArmorItem> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem(MoatArmorMaterial.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(MoatArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(MoatArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(MoatArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(MoatArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> LEAD_LEGGINGS = ITEMS.register("lead_leggings", () -> new ArmorItem(MoatArmorMaterial.LEAD, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(MoatArmorMaterial.PLATINUM, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    //Armor/Boots
    public static final RegistryObject<ArmorItem> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem(MoatArmorMaterial.TIN, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(MoatArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(MoatArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(MoatArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ArmorItem(MoatArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> LEAD_BOOTS = ITEMS.register("lead_boots", () -> new ArmorItem(MoatArmorMaterial.LEAD, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () -> new ArmorItem(MoatArmorMaterial.PLATINUM, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));





}
