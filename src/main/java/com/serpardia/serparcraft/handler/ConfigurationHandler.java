package com.serpardia.serparcraft.handler;

import com.serpardia.serparcraft.reference.Reference;
import com.serpardia.serparcraft.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by serpardum on 10/9/14.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

         if ( configuration == null ) {
             configuration = new Configuration( configFile );
             loadConfiguration();
         }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event) {

        if (event.modID.equalsIgnoreCase( Reference.MOD_ID )) {

            LogHelper.info("Loading Configuration.");
            loadConfiguration();
        }
        else {

            LogHelper.info("Other MOD_ID:" + Reference.MOD_ID );
        }

    }

    private static void loadConfiguration() {

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

         if ( configuration.hasChanged()) {
            configuration.save();
        }

    }

}
























