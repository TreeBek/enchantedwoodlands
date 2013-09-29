package Mod.enchantedwoodlands.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class Blocktier1LockedDoorBlock extends BlockBaseBlock{

	public Blocktier1LockedDoorBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		
	}
	
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
		par5EntityPlayer.addChatMessage("This Requires a Tier 1 key to open");
        return true;
    }

}
