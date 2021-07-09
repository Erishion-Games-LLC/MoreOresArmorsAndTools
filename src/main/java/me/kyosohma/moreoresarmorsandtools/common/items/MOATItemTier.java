package me.kyosohma.moreoresarmorsandtools.common.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum MOATItemTier implements IItemTier
{
    TIN(1, 200, 5.0F, 0.0F, 8, () -> Ingredient.of(MOATTags.TIN_INGOTS)),
    COPPER(1, 200, 5.0F, 0.0F, 8, () -> Ingredient.of(MOATTags.COPPER_INGOTS)),
    BRONZE(2, 600, 8.0F, 0.0F, 12, () -> Ingredient.of(MOATTags.BRONZE_INGOTS)),
    STEEL(2, 900, 7.0F, 0.0F, 13, () -> Ingredient.of(MOATTags.STEEL_INGOTS)),
    SILVER(2, 400, 9.0F, 0.0F, 23, () -> Ingredient.of(MOATTags.SILVER_INGOTS)),
    LEAD(3, 1800, 7.0F, 0.0F, 6, () -> Ingredient.of(MOATTags.LEAD_INGOTS)),
    PLATINUM(3, 1000, 8.0F, 0.0F, 18, () -> Ingredient.of(MOATTags.PLATINUM_INGOTS));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    MOATItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient)
    {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getUses()
    {
        return uses;
    }

    @Override
    public float getSpeed()
    {
        return speed;
    }

    @Override
    public float getAttackDamageBonus()
    {
        return damage;
    }

    @Override
    public int getLevel()
    {
        return level;
    }

    @Override
    public int getEnchantmentValue()
    {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return repairIngredient.get();
    }
}
