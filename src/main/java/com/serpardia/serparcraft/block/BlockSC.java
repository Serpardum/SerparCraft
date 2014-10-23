package com.serpardia.serparcraft.block;

import com.serpardia.serparcraft.creativetab.CreativeTabSC;
import com.serpardia.serparcraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by serpardum on 10/10/14.
 */
public class BlockSC extends Block {

    public BlockSC( Material material ) {

        super( material );
        this.setCreativeTab( CreativeTabSC.SC_TAB );
    }

    public BlockSC() {
        this( Material.rock );
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName( super.getUnlocalizedName()));
    }

    @Override
    @SideOnly( Side.CLIENT )
    public void registerBlockIcons( IIconRegister iconRegister ) {
        blockIcon = iconRegister.registerIcon( String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName( String unlocalizedName ) {
        return unlocalizedName.substring( unlocalizedName.indexOf(".") + 1);
    }



}
