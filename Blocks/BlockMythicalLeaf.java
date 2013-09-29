package Mod.enchantedwoodlands.Blocks;

import java.util.Random;

import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Dimension.Structure.CastleTier1Crystal;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
public class BlockMythicalLeaf extends Block
{
public BlockMythicalLeaf(int par1)
{
super(par1, Material.leaves);
this.setCreativeTab(Common.EnchWoodRPGTab);
this.setStepSound(soundGrassFootstep);
this.setHardness(0.2F);
this.setTickRandomly(true);
}



public boolean isOpaqueCube()
{
return false;
}
/**
* Returns the ID of the items to drop on destruction.
*/
public int idDropped(int par1, Random par2Random, int par3)
{
return this.blockID;
}
/**
* Returns the quantity of items to drop on block destruction.
*/
public int quantityDropped(Random par1Random)
{
return 0;
}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
    this.blockIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
}
@Override
public void beginLeavesDecay(World world, int x, int y, int z)
{
        world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
}

}