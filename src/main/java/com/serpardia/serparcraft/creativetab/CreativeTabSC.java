package com.serpardia.serparcraft.creativetab;

import com.serpardia.serparcraft.init.ModItems;
import com.serpardia.serparcraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by serpardum on 10/10/14.
 */
public class CreativeTabSC {

    public static final CreativeTabs SC_TAB = new CreativeTabs( Reference.MOD_ID.toLowerCase() ) {

        @Override
        public Item getTabIconItem() {
            return ModItems.mapleLeaf;
        }


    };
}
