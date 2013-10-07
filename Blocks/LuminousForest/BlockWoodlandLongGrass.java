package Mod.enchantedwoodlands.Blocks.LuminousForest;

import static net.minecraftforge.common.EnumPlantType.Plains;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockTallGrass;
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


public class BlockWoodlandLongGrass extends BlockFlower
{
	public BlockWoodlandLongGrass(int id)
	{
		super(id);
		this.setStepSound(soundGrassFootstep);
		this.setCreativeTab(Common.EnchWoodRPGTab);
		float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
	}
	
	@Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
        return par1 == Blocks.woodlandGrass.blockID;
    }
	@Override
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return -1;
    }
    @Override
    public EnumPlantType getPlantType(World world, int x, int y, int z)
    {
        if (blockID == Blocks.woodlandLongGrass.blockID) return Plains;
        return Plains;
    }

    @Override
    public void registerIcons(IconRegister reg)
    {
    	this.blockIcon = reg.registerIcon("EnchantedWoodlands:woodlandLongGrass");
    }
}