package com.serpardia.serparcraft;

import com.serpardia.serparcraft.client.handler.KeyInputEventHandler;
import com.serpardia.serparcraft.handler.ConfigurationHandler;
import com.serpardia.serparcraft.init.ModBlocks;
import com.serpardia.serparcraft.init.ModItems;
import com.serpardia.serparcraft.init.Recipes;
import com.serpardia.serparcraft.proxy.IProxy;
import com.serpardia.serparcraft.reference.Reference;
import com.serpardia.serparcraft.server.handler.EntityJoinWorldEventHandler;
import com.serpardia.serparcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS )
public class SerparCraft {

    @Mod.Instance(Reference.MOD_ID)
    public static SerparCraft instance;

    @SidedProxy( clientSide = "com.serpardia.serparcraft.proxy.ClientProxy",
                 serverSide = "com.serpardia.serparcraft.proxy.ServerProxy" )
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit( FMLPreInitializationEvent event ) {

        ConfigurationHandler.init( event.getSuggestedConfigurationFile() );
        FMLCommonHandler.instance().bus().register( new ConfigurationHandler() );

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete.");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event ) {

        FMLCommonHandler.instance().bus().register( new KeyInputEventHandler() );
        MinecraftForge.EVENT_BUS.register(new EntityJoinWorldEventHandler());

        Recipes.init();
        LogHelper.info("Initialization Complete.");
    }

    @Mod.EventHandler
    public void postInit( FMLPostInitializationEvent event ) {

        LogHelper.info("Post Initialization Complete.");
    }

}

