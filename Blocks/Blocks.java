package Mod.enchantedwoodlands.Blocks;

import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	//BLOCKS
	public static BlockWoodlandFire woodlandFire;
	public static BlockWoodlandPortal woodlandPortal;
	public static final Block starDustGrass = new BlockTutorialGrass(Common.starDustGrassID).setHardness(0.6F).setUnlocalizedName("starDustGrass");
	public static Block mythicalStone;
	public static final Block starDustFlower = new BlockStarDustFlower(Common.starDustFlowerID).setUnlocalizedName("starDustFlower");
	public static final Block starDustLog = new BlockstarDustLog(Common.starDustLogID).setHardness(2.3F).setUnlocalizedName("woodlandLog");
	public static final Block starDustLeaf = new BlockMythicalLeaf(Common.starDustLeafID).setUnlocalizedName("woodlandLeaf");
	public static final Block starDustSapling = new BlockStarDustSapling(Common.starDustSaplingID, 0).setUnlocalizedName("starDustSapling");
	public static Block woodlandGrass; 
	public static Block exepditeLog;
	public static final Block exepditeLeaf = new BlockMythicalLeaf(Common.exepditeLeafID).setUnlocalizedName("exepditeLeaf");
	public static Block swiftnessFruit;
	public static Block woodlandBench;
	public static Block woodlandPlank;
	public static Block redCrystal;
	public static Block mythicalBrick;
	public static Block tier1KeyBlock;
	public static Block lockedDoorBlock;
	public static Block tier1LockedDoorBlock;
	
	public static void Init(){
	{
		//Block Properties
				woodlandFire = (BlockWoodlandFire) new BlockWoodlandFire(Common.woodlandFireID).setUnlocalizedName("woodlandFire");
					GameRegistry.registerBlock(woodlandFire, Common.modid + woodlandFire.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandFire, "Woodland Fire");
						
				woodlandPortal = (BlockWoodlandPortal) new BlockWoodlandPortal(Common.woodlandPortalID).setUnlocalizedName("woodlandPortal");
					GameRegistry.registerBlock(woodlandPortal, Common.modid + woodlandPortal.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandPortal, "Woodland Portal");
					
				woodlandGrass = new BlockWoodlandGrass(Common.woodlandGrassID).setHardness(0.7F).setUnlocalizedName("woodlandGrass");
					GameRegistry.registerBlock(woodlandGrass, Common.modid + woodlandGrass.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandGrass, "Woodland Grass");
							MinecraftForge.setBlockHarvestLevel(woodlandGrass, "shovel", 0);
							
				mythicalStone = new BlockBaseBlock(Common.mythicalStoneID, Material.rock).setHardness(2.5F).setUnlocalizedName("mythicalStone");
					GameRegistry.registerBlock(mythicalStone, Common.modid + mythicalStone.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(mythicalStone, "Mythical Stone");
						
				exepditeLog = new BlockstarDustLog(Common.exepditeLogID).setHardness(2.0F).setUnlocalizedName("exepditeLog");
					GameRegistry.registerBlock(exepditeLog, Common.modid + exepditeLog.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(exepditeLog, "Exepdite Log");
						
				swiftnessFruit = new BlockSwiftnessFruit(Common.swiftnessFruitBlockID, Material.plants).setHardness(0.2F).setUnlocalizedName("swiftnessFruit");
					GameRegistry.registerBlock(swiftnessFruit, Common.modid + swiftnessFruit.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(swiftnessFruit, "Swiftness Fruit Block");
						
				woodlandBench = new BlockWoodlandBench(Common.woodlandBenchID).setHardness(2.5f).setUnlocalizedName("woodlandBench");
					GameRegistry.registerBlock(woodlandBench, Common.modid + woodlandBench.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandBench, "Woodland Bench");
						
				woodlandPlank = new BlockBaseBlock(Common.woodlandPlankID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setUnlocalizedName("bench_bottom");
					GameRegistry.registerBlock(woodlandPlank, Common.modid + woodlandPlank.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandPlank, "Woodland Plank");
						
				redCrystal = new BlockRedCrystal(Common.redCrystalID, 1, Material.glass).setStepSound(Block.soundGlassFootstep).setHardness(5.0F).setUnlocalizedName("redCrystalParticles");
					GameRegistry.registerBlock(redCrystal, Common.modid + redCrystal.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(redCrystal, "Red Crystal");
						
				mythicalBrick = new BlockBaseBlock(Common.mythicalBricksID, Material.rock).setHardness(2.5F).setUnlocalizedName("mythicalBrick");
					GameRegistry.registerBlock(mythicalBrick, Common.modid + mythicalBrick.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(mythicalBrick, "Mythical Bricks");
						
				tier1KeyBlock = new BlockTier1KeyCrystal(Common.tier1KeyBlockID, 1, Material.wood).setStepSound(Block.soundMetalFootstep).setHardness(0.1F).setUnlocalizedName("tier1KeyParticles");
					GameRegistry.registerBlock(tier1KeyBlock, Common.modid + tier1KeyBlock.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(tier1KeyBlock, "Tier1 KeyBlock");
						
				lockedDoorBlock = new BlockBaseBlock(Common.tier1LockedDoorBlockID + 1, Material.wood).setStepSound(Block.soundWoodFootstep).setBlockUnbreakable().setUnlocalizedName("lockedDoor");
					GameRegistry.registerBlock(lockedDoorBlock, Common.modid + lockedDoorBlock.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(lockedDoorBlock, "Locked DoorBlock");
							
				tier1LockedDoorBlock = new BlockBaseBlock(Common.tier1LockedDoorBlockID, Material.wood).setStepSound(Block.soundWoodFootstep).setBlockUnbreakable().setUnlocalizedName("tier1LockedDoor");
					GameRegistry.registerBlock(tier1LockedDoorBlock, Common.modid + tier1LockedDoorBlock.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(tier1LockedDoorBlock, "Tier1 Locked-DoorBlock");
						
		//Adding the Blocks
				GameRegistry.registerBlock(starDustGrass, Common.modid + starDustGrass.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustLog, Common.modid + starDustLog.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustLeaf, Common.modid + starDustLeaf.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustSapling, Common.modid + starDustSapling.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustFlower, Common.modid + starDustFlower.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(exepditeLeaf, Common.modid + exepditeLeaf.getUnlocalizedName().substring(5));
				
		//Block Name
				LanguageRegistry.addName(starDustGrass, "StarDust Grass");
				LanguageRegistry.addName(starDustLog, "StarDust Log");
				LanguageRegistry.addName(starDustLeaf, "StarDust Leaf");
				LanguageRegistry.addName(starDustSapling, "StarDust Sapling");
				LanguageRegistry.addName(starDustFlower, "StarDust Flower");
				LanguageRegistry.addName(exepditeLog, "Exepdite Log");
		
	
		}
	}
}
