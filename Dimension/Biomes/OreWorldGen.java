package Mod.enchantedwoodlands.Dimension.Biomes;

import java.util.Random;

import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Dimension.Plants.WorldGenMythicFlowers;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreWorldGen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world,
            IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.dimensionId)
        {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
                break;

            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;

            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 2:
            this.generateTutorial(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    public void generateNether(World world, Random rand, int chunkX, int chunkZ)
    {
    	for (int i = 0; i < 14; i++) {

    		int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(60);
            int randPosZ = chunkZ + rand.nextInt(16);

    	}
    	for (int i = 0; i < 13; i++) {

    		int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(45);
            int randPosZ = chunkZ + rand.nextInt(16);
    	}
    }

    public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
       // 30 veins of ore per chunk
        for (int i = 0; i < 40; i++)
        {
            //16x16 area up to y = 64
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(50);
            int randPosZ = chunkZ + rand.nextInt(16);
            	
            (new WorldGenMinable(Block.glowStone.blockID, 10)).generate(world, rand,
        			randPosX, randPosY, randPosZ);
        }
        for (int i = 0; i < 15; i++)
        {
            //16x16 area up to y = 64
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(20);
            int randPosZ = chunkZ + rand.nextInt(16);
            // 10 blocks per vein
        }
        for (int i = 0; i < 10; i++)
        {
            //16x16 area up to y = 64
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(15);
            int randPosZ = chunkZ + rand.nextInt(16);
            // 10 blocks per vein
        }
    }

    private void generateEnd(World world, Random rand, int chunkX, int chunkZ) {

    	for (int i = 0; i < 20; i++) {

    		int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(55);
            int randPosZ = chunkZ + rand.nextInt(16);

    	}
    }
    
    private void generateTutorial(World world, Random random, int chunkX, int chunkZ)
    {
    // the 4 below is for how rare it will be
    for(int i = 0; i < 4; i++)
    {
    //this below just tells me if its generating or not
    int xCoord = chunkX + random.nextInt(16);
    int yCoord = random.nextInt(20);// the 128 is the max height the ore/block will generate
    int zCoord = chunkZ + random.nextInt(16);
    //The 20 on the line below is how meny will generate per vain, as an example i think diamond is like 2 or 4
    //and the Block.blockIron is what it will spawn
    (new WorldGenMinable(Block.glowStone.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
    }
    for(int k = 0; k < 4; k++); //Creates a new integer, 'k', which is between 0 and whatever we used for the rarity.
    
    BiomeGenBase biomegenbase = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);

if(biomegenbase instanceof Biome1)
    {
     for(int k = 0; k < 75; k++)
     {
          int randPosX = chunkX + random.nextInt(16);
          int randPosY = random.nextInt(220);
          int randPosZ = chunkZ + random.nextInt(16);
          (new WorldGenMythicFlowers(Blocks.starDustFlower.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
     		}
    	}
    }
    
}
