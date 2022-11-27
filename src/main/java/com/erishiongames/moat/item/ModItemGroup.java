package com.erishiongames.moat.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup MOAT_GROUP = new ItemGroup("moatTab") {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.SILVER_INGOT.get());
        }
    };
}
