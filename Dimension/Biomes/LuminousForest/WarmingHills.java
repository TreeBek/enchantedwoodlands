package Mod.enchantedwoodlands.Dimension.Biomes.LuminousForest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;

import java.util.List;
import java.util.Random;

import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenExepditeTree;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenTestTree;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenWoodlandLongGrass;
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

public class WarmingHills extends BiomeGenBase
{
private WorldGenerator WorldGenTestTrees;
private WorldGenerator UnDeadworldGeneratorBigTree;
public final Material blockMaterial;
private WorldGenerator WorldGenExepditeTrees;
private WorldGenerator WorldGenWoodlandLongGrass;

public WarmingHills(int par1)
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
this.theBiomeDecorator.treesPerChunk = 1;
this.topBlock = ((byte)Blocks.warmingGrass.blockID);
this.fillerBlock = ((byte)Block.dirt.blockID);
this.setBiomeName("Warming Hills");


/** this changes the water colour, its set to red now but google the java colours **/
this.waterColorMultiplier = 0xDF3A01;}

}

