package com.erishiongames.moat.item;

import com.erishiongames.moat.MoatMain;
import com.erishiongames.moat.util.ModConfig;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.HashMap;
import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {
    TIN("tin", ModConfig.ARMOR_DURABILITY_MODIFIER_MAP.get("tin").get(), new int[]{1, 4, 5, 2}, ModConfig.ARMOR_ENCHANTMENT_VALUE_MAP.get("tin").get(),
            SoundEvents.ARMOR_EQUIP_IRON, ModConfig.ARMOR_TOUGHNESS_MAP.get("tin").get(),
            ModConfig.ARMOR_KNOCKBACK_RESISTANCE_MAP.get("tin").get(), () -> Ingredient.of((ModItems.TIN_INGOT.get()))),


    COPPER("copper", ModConfig.ARMOR_DURABILITY_MODIFIER_MAP.get("copper").get(), new int[]{3, 4, 5, 3}, ModConfig.ARMOR_ENCHANTMENT_VALUE_MAP.get("copper").get(),
            SoundEvents.ARMOR_EQUIP_IRON, ModConfig.ARMOR_TOUGHNESS_MAP.get("copper").get(),
            ModConfig.ARMOR_KNOCKBACK_RESISTANCE_MAP.get("copper").get(), () -> Ingredient.of((ModItems.COPPER_INGOT.get()))),


    STEEL("steel", ModConfig.ARMOR_DURABILITY_MODIFIER_MAP.get("steel").get(), new int[]{3, 5, 6, 3}, ModConfig.ARMOR_ENCHANTMENT_VALUE_MAP.get("steel").get(),
            SoundEvents.ARMOR_EQUIP_IRON, ModConfig.ARMOR_TOUGHNESS_MAP.get("steel").get(),
            ModConfig.ARMOR_KNOCKBACK_RESISTANCE_MAP.get("steel").get(), () -> Ingredient.of((ModItems.STEEL_INGOT.get()))),


    BRONZE("bronze", ModConfig.ARMOR_DURABILITY_MODIFIER_MAP.get("bronze").get(), new int[]{2, 6, 7, 2}, ModConfig.ARMOR_ENCHANTMENT_VALUE_MAP.get("bronze").get(),
            SoundEvents.ARMOR_EQUIP_IRON, ModConfig.ARMOR_TOUGHNESS_MAP.get("bronze").get(),
            ModConfig.ARMOR_KNOCKBACK_RESISTANCE_MAP.get("bronze").get(), () -> Ingredient.of((ModItems.BRONZE_INGOT.get()))),


    SILVER("silver", ModConfig.ARMOR_DURABILITY_MODIFIER_MAP.get("silver").get(), new int[]{2, 5, 5, 2}, ModConfig.ARMOR_ENCHANTMENT_VALUE_MAP.get("silver").get(),
            SoundEvents.ARMOR_EQUIP_GOLD, ModConfig.ARMOR_TOUGHNESS_MAP.get("silver").get(),
            ModConfig.ARMOR_KNOCKBACK_RESISTANCE_MAP.get("silver").get(), () -> Ingredient.of((ModItems.SILVER_INGOT.get()))),


    PLATINUM("platinum", ModConfig.ARMOR_DURABILITY_MODIFIER_MAP.get("platinum").get(), new int[]{3, 6, 7, 3}, ModConfig.ARMOR_ENCHANTMENT_VALUE_MAP.get("platinum").get(),
            SoundEvents.ARMOR_EQUIP_DIAMOND, ModConfig.ARMOR_TOUGHNESS_MAP.get("platinum").get(),
            ModConfig.ARMOR_KNOCKBACK_RESISTANCE_MAP.get("platinum").get(), () -> Ingredient.of((ModItems.PLATINUM_INGOT.get()))),


    LEAD("lead", ModConfig.ARMOR_DURABILITY_MODIFIER_MAP.get("lead").get(), new int[]{1, 4, 5, 2}, ModConfig.ARMOR_ENCHANTMENT_VALUE_MAP.get("lead").get(),
            SoundEvents.ARMOR_EQUIP_NETHERITE, ModConfig.ARMOR_TOUGHNESS_MAP.get("lead").get(),
            ModConfig.ARMOR_KNOCKBACK_RESISTANCE_MAP.get("lead").get(), () -> Ingredient.of((ModItems.LEAD_INGOT.get()))),
    ;


    public static final HashMap<String, ModArmorMaterial> MOD_ARMOR_MATERIAL_MAP = new HashMap<>();
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    public static void generateModArmorMaterialMapValues(){
        MOD_ARMOR_MATERIAL_MAP.put("tin", TIN);
        MOD_ARMOR_MATERIAL_MAP.put("copper", COPPER);
        MOD_ARMOR_MATERIAL_MAP.put("steel", STEEL);
        MOD_ARMOR_MATERIAL_MAP.put("bronze", BRONZE);
        MOD_ARMOR_MATERIAL_MAP.put("silver", SILVER);
        MOD_ARMOR_MATERIAL_MAP.put("platinum", PLATINUM);
        MOD_ARMOR_MATERIAL_MAP.put("lead", LEAD);
    }

    private ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return MoatMain.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
