package me.kyosohma.moreoresarmorsandtools.core.init;

import me.kyosohma.moreoresarmorsandtools.MoreOresArmorsAndTools;
import me.kyosohma.moreoresarmorsandtools.common.items.MOATArmorMaterial;
import me.kyosohma.moreoresarmorsandtools.common.items.MOATItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unused")
public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreOresArmorsAndTools.MODID);

    // Ingots
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Nuggets
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Block Items / Ores
    public static final RegistryObject<BlockItem> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BlockItem(BlockInit.TIN_ORE.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItem(BlockInit.COPPER_ORE.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> SILVER_ORE_ITEM = ITEMS.register("silver_ore", () -> new BlockItem(BlockInit.SILVER_ORE.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> LEAD_ORE_ITEM = ITEMS.register("lead_ore", () -> new BlockItem(BlockInit.LEAD_ORE.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore", () -> new BlockItem(BlockInit.PLATINUM_ORE.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Block Items / Blocks
    public static final RegistryObject<BlockItem> TIN_BLOCK_ITEM = ITEMS.register("tin_block", () -> new BlockItem(BlockInit.TIN_BLOCK.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItem(BlockInit.COPPER_BLOCK.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> SILVER_BLOCK_ITEM = ITEMS.register("silver_block", () -> new BlockItem(BlockInit.SILVER_BLOCK.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_ITEM = ITEMS.register("lead_block", () -> new BlockItem(BlockInit.LEAD_BLOCK.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> PLATINUM_BLOCK_ITEM = ITEMS.register("platinum_block", () -> new BlockItem(BlockInit.PLATINUM_BLOCK.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> BRONZE_BLOCK_ITEM = ITEMS.register("bronze_block", () -> new BlockItem(BlockInit.BRONZE_BLOCK.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<BlockItem> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItem(BlockInit.STEEL_BLOCK.get(), new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Tools / Swords
    public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(MOATItemTier.TIN, 4, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(MOATItemTier.COPPER, 4, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(MOATItemTier.BRONZE, 5, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(MOATItemTier.STEEL, 5, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(MOATItemTier.SILVER, 5, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> LEAD_SWORD = ITEMS.register("lead_sword", () -> new SwordItem(MOATItemTier.LEAD, 5, -3.2F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<SwordItem> PLATINUM_SWORD = ITEMS.register("platinum_sword", () -> new SwordItem(MOATItemTier.PLATINUM, 6, -2.4F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Tools / Pickaxes
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(MOATItemTier.TIN, 2, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(MOATItemTier.COPPER, 2, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(MOATItemTier.BRONZE, 3, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(MOATItemTier.STEEL, 3, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(MOATItemTier.SILVER, 3, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> LEAD_PICKAXE = ITEMS.register("lead_pickaxe", () -> new PickaxeItem(MOATItemTier.LEAD, 3, -3.6F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<PickaxeItem> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe", () -> new PickaxeItem(MOATItemTier.PLATINUM, 4, -2.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Tools / Axes
    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(MOATItemTier.TIN, 8, -3.2F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(MOATItemTier.COPPER, 8, -3.2F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(MOATItemTier.BRONZE, 8, -3.1F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(MOATItemTier.STEEL, 8, -3.1F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(MOATItemTier.SILVER, 8, -3.1F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> LEAD_AXE = ITEMS.register("lead_axe", () -> new AxeItem(MOATItemTier.LEAD, 8, -3.9F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<AxeItem> PLATINUM_AXE = ITEMS.register("platinum_axe", () -> new AxeItem(MOATItemTier.PLATINUM, 8, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Tools / Shovels
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(MOATItemTier.TIN, 3, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(MOATItemTier.COPPER, 3, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(MOATItemTier.BRONZE, 4, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(MOATItemTier.STEEL, 4, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(MOATItemTier.SILVER, 4, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> LEAD_SHOVEL = ITEMS.register("lead_shovel", () -> new ShovelItem(MOATItemTier.LEAD, 4, -3.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ShovelItem> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel", () -> new ShovelItem(MOATItemTier.PLATINUM, 5, -3.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Tools / Hoes
    public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem(MOATItemTier.TIN, 0, -2.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(MOATItemTier.COPPER, 0, -2.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(MOATItemTier.BRONZE, 0, -1.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(MOATItemTier.STEEL, 0, -1.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(MOATItemTier.SILVER, 0, -1.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> LEAD_HOE = ITEMS.register("lead_hoe", () -> new HoeItem(MOATItemTier.LEAD, 0, -1.8F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<HoeItem> PLATINUM_HOE = ITEMS.register("platinum_hoe", () -> new HoeItem(MOATItemTier.PLATINUM, 0, 0.0F, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Armor / Horse
    public static final RegistryObject<HorseArmorItem> TIN_HORSE_ARMOR = ITEMS.register("tin_horse_armor", () -> new HorseArmorItem(4, "iron", (new Item.Properties().maxStackSize(1).group(MoreOresArmorsAndTools.TAB))));
    public static final RegistryObject<HorseArmorItem> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () -> new HorseArmorItem(4, "iron", (new Item.Properties().maxStackSize(1).group(MoreOresArmorsAndTools.TAB))));
    public static final RegistryObject<HorseArmorItem> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor", () -> new HorseArmorItem(5, "iron", (new Item.Properties().maxStackSize(1).group(MoreOresArmorsAndTools.TAB))));
    public static final RegistryObject<HorseArmorItem> STEEL_HORSE_ARMOR = ITEMS.register("steel_horse_armor", () -> new HorseArmorItem(9, "iron", (new Item.Properties().maxStackSize(1).group(MoreOresArmorsAndTools.TAB))));
    public static final RegistryObject<HorseArmorItem> SILVER_HORSE_ARMOR = ITEMS.register("silver_horse_armor", () -> new HorseArmorItem(5, "gold", (new Item.Properties().maxStackSize(1).group(MoreOresArmorsAndTools.TAB))));
    public static final RegistryObject<HorseArmorItem> LEAD_HORSE_ARMOR = ITEMS.register("lead_horse_armor", () -> new HorseArmorItem(11, "diamond", (new Item.Properties().maxStackSize(1).group(MoreOresArmorsAndTools.TAB))));
    public static final RegistryObject<HorseArmorItem> PLATINUM_HORSE_ARMOR = ITEMS.register("platinum_horse_armor", () -> new HorseArmorItem(11, "diamond", (new Item.Properties().maxStackSize(1).group(MoreOresArmorsAndTools.TAB))));

    // Armor / Helmet
    public static final RegistryObject<ArmorItem> TIN_HELMET = ITEMS.register("tin_helmet", () -> new ArmorItem(MOATArmorMaterial.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(MOATArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(MOATArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(MOATArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet", () -> new ArmorItem(MOATArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> LEAD_HELMET = ITEMS.register("lead_helmet", () -> new ArmorItem(MOATArmorMaterial.LEAD, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> PLATINUM_HELMET = ITEMS.register("platinum_helmet", () -> new ArmorItem(MOATArmorMaterial.PLATINUM, EquipmentSlotType.HEAD, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    //Armor / Chestplate
    public static final RegistryObject<ArmorItem> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", () -> new ArmorItem(MOATArmorMaterial.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(MOATArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(MOATArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(MOATArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () -> new ArmorItem(MOATArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> LEAD_CHESTPLATE = ITEMS.register("lead_chestplate", () -> new ArmorItem(MOATArmorMaterial.LEAD, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate", () -> new ArmorItem(MOATArmorMaterial.PLATINUM, EquipmentSlotType.CHEST, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    // Armor / Leggings
    public static final RegistryObject<ArmorItem> TIN_LEGGINGS = ITEMS.register("tin_leggings", () -> new ArmorItem(MOATArmorMaterial.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(MOATArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(MOATArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(MOATArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () -> new ArmorItem(MOATArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> LEAD_LEGGINGS = ITEMS.register("lead_leggings", () -> new ArmorItem(MOATArmorMaterial.LEAD, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings", () -> new ArmorItem(MOATArmorMaterial.PLATINUM, EquipmentSlotType.LEGS, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));

    //Armor / Boots
    public static final RegistryObject<ArmorItem> TIN_BOOTS = ITEMS.register("tin_boots", () -> new ArmorItem(MOATArmorMaterial.TIN, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(MOATArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(MOATArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(MOATArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots", () -> new ArmorItem(MOATArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> LEAD_BOOTS = ITEMS.register("lead_boots", () -> new ArmorItem(MOATArmorMaterial.LEAD, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
    public static final RegistryObject<ArmorItem> PLATINUM_BOOTS = ITEMS.register("platinum_boots", () -> new ArmorItem(MOATArmorMaterial.PLATINUM, EquipmentSlotType.FEET, new Item.Properties().group(MoreOresArmorsAndTools.TAB)));
}
