package com.erishiongames.moat.item;

import com.erishiongames.moat.MoatMain;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoatMain.MOD_ID);

    public static final Item.Properties genericItemProperties = new Item.Properties().tab(ModItemGroup.MOAT_GROUP);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static RegistryObject<Item> createMaterialItems(String material, String item){
        return ITEMS.register(material.toLowerCase() + "_" + item.toLowerCase(), () ->
                new Item(genericItemProperties));
    }



    public static final RegistryObject<Item> TIN_INGOT = createMaterialItems("tin", "ingot");
    public static final RegistryObject<Item> TIN_NUGGET = createMaterialItems("tin", "nugget");

    public static final RegistryObject<Item> COPPER_INGOT = createMaterialItems("copper", "ingot");
    public static final RegistryObject<Item> COPPER_NUGGET = createMaterialItems("copper", "nugget");

    public static final RegistryObject<Item> STEEL_INGOT = createMaterialItems("steel", "ingot");
    public static final RegistryObject<Item> STEEL_NUGGET = createMaterialItems("steel", "nugget");

    public static final RegistryObject<Item> BRONZE_INGOT = createMaterialItems("bronze", "ingot");
    public static final RegistryObject<Item> BRONZE_NUGGET = createMaterialItems("bronze", "nugget");

    public static final RegistryObject<Item> SILVER_INGOT = createMaterialItems("silver", "ingot");
    public static final RegistryObject<Item> SILVER_NUGGET = createMaterialItems("silver", "nugget");

    public static final RegistryObject<Item> PLATINUM_INGOT = createMaterialItems("platinum", "ingot");
    public static final RegistryObject<Item> PLATINUM_NUGGET = createMaterialItems("platinum", "nugget");

    public static final RegistryObject<Item> LEAD_INGOT = createMaterialItems("lead", "ingot");
    public static final RegistryObject<Item> LEAD_NUGGET = createMaterialItems("lead", "nugget");

}
//    public static final RegistryObject<Item> XY_INGOT = createMaterialItems("xy", "ingot");
//
//    public static final RegistryObject<Item> XY_NUGGET = createMaterialItems("xy", "nugget");
