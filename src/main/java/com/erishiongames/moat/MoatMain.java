package com.erishiongames.moat;

import com.erishiongames.moat.block.ModBlocks;
import com.erishiongames.moat.item.ModArmorMaterial;
import com.erishiongames.moat.item.ModItemTier;
import com.erishiongames.moat.item.ModItems;
import com.erishiongames.moat.item.ModToolsAndArmorItems;
import com.erishiongames.moat.util.ModConfig;
import com.erishiongames.moat.world.gen.ModOreType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(MoatMain.MOD_ID)
public class MoatMain {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moat";

    public MoatMain() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModLoadingContext.get().registerConfig(net.minecraftforge.fml.config.ModConfig.Type.COMMON, ModConfig.CONFIG_SPEC, "MOATConfig-Common.toml");


        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModOreType.generateModOreTypeMapValues();
        ModItemTier.generateModItemTierMapValues();
        ModArmorMaterial.generateModArmorMaterialMapValues();

        ModToolsAndArmorItems.register(eventBus);


//        Not needed right now

//        //Register the setup method for modLoading
//        eventBus.addListener(this::setup);
//        //Register the enqueueIMC method for modLoading
//        eventBus.addListener(this::enqueueIMC);
//        //Register the processIMC method for modLoading
//        eventBus.addListener(this::processIMC);
//        //Register the doClientStuff method for modLoading
//        eventBus.addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }
//    Not needed right now

//    private void setup(final FMLCommonSetupEvent event){
//
//    }
//
//    private void doClientStuff(final FMLClientSetupEvent event) {
//        // do something that can only be done on the client
//        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
//    }
//
//    private void enqueueIMC(final InterModEnqueueEvent event) {
//        // some example code to dispatch IMC to another mod
//        InterModComms.sendTo("moat", "hello world", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
//    }
//
//    private void processIMC(final InterModProcessEvent event) {
//        // some example code to receive and process InterModComms from other mods
//        LOGGER.info("Got IMC {}", event.getIMCStream().map(m->m.getMessageSupplier().get()).collect(Collectors.toList()));
//    }
}
