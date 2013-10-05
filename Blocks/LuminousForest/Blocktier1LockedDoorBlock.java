package Mod.enchantedwoodlands.Blocks.LuminousForest;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Blocks.BlockBaseBlock;
import Mod.enchantedwoodlands.Items.Items;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Blocktier1LockedDoorBlock extends BlockBaseBlock{

	public Blocktier1LockedDoorBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		
	}
	
	@SideOnly(Side.CLIENT)
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
		if(par5EntityPlayer.getCurrentEquippedItem() == null || par5EntityPlayer.getCurrentEquippedItem().itemID != Items.tier1Key.itemID){	
			par5EntityPlayer.addChatMessage("[This Requires a Tier 1 key to Unlock]");
			return true;
		}else
			return false;
    }

}
