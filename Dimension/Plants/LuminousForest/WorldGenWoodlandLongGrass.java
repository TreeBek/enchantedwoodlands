package Mod.enchantedwoodlands.Dimension.Plants.LuminousForest;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import Mod.enchantedwoodlands.Blocks.Blocks;

public class WorldGenWoodlandLongGrass extends WorldGenerator
{
	/** The ID of the plant block used in this plant generator. */
	private int plantBlockId = Blocks.woodlandLongGrass.blockID;
	private int plantBlockMeta;

	public WorldGenWoodlandLongGrass(int par1, int meta)
	{
		plantBlockId = par1;
		plantBlockMeta = meta;
	}


	@Override
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
	{
		for (int l = 0; l < 64;)
		{
			int i1 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
			int j1 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
			int k1 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

			if (par1World.isAirBlock(i1, j1, k1) && (!par1World.provider.hasNoSky || j1 < 127) && Blocks.woodlandLongGrass.canBlockStay(par1World, i1, j1, k1))
			{
				par1World.setBlock(i1, j1, k1, plantBlockId, plantBlockMeta, 2);
			}
			if(par1World.getBlockId(par3, par4, par5) == Blocks.woodlandLongGrass.blockID && par1World.isAirBlock(par3, par4 + 1, par5))
            {
                    par1World.setBlock(par3, par4 + 1, par5, Blocks.woodlandLongGrass.blockID);
		}

		return true;
	}
		return true;
}
}