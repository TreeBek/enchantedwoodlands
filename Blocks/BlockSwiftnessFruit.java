package Mod.enchantedwoodlands.Blocks;

import static net.minecraftforge.common.EnumPlantType.Plains;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockWeb;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;


public class BlockSwiftnessFruit extends Block
{


	public BlockSwiftnessFruit(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setStepSound(soundGrassFootstep);
	}

	 public boolean isOpaqueCube()
	    {
	        return false;
	    }
	 public int getRenderType()
	    {
	        return 1;
	    }
	 public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	    {
	        return null;
	    }
	 public boolean renderAsNormalBlock()
	    {
	        return false;
	    }

	
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return Items.swiftnessFruit.itemID;
    }
	
	@Override
	 protected boolean canSilkHarvest()
	    {
	        return true;
	    }
    
    @Override
    public void registerIcons(IconRegister reg)
    {
    	this.blockIcon = reg.registerIcon("EnchantedWoodlands:swiftnessFruit");
    }
}