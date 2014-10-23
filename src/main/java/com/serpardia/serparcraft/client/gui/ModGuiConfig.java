package com.serpardia.serparcraft.client.gui;

import com.serpardia.serparcraft.SerparCraft;
import com.serpardia.serparcraft.handler.ConfigurationHandler;
import com.serpardia.serparcraft.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by serpardum on 10/10/14.
 */
public class ModGuiConfig extends GuiConfig {

    public ModGuiConfig( GuiScreen guiScreen ) {

        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }


}











































