package Mod.enchantedwoodlands.Dimension.Biomes;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;

import java.util.List;
import java.util.Random;

import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Dimension.Plants.WorldGenTestTree;
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
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;

public class Biome2 extends BiomeGenBase
{
private WorldGenerator UnDeadworldGeneratorBigTree;
public final Material blockMaterial;
private WorldGenTestTree WorldGenTestTrees;

public Biome2(int par1)
{
super(par1);
this.blockMaterial = Material.water;
this.minHeight = 0.1F;
this.maxHeight = 0.6F;

this.rainfall = 100.0f;
this.spawnableMonsterList.clear();
this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 1, 500, 1000));
this.spawnableCreatureList.clear();
this.spawnableWaterCreatureList.clear();
this.worldGeneratorSwamp = new WorldGenSwamp();
this.theBiomeDecorator.treesPerChunk = 40;
this.topBlock = ((byte)Blocks.woodlandGrass.blockID);
this.fillerBlock = ((byte)Block.dirt.blockID);
this.WorldGenTestTrees = new WorldGenTestTree(false);
this.setBiomeName("Biome2");


/** this changes the water colour, its set to red now but google the java colours **/
this.waterColorMultiplier = 0x00D1FF;}

}
