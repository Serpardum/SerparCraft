package com.serpardia.serparcraft.item;

import com.serpardia.serparcraft.creativetab.CreativeTabSC;
import com.serpardia.serparcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by serpardum on 10/10/14.
 */
public class ItemSC extends Item {

    public ItemSC() {

        super();
        this.setCreativeTab( CreativeTabSC.SC_TAB );
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName( super.getUnlocalizedName() ) );
    }

    @Override
    public String getUnlocalizedName( ItemStack itemStack ) {
        return String.format( "item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName( super.getUnlocalizedName()) );

    }

    protected String getUnwrappedUnlocalizedName( String unlocalizedName ) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1 );
    }

    @Override
    @SideOnly( Side.CLIENT )
    public void registerIcons( IIconRegister iconRegister ) {

        itemIcon = iconRegister.registerIcon( this.getUnlocalizedName().substring( this.getUnlocalizedName().indexOf(".") + 1 ));

    }
}
