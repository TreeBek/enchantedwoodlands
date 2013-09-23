package Mod.enchantedwoodlands.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBaseBlock extends Block{

	public BlockBaseBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(Common.EnchantedWoodslandsTab);
	}
@SideOnly(Side.CLIENT)
    
    
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}
