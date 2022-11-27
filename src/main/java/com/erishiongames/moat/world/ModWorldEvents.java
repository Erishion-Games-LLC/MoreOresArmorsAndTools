package com.erishiongames.moat.world;

import com.erishiongames.moat.MoatMain;
import com.erishiongames.moat.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MoatMain.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent biomeLoadingEvent){
        ModOreGeneration.generateOres(biomeLoadingEvent);
    }
}
