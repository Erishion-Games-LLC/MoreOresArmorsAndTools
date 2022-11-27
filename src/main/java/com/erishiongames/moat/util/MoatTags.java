package com.erishiongames.moat.util;

import com.erishiongames.moat.MoatMain;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class MoatTags {

    public static class Blocks {

        public static final Tags.IOptionalNamedTag<Block> TIN_ORE = createForgeTag("ores/tin");
        public static final Tags.IOptionalNamedTag<Block> TIN_BLOCK = createForgeTag("storage_blocks/tin");

        public static final Tags.IOptionalNamedTag<Block> COPPER_ORE = createForgeTag("ores/copper");
        public static final Tags.IOptionalNamedTag<Block> COPPER_BLOCK = createForgeTag("storage_blocks/copper");

        public static final Tags.IOptionalNamedTag<Block> STEEL_BLOCK = createForgeTag("storage_blocks/steel");

        public static final Tags.IOptionalNamedTag<Block> BRONZE_BLOCK = createForgeTag("storage_blocks/bronze");

        public static final Tags.IOptionalNamedTag<Block> SILVER_ORE = createForgeTag("ores/silver");
        public static final Tags.IOptionalNamedTag<Block> SILVER_BLOCK = createForgeTag("storage_blocks/silver");

        public static final Tags.IOptionalNamedTag<Block> PLATINUM_ORE = createForgeTag("ores/platinum");
        public static final Tags.IOptionalNamedTag<Block> PLATINUM_BLOCK = createForgeTag("storage_blocks/platinum");

        public static final Tags.IOptionalNamedTag<Block> LEAD_ORE = createForgeTag("ores/lead");
        public static final Tags.IOptionalNamedTag<Block> LEAD_BLOCK = createForgeTag("storage_blocks/lead");


        private static Tags.IOptionalNamedTag<Block> createTag(String name) {
            return BlockTags.createOptional(new ResourceLocation(MoatMain.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> TIN_ORE = createForgeTag("ores/tin");
        public static final Tags.IOptionalNamedTag<Item> TIN_BLOCK = createForgeTag("storage_blocks/tin");
        public static final Tags.IOptionalNamedTag<Item> TIN_INGOT = createForgeTag("ingots/tin");
        public static final Tags.IOptionalNamedTag<Item> TIN_NUGGETS = createForgeTag("nuggets/tin");

        public static final Tags.IOptionalNamedTag<Item> COPPER_ORE = createForgeTag("ores/copper");
        public static final Tags.IOptionalNamedTag<Item> COPPER_BLOCK = createForgeTag("storage_blocks/copper");
        public static final Tags.IOptionalNamedTag<Item> COPPER_INGOT = createForgeTag("ingots/copper");
        public static final Tags.IOptionalNamedTag<Item> COPPER_NUGGETS = createForgeTag("nuggets/copper");

        public static final Tags.IOptionalNamedTag<Item> STEEL_BLOCK = createForgeTag("storage_blocks/steel");
        public static final Tags.IOptionalNamedTag<Item> STEEL_INGOT = createForgeTag("ingots/steel");
        public static final Tags.IOptionalNamedTag<Item> STEEL_NUGGETS = createForgeTag("nuggets/steel");

        public static final Tags.IOptionalNamedTag<Item> BRONZE_BLOCK = createForgeTag("storage_blocks/bronze");
        public static final Tags.IOptionalNamedTag<Item> BRONZE_INGOT = createForgeTag("ingots/bronze");
        public static final Tags.IOptionalNamedTag<Item> BRONZE_NUGGETS = createForgeTag("nuggets/bronze");

        public static final Tags.IOptionalNamedTag<Item> SILVER_ORE = createForgeTag("ores/silver");
        public static final Tags.IOptionalNamedTag<Item> SILVER_BLOCK = createForgeTag("storage_blocks/silver");
        public static final Tags.IOptionalNamedTag<Item> SILVER_INGOT = createForgeTag("ingots/silver");
        public static final Tags.IOptionalNamedTag<Item> SILVER_NUGGETS = createForgeTag("nuggets/silver");

        public static final Tags.IOptionalNamedTag<Item> PLATINUM_ORE = createForgeTag("ores/platinum");
        public static final Tags.IOptionalNamedTag<Item> PLATINUM_BLOCK = createForgeTag("storage_blocks/platinum");
        public static final Tags.IOptionalNamedTag<Item> PLATINUM_INGOT = createForgeTag("ingots/platinum");
        public static final Tags.IOptionalNamedTag<Item> PLATINUM_NUGGETS = createForgeTag("nuggets/platinum");

        public static final Tags.IOptionalNamedTag<Item> LEAD_ORE = createForgeTag("ores/lead");
        public static final Tags.IOptionalNamedTag<Item> LEAD_BLOCK = createForgeTag("storage_blocks/lead");
        public static final Tags.IOptionalNamedTag<Item> LEAD_INGOT = createForgeTag("ingots/lead");
        public static final Tags.IOptionalNamedTag<Item> LEAD_NUGGETS = createForgeTag("nuggets/lead");


        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(MoatMain.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}
