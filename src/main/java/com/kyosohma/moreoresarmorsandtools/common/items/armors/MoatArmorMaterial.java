package com.kyosohma.moreoresarmorsandtools.common.items.armors;

import com.kyosohma.moreoresarmorsandtools.MoreOresArmorsAndTools;
import com.kyosohma.moreoresarmorsandtools.core.init.ItemInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MoatArmorMaterial implements IArmorMaterial {

    TIN(MoreOresArmorsAndTools.MOD_ID + ":tin", 11, new int[] { 2, 4, 5, 1}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> { return Ingredient.fromItems(ItemInit.TIN_INGOT.get());}, 0),
    COPPER(MoreOresArmorsAndTools.MOD_ID + ":copper", 11, new int[] { 2, 4, 5, 1}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> { return Ingredient.fromItems(ItemInit.TIN_INGOT.get());}, 0),
    BRONZE(MoreOresArmorsAndTools.MOD_ID + ":bronze", 20, new int[] { 2, 5, 6, 2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> { return Ingredient.fromItems(ItemInit.TIN_INGOT.get());}, 0),
    STEEL(MoreOresArmorsAndTools.MOD_ID + ":steel", 25, new int[] { 2, 5, 7, 2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> { return Ingredient.fromItems(ItemInit.TIN_INGOT.get());}, 0),
    SILVER(MoreOresArmorsAndTools.MOD_ID + ":silver", 17, new int[] { 2, 5, 7, 2}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> { return Ingredient.fromItems(ItemInit.TIN_INGOT.get());}, 0),
    LEAD(MoreOresArmorsAndTools.MOD_ID + ":lead", 37, new int[] { 3, 6, 8, 3}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F, () -> { return Ingredient.fromItems(ItemInit.TIN_INGOT.get());}, 1),
    PLATINUM(MoreOresArmorsAndTools.MOD_ID + ":platinum", 27, new int[] { 3, 6, 8, 3}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, () -> { return Ingredient.fromItems(ItemInit.TIN_INGOT.get());}, 0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    MoatArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
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
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
