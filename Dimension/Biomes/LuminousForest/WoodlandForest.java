package Mod.enchantedwoodlands.Dimension.Biomes.LuminousForest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenExepditeTree;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenTestForestTree;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenTestHugeTree;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenTestTree;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenWoodlandLongGrass;
import Mod.enchantedwoodlands.Entity.EntityGoblin;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenSwamp;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WoodlandForest extends BiomeGenBase
{
public final Material blockMaterial;

private WorldGenerator WorldGenTestTrees;
private WorldGenerator WorldGenTestForestTrees;
private WorldGenerator WorldGenTestHugeTrees;
private WorldGenerator WorldGenExepditeTree;
private WorldGenerator WorldGenWoodlandLongGrass;
public WoodlandForest(int par1)
{
super(par1);
this.blockMaterial = Material.water;
this.minHeight = 0.1F;
this.maxHeight = 0.6F;
this.rainfall = 100.0f;
this.spawnableMonsterList.clear();
this.spawnableCreatureList.clear();
this.spawnableWaterCreatureList.clear();
this.theBiomeDecorator.grassPerChunk = 400;
this.worldGeneratorSwamp = new WorldGenSwamp();
this.theBiomeDecorator.treesPerChunk = 80;
this.topBlock = ((byte)Blocks.starDustGrass.blockID);
this.fillerBlock = ((byte)Block.dirt.blockID);
this.WorldGenTestTrees = new WorldGenTestTree(false);
this.WorldGenTestForestTrees = new WorldGenTestForestTree(false);
this.WorldGenExepditeTree = new WorldGenExepditeTree(false);
this.WorldGenWoodlandLongGrass = new WorldGenWoodlandLongGrass(Blocks.woodlandLongGrass.blockID, 0);
//this.WorldGenTestHugeTrees = new WorldGenTestHugeTree(false, 8, Blocks.woodlandLog.blockID, Blocks.woodlandLeaf.blockID);
this.setBiomeName("StarDust Fields");


/** this changes the water colour, its set to red now but google the java colours **/
this.waterColorMultiplier = 0x00FF33;}

public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
{
return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(80) == 0 ? this.WorldGenTestTrees : this.worldGeneratorTrees));
}

}