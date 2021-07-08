package me.kyosohma.moreoresarmorsandtools.common.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum MOATItemTier implements IItemTier
{
    TIN(1, 200, 5.0F, 0.0F, 8, () -> Ingredient.fromTag(MOATTags.TIN_INGOTS)),
    COPPER(1, 200, 5.0F, 0.0F, 8, () -> Ingredient.fromTag(MOATTags.COPPER_INGOTS)),
    BRONZE(2, 600, 8.0F, 0.0F, 12, () -> Ingredient.fromTag(MOATTags.BRONZE_INGOTS)),
    STEEL(2, 900, 7.0F, 0.0F, 13, () -> Ingredient.fromTag(MOATTags.STEEL_INGOTS)),
    SILVER(2, 400, 9.0F, 0.0F, 23, () -> Ingredient.fromTag(MOATTags.SILVER_INGOTS)),
    LEAD(3, 1800, 7.0F, 0.0F, 6, () -> Ingredient.fromTag(MOATTags.LEAD_INGOTS)),
    PLATINUM(3, 1000, 8.0F, 0.0F, 18, () -> Ingredient.fromTag(MOATTags.PLATINUM_INGOTS));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    MOATItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getMaxUses()
    {
        return maxUses;
    }

    @Override
    public float getEfficiency()
    {
        return efficiency;
    }

    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel()
    {
        return harvestLevel;
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return repairMaterial.getValue();
    }
}
