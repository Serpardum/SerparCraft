package com.serpardia.serparcraft.init;

import com.serpardia.serparcraft.reference.Reference;
import com.serpardia.serparcraft.block.BlockFlag;
import com.serpardia.serparcraft.block.BlockSC;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by serpardum on 10/10/14.
 */
@GameRegistry.ObjectHolder( Reference.MOD_ID )
public class ModBlocks {

    public static final BlockSC flag = new BlockFlag();

    public static void init() {
        GameRegistry.registerBlock( flag, "flag" );

    }
}
