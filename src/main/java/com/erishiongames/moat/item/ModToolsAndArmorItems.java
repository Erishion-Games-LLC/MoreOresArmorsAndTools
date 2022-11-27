package com.erishiongames.moat.item;

import com.erishiongames.moat.MoatMain;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModToolsAndArmorItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoatMain.MOD_ID);

    public static final Item.Properties genericItemProperties = new Item.Properties().tab(ModItemGroup.MOAT_GROUP);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static RegistryObject<Item> createToolItems(String material, String item){
        RegistryObject<Item> createdItem = null;
        String name = material.toLowerCase() + "_" + item.toLowerCase();
        ModItemTier itemTier = ModItemTier.MOD_ITEM_TIER_MAP.get(material);

        switch(item){
            case "sword": createdItem = ITEMS.register(name, () ->
                    new SwordItem(itemTier, 3, -2.4f, genericItemProperties));
                break;

            case "shovel": createdItem = ITEMS.register(name, () ->
                    new ShovelItem(itemTier, 1.5f, -3, genericItemProperties));
                break;

            case "pickaxe": createdItem = ITEMS.register(name, () ->
                    new PickaxeItem(itemTier, 1, -2.8f, genericItemProperties));
                break;

            case "axe": switch(material){
                case "tin":
                case "copper":
                case "silver":createdItem = createToolAxeItem(name, material, 6, -3f);
                    break;

                case "lead": createdItem = createToolAxeItem(name, material, 6, -3.2f);
                    break;

                case "steel":
                case "bronze":
                case "platinum": createdItem = createToolAxeItem(name, material, 5, -3.2f);
                    break;}
                break;

            case "hoe": switch(material){
                case "tin": createdItem = createToolHoeItem(name, material, -1, -1f);
                    break;

                case "copper": createdItem = createToolHoeItem(name, material, -2, -1f);
                    break;

                case "steel":
                case "bronze":
                case "platinum": createdItem = createToolHoeItem(name, material, -3, 0f);
                    break;

                case "silver": createdItem = createToolHoeItem(name, material, -2, 0f);
                    break;

                case "lead": createdItem = createToolHoeItem(name, material, -1, -3f);
            }
                break;
        }
        return createdItem;
    }
    public static RegistryObject<Item> createArmorItems(String material, String item){
        RegistryObject<Item> createdItem = null;
        String name = material.toLowerCase() + "_" + item.toLowerCase();
        ModArmorMaterial modArmorMaterial = ModArmorMaterial.MOD_ARMOR_MATERIAL_MAP.get(material);

        switch(item){
            case "helmet": createdItem = ITEMS.register(name, () -> new ArmorItem(
                    modArmorMaterial, EquipmentSlotType.HEAD, genericItemProperties));
                break;

            case "chestplate": createdItem = ITEMS.register(name, () -> new ArmorItem(
                    modArmorMaterial, EquipmentSlotType.CHEST, genericItemProperties));
                break;

            case "leggings": createdItem = ITEMS.register(name, () -> new ArmorItem(
                    modArmorMaterial, EquipmentSlotType.LEGS, genericItemProperties));
                break;

            case "boots": createdItem = ITEMS.register(name, () -> new ArmorItem(
                    modArmorMaterial, EquipmentSlotType.FEET, genericItemProperties));
                break;
        }
        return createdItem;
    }
    
    private static RegistryObject<Item> createToolAxeItem(String name, String material, int attackDamage, float attackSpeed){
        return ITEMS.register(name, () -> new AxeItem(
                ModItemTier.MOD_ITEM_TIER_MAP.get(material), attackDamage, attackSpeed, genericItemProperties));
    }
    private static RegistryObject<Item> createToolHoeItem(String name, String material, int attackDamage, float attackSpeed){
        return ITEMS.register(name, () -> new HoeItem(
                ModItemTier.MOD_ITEM_TIER_MAP.get(material), attackDamage, attackSpeed, genericItemProperties));
    }


    


    //Create all Tin Items
    public static final RegistryObject<Item> TIN_SWORD = createToolItems("tin", "sword");
    public static final RegistryObject<Item> TIN_SHOVEL = createToolItems("tin", "shovel");
    public static final RegistryObject<Item> TIN_PICKAXE = createToolItems("tin", "pickaxe");
    public static final RegistryObject<Item> TIN_AXE = createToolItems("tin", "axe");
    public static final RegistryObject<Item> TIN_HOE = createToolItems("tin", "hoe");
    public static final RegistryObject<Item> TIN_HELMET = createArmorItems("tin", "helmet");
    public static final RegistryObject<Item> TIN_CHESTPLATE = createArmorItems("tin", "chestplate");
    public static final RegistryObject<Item> TIN_LEGGINGS = createArmorItems("tin", "leggings");
    public static final RegistryObject<Item> TIN_BOOTS = createArmorItems("tin", "boots");

    //Create all Copper Items
    public static final RegistryObject<Item> COPPER_SWORD = createToolItems("copper", "sword");
    public static final RegistryObject<Item> COPPER_SHOVEL = createToolItems("copper", "shovel");
    public static final RegistryObject<Item> COPPER_PICKAXE = createToolItems("copper", "pickaxe");
    public static final RegistryObject<Item> COPPER_AXE = createToolItems("copper", "axe");
    public static final RegistryObject<Item> COPPER_HOE = createToolItems("copper", "hoe");
    public static final RegistryObject<Item> COPPER_HELMET = createArmorItems("copper", "helmet");
    public static final RegistryObject<Item> COPPER_CHESTPLATE = createArmorItems("copper", "chestplate");
    public static final RegistryObject<Item> COPPER_LEGGINGS = createArmorItems("copper", "leggings");
    public static final RegistryObject<Item> COPPER_BOOTS = createArmorItems("copper", "boots");

    //Create all Steel Items
    public static final RegistryObject<Item> STEEL_SWORD = createToolItems("steel", "sword");
    public static final RegistryObject<Item> STEEL_SHOVEL = createToolItems("steel", "shovel");
    public static final RegistryObject<Item> STEEL_PICKAXE = createToolItems("steel", "pickaxe");
    public static final RegistryObject<Item> STEEL_AXE = createToolItems("steel", "axe");
    public static final RegistryObject<Item> STEEL_HOE = createToolItems("steel", "hoe");
    public static final RegistryObject<Item> STEEL_HELMET = createArmorItems("steel", "helmet");
    public static final RegistryObject<Item> STEEL_CHESTPLATE = createArmorItems("steel", "chestplate");
    public static final RegistryObject<Item> STEEL_LEGGINGS = createArmorItems("steel", "leggings");
    public static final RegistryObject<Item> STEEL_BOOTS = createArmorItems("steel", "boots");

    //Create all Bronze Items
    public static final RegistryObject<Item> BRONZE_SWORD = createToolItems("bronze", "sword");
    public static final RegistryObject<Item> BRONZE_SHOVEL = createToolItems("bronze", "shovel");
    public static final RegistryObject<Item> BRONZE_PICKAXE = createToolItems("bronze", "pickaxe");
    public static final RegistryObject<Item> BRONZE_AXE = createToolItems("bronze", "axe");
    public static final RegistryObject<Item> BRONZE_HOE = createToolItems("bronze", "hoe");
    public static final RegistryObject<Item> BRONZE_HELMET = createArmorItems("bronze", "helmet");
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = createArmorItems("bronze", "chestplate");
    public static final RegistryObject<Item> BRONZE_LEGGINGS = createArmorItems("bronze", "leggings");
    public static final RegistryObject<Item> BRONZE_BOOTS = createArmorItems("bronze", "boots");

    //Create all Silver Items
    public static final RegistryObject<Item> SILVER_SWORD = createToolItems("silver", "sword");
    public static final RegistryObject<Item> SILVER_SHOVEL = createToolItems("silver", "shovel");
    public static final RegistryObject<Item> SILVER_PICKAXE = createToolItems("silver", "pickaxe");
    public static final RegistryObject<Item> SILVER_AXE = createToolItems("silver", "axe");
    public static final RegistryObject<Item> SILVER_HOE = createToolItems("silver", "hoe");
    public static final RegistryObject<Item> SILVER_HELMET = createArmorItems("silver", "helmet");
    public static final RegistryObject<Item> SILVER_CHESTPLATE = createArmorItems("silver", "chestplate");
    public static final RegistryObject<Item> SILVER_LEGGINGS = createArmorItems("silver", "leggings");
    public static final RegistryObject<Item> SILVER_BOOTS = createArmorItems("silver", "boots");

    //Create all Platinum Items
    public static final RegistryObject<Item> PLATINUM_SWORD = createToolItems("platinum", "sword");
    public static final RegistryObject<Item> PLATINUM_SHOVEL = createToolItems("platinum", "shovel");
    public static final RegistryObject<Item> PLATINUM_PICKAXE = createToolItems("platinum", "pickaxe");
    public static final RegistryObject<Item> PLATINUM_AXE = createToolItems("platinum", "axe");
    public static final RegistryObject<Item> PLATINUM_HOE = createToolItems("platinum", "hoe");
    public static final RegistryObject<Item> PLATINUM_HELMET = createArmorItems("platinum", "helmet");
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = createArmorItems("platinum", "chestplate");
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = createArmorItems("platinum", "leggings");
    public static final RegistryObject<Item> PLATINUM_BOOTS = createArmorItems("platinum", "boots");

    //Create all Lead Items
    public static final RegistryObject<Item> LEAD_SWORD = createToolItems("lead", "sword");
    public static final RegistryObject<Item> LEAD_SHOVEL = createToolItems("lead", "shovel");
    public static final RegistryObject<Item> LEAD_PICKAXE = createToolItems("lead", "pickaxe");
    public static final RegistryObject<Item> LEAD_AXE = createToolItems("lead", "axe");
    public static final RegistryObject<Item> LEAD_HOE = createToolItems("lead", "hoe");
    public static final RegistryObject<Item> LEAD_HELMET = createArmorItems("lead", "helmet");
    public static final RegistryObject<Item> LEAD_CHESTPLATE = createArmorItems("lead", "chestplate");
    public static final RegistryObject<Item> LEAD_LEGGINGS = createArmorItems("lead", "leggings");
    public static final RegistryObject<Item> LEAD_BOOTS = createArmorItems("lead", "boots");
}
//
//    public static final RegistryObject<Item> XY_SWORD = createToolItems("xy", "sword");
//    public static final RegistryObject<Item> XY_SHOVEL = createToolItems("xy", "shovel");
//    public static final RegistryObject<Item> XY_PICKAXE = createToolItems("xy", "pickaxe");
//    public static final RegistryObject<Item> XY_AXE = createToolItems("xy", "axe");
//    public static final RegistryObject<Item> XY_HOE = createToolItems("xy", "hoe");
//    public static final RegistryObject<Item> XY_HELMET = createArmorItems("xy", "helmet");
//    public static final RegistryObject<Item> XY_CHESTPLATE = createArmorItems("xy", "chestplate");
//    public static final RegistryObject<Item> XY_LEGGINGS = createArmorItems("xy", "leggings");
//    public static final RegistryObject<Item> XY_BOOTS = createArmorItems("xy", "boots");

