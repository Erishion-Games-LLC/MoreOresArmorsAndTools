package me.kyosohma.moreoresarmorsandtools;

import me.kyosohma.moreoresarmorsandtools.config.MOATConfig;
import me.kyosohma.moreoresarmorsandtools.core.init.BlockInit;
import me.kyosohma.moreoresarmorsandtools.core.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreOresArmorsAndTools.MODID)
public class MoreOresArmorsAndTools
{
    public static final String MODID = "moat";

    public static final ItemGroup TAB = new ItemGroup("moatTab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemInit.PLATINUM_INGOT.get());
        }
    };

    public MoreOresArmorsAndTools()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MOATConfig.COMMON_SPEC);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
