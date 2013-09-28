package Mod.enchantedwoodlands.Dimension.Structure;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorTestCastle implements IWorldGenerator
{
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
{
  switch (world.provider.dimensionId)
  {
  case -1: generateNether(world, random, chunkX*16, chunkZ*16);
  case 0: if (random.nextFloat() < 0.25F)
		generateSurface(world, random, chunkX * 16, chunkZ * 16);
  }
}
private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
{
  testCastle tree = new testCastle();
  for(int x = 0;x<1;x++)
  {
   int i = chunkX + rand.nextInt(16);
   int k = chunkZ + rand.nextInt(16);
   int j = world.getHeightValue(i, k);
   tree.generate(world, rand, i, j, k);
  }
}
private void generateNether(World world, Random random, int blockX, int blockZ)
{
}
}