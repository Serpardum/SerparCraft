package com.serpardia.serparcraft.init;

import com.serpardia.serparcraft.item.ItemMapleLeaf;
import com.serpardia.serparcraft.item.ItemSC;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by serpardum on 10/10/14.
 */
public class ModItems {

    public static final ItemSC mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem( mapleLeaf, "mapleLeaf" );
    }
}
