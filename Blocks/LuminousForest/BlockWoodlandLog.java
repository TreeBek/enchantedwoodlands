package Mod.enchantedwoodlands.Blocks.LuminousForest;

import java.util.List;
import java.util.Random;

import Mod.enchantedwoodlands.Common.Common;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
public class BlockWoodlandLog extends Block
{
    /** The type of tree this block came from. */
	public static final String[] Fer_woodType = new String[] {"fer"};
    public static final String[] woodType = new String[] {"fer"};
    
    @SideOnly(Side.CLIENT)
    public BlockWoodlandLog(int par1, Material mat)
    {
        super(par1, mat);
        this.setCreativeTab(Common.EnchWoodRPGTab);
        this.setStepSound(soundWoodFootstep);
    }



        public boolean canSustainLeaves(World world, int x, int y, int z)
        {
            return true;
        }
    @Override
        public boolean isWood(World world, int x, int y, int z)
        {
            return true;
        }
    
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int side, int par2)
    {
       if(side == 0){
            return bottom;
        }
        if(side == 1){
            return top;
        }
        if(side == 2){
            return side1;
        }
        if(side == 3){
            return side2;
        }
        if(side == 4){
            return side3;
        }
        if(side == 5){
            return side4;
        }
        else{
            return side2;
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1;
    }

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
       
    }

    private Icon top, bottom, side1, side2, side3, side4;
    private Icon [][] iconBuffer;
    
    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */ 
    public void registerIcons(IconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_side");
        this.top = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_top");
        this.bottom = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_top");
        this.side1 = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_side");
        this.side2 = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_side");
        this.side3 = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_side");
        this.side4 = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5) + "_side");
        
    }
    
    public Icon getBlockTextureFromSideAndMetadata(int side, int meta){
        if(side == 0){
            return bottom;
        }
        if(side == 1){
            return top;
        }
        if(side == 2){
            return side1;
        }
        if(side == 3){
            return side2;
        }
        if(side == 4){
            return side3;
        }
        if(side == 5){
            return side4;
        }
        else{
            return side2;
        }
        
    }
}