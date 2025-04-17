package com.pengemod.pncponderaddon;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import net.neoforged.fml.common.Mod;
import net.createmod.ponder.NeoForgePonder;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;

@Mod(pncponderaddon.MODID)
public class pncponderaddon {
    public static final String MODID = "pncponderaddon";
    private static final Logger LOGGER = LogUtils.getLogger();

    public pncponderaddon(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Ponder for PNC has been initialized");
        try {
            Class.forName("com.pengemod.pncponderaddon.PncPonderPlugin");
            LOGGER.info("[PONDER DEBUG] Successfully found PncPonderPlugin via Class.forName!");
        } catch (ClassNotFoundException e) {
            LOGGER.error("[PONDER DEBUG] PncPonderPlugin class not found! This means it's not compiled or not in the jar.");
            e.printStackTrace();
        }

        
        
    }
    
}


