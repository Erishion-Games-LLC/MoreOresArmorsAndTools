package com.erishiongames.moat.util;

import com.electronwill.nightconfig.core.Config;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public final class ModConfig {

    public static final ForgeConfigSpec.Builder CONFIG_BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CONFIG_SPEC;

    //Materials
    public static final ArrayList<String> ALL_MATERIALS_ARRAY = new ArrayList<>(Arrays.asList("tin", "copper", "steel", "bronze", "silver", "platinum", "lead"));
    public static final ArrayList<String> SPAWNING_MATERIALS_ARRAY = new ArrayList<>(Arrays.asList("tin", "copper", "silver", "platinum", "lead"));

    //Ore values
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> ORE_HARVEST_LEVEL_MAP = new HashMap<>();
    private static final ArrayList<Integer> ORE_HARVEST_LEVELS_ARRAY = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 0));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Float>> ORE_HARDNESS_MAP = new HashMap<>();
    private static final ArrayList<Float> ORE_HARDNESS_ARRAY = new ArrayList<>(Arrays.asList(3f, 3f, 3f, 3f, 3f));

    //Storage block values
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> STORAGE_BLOCK_HARVEST_LEVEL_MAP = new HashMap<>();
    private static final ArrayList<Integer> STORAGE_BLOCK_HARVEST_LEVEL_ARRAY = new ArrayList<>(Arrays.asList(0, 1, 2, 2, 1, 2, 0));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Float>> STORAGE_BLOCK_HARDNESS_MAP = new HashMap<>();
    private static final ArrayList<Float> STORAGE_BLOCK_HARDNESS_ARRAY = new ArrayList<>(Arrays.asList(3f, 5f, 5f, 5f, 5f, 5f, 3f));

    //Tools values
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> TOOLS_HARVEST_LEVEL_MAP = new HashMap<>();
    private static final ArrayList<Integer> TOOLS_HARVEST_LEVEL_ARRAY = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 2, 3, 1));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> TOOLS_MAX_USES_MAP = new HashMap<>();
    private static final ArrayList<Integer> TOOLS_MAX_USES_ARRAY = new ArrayList<>(Arrays.asList(150, 400, 800, 500, 200, 1200, 150));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Float>> TOOLS_SPEED_MAP = new HashMap<>();
    private static final ArrayList<Float> TOOLS_SPEED_ARRAY = new ArrayList<>(Arrays.asList(5f, 6f, 7f, 8f, 10f, 8f, 3f));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Float>> TOOLS_BASE_DAMAGE_MAP = new HashMap<>();
    private static final ArrayList<Float> TOOLS_BASE_DAMAGE_ARRAY = new ArrayList<>(Arrays.asList(1f, 2f, 3f, 3f, 2f, 3f, 1f));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> TOOLS_ENCHANTMENT_VALUE_MAP = new HashMap<>();
    private static final ArrayList<Integer> TOOLS_ENCHANTMENT_VALUE_ARRAY = new ArrayList<>(Arrays.asList(8, 12, 16, 20, 30, 22, 6));

    //Armor Values
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> ARMOR_ENCHANTMENT_VALUE_MAP = new HashMap<>();
    private static final ArrayList<Integer> ARMOR_ENCHANTMENT_VALUE_ARRAY = new ArrayList<>(Arrays.asList(8, 12, 16, 20, 30, 22, 6));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> ARMOR_DURABILITY_MODIFIER_MAP = new HashMap<>();
    private static final ArrayList<Integer> ARMOR_DURABILITY_MODIFIER_ARRAY = new ArrayList<>(Arrays.asList(8, 18, 25, 20, 13, 30, 8));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Float>> ARMOR_TOUGHNESS_MAP = new HashMap<>();
    private static final ArrayList<Float> ARMOR_TOUGHNESS_ARRAY = new ArrayList<>(Arrays.asList(0f, 0f, 1f, 1f, 1f, 2f, 2.5f));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Float>> ARMOR_KNOCKBACK_RESISTANCE_MAP = new HashMap<>();
    private static final ArrayList<Float> ARMOR_KNOCKBACK_RESISTANCE_ARRAY = new ArrayList<>(Arrays.asList(0f, 0f, 0f, 0f, 0f, 0f, 0.2f));

    //Ore Generation
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> MAX_VEIN_SIZE_MAP = new HashMap<>();
    private static final ArrayList<Integer> MAX_VEIN_SIZE_ARRAY = new ArrayList<>(Arrays.asList(15, 14, 9, 8, 7));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> MIN_HEIGHT_MAP = new HashMap<>();
    private static final ArrayList<Integer> MIN_HEIGHT_ARRAY = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> MAX_HEIGHT_MAP = new HashMap<>();
    private static final ArrayList<Integer> MAX_HEIGHT_ARRAY = new ArrayList<>(Arrays.asList(80, 64, 24, 16, 48));
    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Integer>> VEINS_PER_CHUNK_MAP = new HashMap<>();
    private static final ArrayList<Integer> VEINS_PER_CHUNK_ARRAY = new ArrayList<>(Arrays.asList(16, 20, 2, 2, 2));

    public static final HashMap<String, ForgeConfigSpec.ConfigValue<Boolean>> ORES_TO_GENERATE_MAP = new HashMap<>();
    private static final ArrayList<Boolean> ORES_TO_GENERATE_ARRAY = new ArrayList<>(Arrays.asList(true, true, true, true, true));


    private static <T> void generateConfigValues(String item, String property, HashMap<String, ForgeConfigSpec.ConfigValue<T>> mapToUse, ArrayList<String> materials, ArrayList<T> values) {
        for (int i = 0; i < materials.size(); i++) {
            mapToUse.put(materials.get(i).toLowerCase(), CONFIG_BUILDER
                    .comment(getConfigComment(item, property)
                            + materials.get(i).toLowerCase()
                            + " "
                            + item.toLowerCase()
                            + ". Default = "
                            + values.get(i).toString())
                    .define(materials.get(i).toLowerCase()
                            + " "
                            + item
                            + " "
                            + property.toLowerCase(), values.get(i)));}
    }


    private static String getConfigComment(String item, String property) {
        property = property.toLowerCase();
        String returnString = null;
        switch (property) {
            case "harvest level":
                switch (item) {
                    case "ore":
                    case "storage block":
                        returnString = "The harvest level required to mine ";
                        break;
                    case "tools":
                    case "armor":
                        returnString = "The harvest level of ";
                        break;
                }
            case "hardness":
                returnString = "The hardness of ";
                break;
            case "max uses":
                returnString = "The max uses of ";
                break;
            case "speed":
                returnString = "The speed of ";
                break;
            case "base damage":
                returnString = "The base damage of ";
                break;
            case "enchantment value":
                returnString = "The enchantment value of ";
                break;
            case "durability modifier":
                returnString = "The durability modifier of ";
                break;
            case "toughness":
                returnString = "The toughness of ";
                break;
            case "knockback resistance":
                returnString = "The knockback resistance of ";
                break;
            case "to generate":
                returnString = "Generate ";
                break;
            case "max vein size":
                returnString = "The max vein size of ";
                break;
            case "min height":
                returnString = "The min height of ";
                break;
            case "max height":
                returnString = "The max height of ";
                break;
            case "veins per chunk":
                returnString = "The amount of veins per chunk of ";
                break;
        }
        return returnString;
    }


    static {
        Config.setInsertionOrderPreserved(true);
        CONFIG_BUILDER.push("Ore Generation");

            //Generate Ores?
            CONFIG_BUILDER.push("Generate ore?");
            generateConfigValues("ore", "to generate", ORES_TO_GENERATE_MAP, SPAWNING_MATERIALS_ARRAY, ORES_TO_GENERATE_ARRAY);
            CONFIG_BUILDER.pop();

            //Max vein size
            CONFIG_BUILDER.push("Max vein size");
            generateConfigValues("ore", "max vein size", MAX_VEIN_SIZE_MAP, SPAWNING_MATERIALS_ARRAY, MAX_VEIN_SIZE_ARRAY);
            CONFIG_BUILDER.pop();

            //Min height
            CONFIG_BUILDER.push("Min height");
            generateConfigValues("ore", "min height", MIN_HEIGHT_MAP, SPAWNING_MATERIALS_ARRAY, MIN_HEIGHT_ARRAY);
            CONFIG_BUILDER.pop();

            //Max height
            CONFIG_BUILDER.push("Max height");
            generateConfigValues("ore", "max height", MAX_HEIGHT_MAP, SPAWNING_MATERIALS_ARRAY, MAX_HEIGHT_ARRAY);
            CONFIG_BUILDER.pop();

            //Veins per chunk
            CONFIG_BUILDER.push("Veins per chunk");
            generateConfigValues("ore", "veins per chunk", VEINS_PER_CHUNK_MAP, SPAWNING_MATERIALS_ARRAY, VEINS_PER_CHUNK_ARRAY);
            CONFIG_BUILDER.pop();
        CONFIG_BUILDER.pop();



        CONFIG_BUILDER.push("Harvest Levels");

            //Ore harvest levels
            CONFIG_BUILDER.push("Ore harvest levels, Vanilla tools: Wood - 0, Stone/Gold - 1, Iron - 2, Diamond - 3, Netherite - 4");
                generateConfigValues("ore", "harvest level", ORE_HARVEST_LEVEL_MAP, SPAWNING_MATERIALS_ARRAY, ORE_HARVEST_LEVELS_ARRAY);
            CONFIG_BUILDER.pop();

            //Block harvest levels
            CONFIG_BUILDER.push("Block harvest levels, Vanilla tools: Wood - 0, Stone/Gold - 1, Iron - 2, Diamond - 3, Netherite - 4");
                generateConfigValues("storage block", "harvest level", STORAGE_BLOCK_HARVEST_LEVEL_MAP, ALL_MATERIALS_ARRAY, STORAGE_BLOCK_HARVEST_LEVEL_ARRAY);
            CONFIG_BUILDER.pop();
        CONFIG_BUILDER.pop();



        CONFIG_BUILDER.push("Hardness Values");

            //Ore hardness
            CONFIG_BUILDER.push("Ore hardness values, Vanilla ores are 3, Netherite is 30");
                generateConfigValues("ore", "hardness", ORE_HARDNESS_MAP, SPAWNING_MATERIALS_ARRAY, ORE_HARDNESS_ARRAY);
            CONFIG_BUILDER.pop();

            //Block hardness
            CONFIG_BUILDER.push("Block hardness values, Gold - 3, Iron - 5, Coal - 5, Diamond - 5, Netherite - 50");
                generateConfigValues("storage block", "hardness", STORAGE_BLOCK_HARDNESS_MAP, ALL_MATERIALS_ARRAY, STORAGE_BLOCK_HARDNESS_ARRAY);
            CONFIG_BUILDER.pop();
        CONFIG_BUILDER.pop();



        CONFIG_BUILDER.push("Tool specs");

            //Material harvest level
            CONFIG_BUILDER.push("Material harvest level");
                generateConfigValues("tools", "harvest level", TOOLS_HARVEST_LEVEL_MAP, ALL_MATERIALS_ARRAY, TOOLS_HARVEST_LEVEL_ARRAY);
             CONFIG_BUILDER.pop();

            //Material max uses
            CONFIG_BUILDER.push("Material max uses");
                generateConfigValues("tools", "maxUses", TOOLS_MAX_USES_MAP, ALL_MATERIALS_ARRAY, TOOLS_MAX_USES_ARRAY);
             CONFIG_BUILDER.pop();

            //Material speed
            CONFIG_BUILDER.push("Material speed");
                generateConfigValues("tools", "speed", TOOLS_SPEED_MAP, ALL_MATERIALS_ARRAY, TOOLS_SPEED_ARRAY);
            CONFIG_BUILDER.pop();

            //Material base damage
            CONFIG_BUILDER.push("Material base damage");
                generateConfigValues("tools", "base damage", TOOLS_BASE_DAMAGE_MAP, ALL_MATERIALS_ARRAY, TOOLS_BASE_DAMAGE_ARRAY);
            CONFIG_BUILDER.pop();

            //Material enchantment value
            CONFIG_BUILDER.push("Material enchantment value");
                generateConfigValues("tools", "enchantment value", TOOLS_ENCHANTMENT_VALUE_MAP, ALL_MATERIALS_ARRAY, TOOLS_ENCHANTMENT_VALUE_ARRAY);
             CONFIG_BUILDER.pop();
        CONFIG_BUILDER.pop();



        CONFIG_BUILDER.push("Armor Specs");

            //Material enchantment value
            CONFIG_BUILDER.push("Material enchantment value");
                generateConfigValues("armor", "enchantment value", ARMOR_ENCHANTMENT_VALUE_MAP, ALL_MATERIALS_ARRAY, ARMOR_ENCHANTMENT_VALUE_ARRAY);
            CONFIG_BUILDER.pop();

            //Material durability modifier
            CONFIG_BUILDER.push("Material durability multiplier");
                generateConfigValues("armor", "durability modifier", ARMOR_DURABILITY_MODIFIER_MAP, ALL_MATERIALS_ARRAY, ARMOR_DURABILITY_MODIFIER_ARRAY);
            CONFIG_BUILDER.pop();

            //Material toughness
            CONFIG_BUILDER.push("Material toughness");
                generateConfigValues("armor", "toughness", ARMOR_TOUGHNESS_MAP, ALL_MATERIALS_ARRAY, ARMOR_TOUGHNESS_ARRAY);
            CONFIG_BUILDER.pop();

            //Material knockback resistance
            CONFIG_BUILDER.push("Material knockback resistance");
                generateConfigValues("armor", "knockback resistance", ARMOR_KNOCKBACK_RESISTANCE_MAP, ALL_MATERIALS_ARRAY, ARMOR_KNOCKBACK_RESISTANCE_ARRAY);
            CONFIG_BUILDER.pop();
        CONFIG_BUILDER.pop();
        CONFIG_SPEC = CONFIG_BUILDER.build();
    }
}
