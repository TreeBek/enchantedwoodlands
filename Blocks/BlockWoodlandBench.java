package Mod.enchantedwoodlands.Blocks;

import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWoodlandBench extends Block
{
@SideOnly(Side.CLIENT)
private Icon workbenchIconTop;
@SideOnly(Side.CLIENT)
private Icon workbenchIconFront;
@SideOnly(Side.CLIENT)
private Icon workbenchIconBottom;

public BlockWoodlandBench(int i)
{
         super(i, Material.ground);
         this.setCreativeTab(Common.EnchWoodRPGTab);
         this.setStepSound(soundWoodFootstep);
}

@SideOnly(Side.CLIENT)
public Icon getIcon(int par1, int par2)
{
         return par1 == 1 ? this.workbenchIconTop : (par1 == 0 ? this.workbenchIconBottom : (par1 != 2 && par1 != 4 ? this.blockIcon : this.workbenchIconFront));
}

@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister par1IconRegister)
{
this.blockIcon = par1IconRegister.registerIcon("EnchantedWoodlands:bench_side");
this.workbenchIconTop = par1IconRegister.registerIcon("EnchantedWoodlands:bench_top");
this.workbenchIconFront = par1IconRegister.registerIcon("EnchantedWoodlands:bench_side");
this.workbenchIconBottom = par1IconRegister.registerIcon("EnchantedWoodlands:bench_bottom");
}

public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9)
{
         if (!player.isSneaking())
{
player.openGui(Common.instance, 0, var1, var2, var3, var4);
return true;
}
else
{
return false;
}
}
}