package com.serpardia.serparcraft.server.handler;

// EntityEvent.EntityConstructing

import com.serpardia.serparcraft.utility.LogHelper;
import com.serpardia.serparcraft.utility.EntityHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import java.util.ArrayList;

/**
 * Created by serpardum on 10/11/14.
 */

public class EntityJoinWorldEventHandler {

    @SubscribeEvent
    public void handleEntityJoinWorldEvent( EntityJoinWorldEvent event ) {

        LogHelper.info( "Entity joined world:" + event.toString() );

        LogHelper.info( event.entity.getClass().getSimpleName() );
        if ( event.entity instanceof EntityMob ) {

            ArrayList<EntityPlayer> closePlayers = EntityHelper.getAllPlayersListInRange(event.entity, 128.0f);

            for ( EntityPlayer entityPlayer : closePlayers ) {

                LogHelper.info( entityPlayer.getDisplayName() );
            }

            ((EntityMob) event.entity).setHealth(((EntityMob) event.entity).getHealth() * 0.250f);

        }

    }
}
