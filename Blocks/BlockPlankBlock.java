package Mod.enchantedwoodlands.Blocks;

import java.util.List;

import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	
	public class BlockPlankBlock extends Block
	{
		
	       public BlockPlankBlock(int id, Material par2Material)
	       {
	             super(id, par2Material);
	             this.setCreativeTab(Common.EnchWoodRPGTab);
	       }
	      
	       @SideOnly(Side.CLIENT)
	       private Icon[] icons;
	      
	       @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister par1IconRegister)
	    {
	             icons = new Icon[2];
	            
	             for(int i = 0; i < icons.length; i++)
	             {
	                    icons[i] = par1IconRegister.registerIcon(Common.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
	             }
	    }
	       public int damageDropped(int par1){return par1 & icons.length;}
	       @SideOnly(Side.CLIENT)
	       public Icon getIcon(int par1, int par2)
	       {
	             return icons[par2];
	       }
	      
	       @SideOnly(Side.CLIENT)
	    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
	    {
	        for (int var4 = 0; var4 < 2; ++var4)
	        {
	            par3List.add(new ItemStack(par1, 1, var4));
	        }
	    }
	       public int idPicked(World par1World, int par2, int par3, int par4)
	       {
	           return blockID;
	       }
	   	
	}

