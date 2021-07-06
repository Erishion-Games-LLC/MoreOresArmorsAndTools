package com.kyosohma.MoreOresArmorsAndTools.common.items.tools;

import com.kyosohma.MoreOresArmorsAndTools.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum MoatItemTier implements IItemTier {

    TIN(1, 200, 5.0F, 0.0F, 8, () -> {return Ingredient.fromItems(ItemInit.TIN_INGOT.get());}),
    COPPER(1, 200, 5.0F, 0.0F, 8, () -> {return Ingredient.fromItems(ItemInit.COPPER_INGOT.get());}),
    BRONZE(2, 600, 8.0F, 0.0F, 12, () -> {return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get());}),
    STEEL(2, 900, 7.0F, 0.0F, 13, () -> {return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());}),
    SILVER(2, 400, 9.0F, 0.0F, 23, () -> {return Ingredient.fromItems(ItemInit.SILVER_INGOT.get());}),
    LEAD(3, 1800, 7.0F, 0.0F, 6, () -> {return Ingredient.fromItems(ItemInit.LEAD_INGOT.get());}),
    PLATINUM(3, 1000, 8.0F, 0.0F, 18, () -> {return Ingredient.fromItems(ItemInit.PLATINUM_INGOT.get());});

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    MoatItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
