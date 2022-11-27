package com.erishiongames.moat.item;

import com.erishiongames.moat.util.ModConfig;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    TIN(ModConfig.TOOLS_HARVEST_LEVEL_MAP.get("tin").get(), ModConfig.TOOLS_MAX_USES_MAP.get("tin").get(), ModConfig.TOOLS_SPEED_MAP.get("tin").get(), ModConfig.TOOLS_BASE_DAMAGE_MAP.get("tin").get(),
            ModConfig.TOOLS_ENCHANTMENT_VALUE_MAP.get("tin").get(), () -> Ingredient.of(ModItems.TIN_INGOT.get())),
    COPPER(ModConfig.TOOLS_HARVEST_LEVEL_MAP.get("copper").get(), ModConfig.TOOLS_MAX_USES_MAP.get("copper").get(), ModConfig.TOOLS_SPEED_MAP.get("copper").get(), ModConfig.TOOLS_BASE_DAMAGE_MAP.get("copper").get(),
            ModConfig.TOOLS_ENCHANTMENT_VALUE_MAP.get("copper").get(), () -> Ingredient.of(ModItems.COPPER_INGOT.get())),
    STEEL(ModConfig.TOOLS_HARVEST_LEVEL_MAP.get("steel").get(), ModConfig.TOOLS_MAX_USES_MAP.get("steel").get(), ModConfig.TOOLS_SPEED_MAP.get("steel").get(), ModConfig.TOOLS_BASE_DAMAGE_MAP.get("steel").get(),
            ModConfig.TOOLS_ENCHANTMENT_VALUE_MAP.get("steel").get(), () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
    BRONZE(ModConfig.TOOLS_HARVEST_LEVEL_MAP.get("bronze").get(), ModConfig.TOOLS_MAX_USES_MAP.get("bronze").get(), ModConfig.TOOLS_SPEED_MAP.get("bronze").get(), ModConfig.TOOLS_BASE_DAMAGE_MAP.get("bronze").get(),
            ModConfig.TOOLS_ENCHANTMENT_VALUE_MAP.get("bronze").get(), () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
    SILVER(ModConfig.TOOLS_HARVEST_LEVEL_MAP.get("silver").get(), ModConfig.TOOLS_MAX_USES_MAP.get("silver").get(), ModConfig.TOOLS_SPEED_MAP.get("silver").get(), ModConfig.TOOLS_BASE_DAMAGE_MAP.get("silver").get(),
            ModConfig.TOOLS_ENCHANTMENT_VALUE_MAP.get("silver").get(), () -> Ingredient.of(ModItems.SILVER_INGOT.get())),
    PLATINUM(ModConfig.TOOLS_HARVEST_LEVEL_MAP.get("platinum").get(), ModConfig.TOOLS_MAX_USES_MAP.get("platinum").get(), ModConfig.TOOLS_SPEED_MAP.get("platinum").get(), ModConfig.TOOLS_BASE_DAMAGE_MAP.get("platinum").get(),
            ModConfig.TOOLS_ENCHANTMENT_VALUE_MAP.get("platinum").get(), () -> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
    LEAD(ModConfig.TOOLS_HARVEST_LEVEL_MAP.get("lead").get(), ModConfig.TOOLS_MAX_USES_MAP.get("lead").get(), ModConfig.TOOLS_SPEED_MAP.get("lead").get(), ModConfig.TOOLS_BASE_DAMAGE_MAP.get("lead").get(),
            ModConfig.TOOLS_ENCHANTMENT_VALUE_MAP.get("lead").get(), () -> Ingredient.of(ModItems.LEAD_INGOT.get()))
      ;


    public static final HashMap<String, ModItemTier> MOD_ITEM_TIER_MAP = new HashMap<>();
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;


    public static void generateModItemTierMapValues(){
        MOD_ITEM_TIER_MAP.put("tin", TIN);
        MOD_ITEM_TIER_MAP.put("copper", COPPER);
        MOD_ITEM_TIER_MAP.put("steel", STEEL);
        MOD_ITEM_TIER_MAP.put("bronze", BRONZE);
        MOD_ITEM_TIER_MAP.put("silver", SILVER);
        MOD_ITEM_TIER_MAP.put("platinum", PLATINUM);
        MOD_ITEM_TIER_MAP.put("lead", LEAD);
    }

    ModItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }


    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
