package Mod.enchantedwoodlands.Blocks.LuminousForest;

import java.util.List;
import java.util.Random;

import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Items.Items;
import Mod.enchantedwoodlands.Render.TitleEntity.TileEntityTier1Key;
import cpw.mods.fml.common.Mod.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockTier1KeyCrystal extends BlockContainer {

public BlockTier1KeyCrystal(int id, int texture, Material material) {
super(id, material);
this.setCreativeTab(Common.EnchWoodRPGTab);
this.setBlockBounds(0.2F, 0.0F, 0.4F, 0.8F, 0.1F, 0.6F);
}

public int idDropped(int par1, Random par2Random, int par3)
{
return Items.tier1Key.itemID;
}


/**
* The type of render function that is called for this block
*/
public int getRenderType()
{
return -2;
}

/**
* Is this block (a) opaque and (B) a full 1m cube? This determines whether or not to render the shared face of two
* adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
*/
public boolean isOpaqueCube()
{
return false;
}

/**
* If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
*/
public boolean renderAsNormalBlock()
{
return false;
}

public void onBlockPlacedBy(World world, int i, int j, int k, EntityLiving entityliving)
{
int rotation = MathHelper.floor_double((double)((entityliving.rotationYaw * 4F) / 360F) + 2.5D) & 3;
world.setBlock(i, j, k, rotation - 1);
}

public TileEntity createNewTileEntity(World par1World)
{
return new TileEntityTier1Key();
}
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
    this.blockIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
}

}