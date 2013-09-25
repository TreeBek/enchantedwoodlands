package Mod.enchantedwoodlands.Blocks;

import static net.minecraftforge.common.EnumPlantType.Plains;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
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
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;


public class BlockStarDustFlower extends BlockFlower
{

	public BlockStarDustFlower(int id)
	{
		super(id);
		this.setCreativeTab(Common.EnchWoodRPGTab);
	}
	
	@Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Blocks.starDustGrass.blockID || par1 == Blocks.woodlandGrass.blockID;
    }
	
    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        if (blockID == Blocks.starDustFlower.blockID) return Plains;
        return Plains;
    }
    
    @Override
    public void registerIcons(IconRegister reg)
    {
    	this.blockIcon = reg.registerIcon("EnchantedWoodlands:starDustFlower");
    }
}