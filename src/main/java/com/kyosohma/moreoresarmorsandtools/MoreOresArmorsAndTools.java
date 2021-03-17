package com.kyosohma.moreoresarmorsandtools;

import com.kyosohma.moreoresarmorsandtools.core.init.BlockInit;
import com.kyosohma.moreoresarmorsandtools.core.init.ItemInit;
import com.kyosohma.moreoresarmorsandtools.world.gen.MoatOreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MoreOresArmorsAndTools.MOD_ID)
public class MoreOresArmorsAndTools {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moat";
    public static final ItemGroup TAB = new ItemGroup("moatTab") {@Override public ItemStack createIcon() {return new ItemStack(ItemInit.PLATINUM_INGOT.get());}};

    public MoreOresArmorsAndTools() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, MoatOreGen::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

}
