package me.kyosohma.moreoresarmorsandtools.common.items;

import me.kyosohma.moreoresarmorsandtools.MoreOresArmorsAndTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum MOATArmorMaterial implements IArmorMaterial
{
    TIN("tin", 11, new int[]{2, 4, 5, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> Ingredient.fromTag(MOATTags.TIN_INGOTS), 0),
    COPPER("copper", 11, new int[]{2, 4, 5, 1}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> Ingredient.fromTag(MOATTags.COPPER_INGOTS), 0),
    BRONZE("bronze", 20, new int[]{2, 5, 6, 2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, () -> Ingredient.fromTag(MOATTags.BRONZE_INGOTS), 0),
    STEEL("steel", 25, new int[]{2, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, () -> Ingredient.fromTag(MOATTags.STEEL_INGOTS), 0),
    SILVER("silver", 17, new int[]{2, 5, 7, 2}, 23, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F, () -> Ingredient.fromTag(MOATTags.SILVER_INGOTS), 0),
    LEAD("lead", 37, new int[]{3, 6, 8, 3}, 6, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F, () -> Ingredient.fromTag(MOATTags.LEAD_INGOTS), 1),
    PLATINUM("platinum", 27, new int[]{3, 6, 8, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, () -> Ingredient.fromTag(MOATTags.PLATINUM_INGOTS), 0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    MOATArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance)
    {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return this.repairMaterial.get();
    }

    @Override
    public String getName()
    {
        return MoreOresArmorsAndTools.MODID + ':' + this.name;
    }

    @Override
    public float getToughness()
    {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }
}
