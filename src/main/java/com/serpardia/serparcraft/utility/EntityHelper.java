package com.serpardia.serparcraft.utility;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.ArrayList;

/**
 * Created by serpardum on 10/11/14.
 */
public class EntityHelper {


    public static ArrayList<EntityPlayer> getAllPlayersListInRange( Entity entity, double range ) {

        return getAllPlayersListInRange( entity.worldObj, entity.posX, entity.posY, entity.posZ, range );

    }

    public static ArrayList< EntityPlayer > getAllPlayersListInRange( World world, double posX, double posY, double posZ, double range ) {

        ArrayList<EntityPlayer> playerList = new ArrayList<EntityPlayer>();

        for ( Object entityPlayerObj : world.playerEntities ) {

            if ( entityPlayerObj instanceof EntityPlayer ) {

                EntityPlayer entityPlayer = (EntityPlayer) entityPlayerObj;

                if (!entityPlayer.capabilities.disableDamage) {
                    double distanceSq = entityPlayer.getDistanceSq(posX, posY, posZ);
                    if (distanceSq <= range * range) {
                        playerList.add(entityPlayer);
                    }
                }
            }

        }

        return playerList;
    }

}
