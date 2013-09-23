package Mod.enchantedwoodlands.Blocks;

import static net.minecraftforge.common.EnumPlantType.Plains;

import java.util.Random;

import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;


public class BlockStarDustFlower extends BlockFlower
{

	public BlockStarDustFlower(int id)
	{
		super(id);
		this.setCreativeTab(Common.EnchWoodRPGTab);
		this.setStepSound(soundGrassFootstep);
	}
	
	public void upadteTick(World world, int i, int j, int k, Random random)
	{
		if(random.nextInt(100)==0)
		{
			int l = (i + random.nextInt(3)) - 1; 
			int il = (j + random.nextInt(2)) - random.nextInt(2);
			int jl = (k + random.nextInt(3)) - 1;
			if(world.isAirBlock(l, il, jl) && canBlockStay(world, l, il, jl))
				{
					world.notifyBlockChange(l, il, jl, blockID);
				}
			}
		}
		
		
	
	
	@Override
    protected boolean canThisPlantGrowOnThisBlockID(int par1)
    {
		return par1 == Block.grass.blockID || par1 == Block.dirt.blockID || par1 == Block.tilledField.blockID || par1 == Blocks.starDustGrass.blockID; 
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
    	this.blockIcon = reg.registerIcon("MythicalRPG:starDustFlower");
    }
    
    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z)
    {	
    	if(world.getBlockId(x, y+1, z) == Blocks.starDustGrass.blockID)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}