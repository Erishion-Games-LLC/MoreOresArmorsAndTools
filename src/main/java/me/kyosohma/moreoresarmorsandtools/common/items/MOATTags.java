package me.kyosohma.moreoresarmorsandtools.common.items;

import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class MOATTags
{
    public static final Tags.IOptionalNamedTag<Item> TIN_INGOTS = ItemTags.createOptional(new ResourceLocation("forge", "ingots/tin"));
    public static final Tags.IOptionalNamedTag<Item> COPPER_INGOTS = ItemTags.createOptional(new ResourceLocation("forge", "ingots/copper"));
    public static final Tags.IOptionalNamedTag<Item> BRONZE_INGOTS = ItemTags.createOptional(new ResourceLocation("forge", "ingots/bronze"));
    public static final Tags.IOptionalNamedTag<Item> STEEL_INGOTS = ItemTags.createOptional(new ResourceLocation("forge", "ingots/steel"));
    public static final Tags.IOptionalNamedTag<Item> SILVER_INGOTS = ItemTags.createOptional(new ResourceLocation("forge", "ingots/silver"));
    public static final Tags.IOptionalNamedTag<Item> LEAD_INGOTS = ItemTags.createOptional(new ResourceLocation("forge", "ingots/lead"));
    public static final Tags.IOptionalNamedTag<Item> PLATINUM_INGOTS = ItemTags.createOptional(new ResourceLocation("forge", "ingots/platinum"));
}
