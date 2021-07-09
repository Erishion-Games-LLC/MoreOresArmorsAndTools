package me.kyosohma.moreoresarmorsandtools.common.items;

import me.kyosohma.moreoresarmorsandtools.MoreOresArmorsAndTools;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum MOATArmorMaterial implements IArmorMaterial
{
    TIN("tin", 11, new int[]{2, 4, 5, 1}, 8, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, () -> Ingredient.of(MOATTags.TIN_INGOTS), 0),
    COPPER("copper", 11, new int[]{2, 4, 5, 1}, 8, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, () -> Ingredient.of(MOATTags.COPPER_INGOTS), 0),
    BRONZE("bronze", 20, new int[]{2, 5, 6, 2}, 7, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, () -> Ingredient.of(MOATTags.BRONZE_INGOTS), 0),
    STEEL("steel", 25, new int[]{2, 5, 7, 2}, 8, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, () -> Ingredient.of(MOATTags.STEEL_INGOTS), 0),
    SILVER("silver", 17, new int[]{2, 5, 7, 2}, 23, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, () -> Ingredient.of(MOATTags.SILVER_INGOTS), 0),
    LEAD("lead", 37, new int[]{3, 6, 8, 3}, 6, SoundEvents.ARMOR_EQUIP_IRON, 1.5F, () -> Ingredient.of(MOATTags.LEAD_INGOTS), 1),
    PLATINUM("platinum", 27, new int[]{3, 6, 8, 3}, 18, SoundEvents.ARMOR_EQUIP_IRON, 2.0F, () -> Ingredient.of(MOATTags.PLATINUM_INGOTS), 0);

    private static final int[] HEALTH_PER_SLOT = new int[]{11, 16, 15, 13};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    MOATArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, Supplier<Ingredient> repairIngredient, float knockbackResistance)
    {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slotIn)
    {
        return HEALTH_PER_SLOT[slotIn.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slotIn)
    {
        return this.slotProtections[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
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
