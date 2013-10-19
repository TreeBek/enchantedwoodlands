package Mod.enchantedwoodlands.Blocks;

import vanillaplus.ItemRubyBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockLuminousPortal;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockRedCrystal;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockStarDustFlower;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockStarDustGrass;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockSwiftnessFruit;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockTier1Enchanter;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockTier1KeyCrystal;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockWoodlandGrass;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockWoodlandLeaf;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockWoodlandLog;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockWoodlandLongGrass;
import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockWoodlandSapling;
import Mod.enchantedwoodlands.Blocks.LuminousForest.Blocktier1LockedDoorBlock;
import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Config.LuminousForestConfig;
import Mod.enchantedwoodlands.Config.MainConfig;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	//BLOCKS
	public static BlockWoodlandFire woodlandFire;
	public static BlockLuminousPortal luminousPortal;
	public static Block starDustGrass;
	public static Block mythicalStone;
	public static final Block starDustFlower = new BlockStarDustFlower(LuminousForestConfig.starDustFlowerID).setUnlocalizedName("starDustFlower");
	public static final Block woodlandLog = new BlockWoodlandLog(LuminousForestConfig.starDustLogID, Material.wood).setHardness(2.3F).setUnlocalizedName("woodlandLog");
	public static final Block woodlandLeaf = new BlockWoodlandLeaf(LuminousForestConfig.starDustLeafID, Material.leaves, true).setHardness(0.5f).setUnlocalizedName("woodlandLeaf");
	public static final Block woodlandSapling = new BlockWoodlandSapling(LuminousForestConfig.starDustSaplingID, 0).setUnlocalizedName("woodlandSapling");
	public static Block woodlandGrass; 
	public static Block exepditeLog;
	public static final Block exepditeLeaf = new BlockExepditeLeaf(LuminousForestConfig.exepditeLeafID, Material.leaves, true).setHardness(0.5f).setUnlocalizedName("exepditeLeaf");
	public static Block swiftnessFruit;
	public static Block woodlandBench;
	public static Block woodlandPlank;
	public static Block redCrystal;
	public static Block mythicalBrick;
	public static Block tier1KeyBlock;
	public static Block lockedDoorBlock;
	public static Block tier1LockedDoorBlock;
	public static Block tier1Enchanter;
	public static Block woodlandLongGrass;
	public static Block warmingGrass;
	
	public static void Init(){
	{
		//Block Properties
				woodlandFire = (BlockWoodlandFire) new BlockWoodlandFire(MainConfig.woodlandFireID).setUnlocalizedName("woodlandFire");
					GameRegistry.registerBlock(woodlandFire, Common.modid + woodlandFire.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandFire, "Woodland Fire");
						
				luminousPortal = (BlockLuminousPortal) new BlockLuminousPortal(LuminousForestConfig.woodlandPortalID).setUnlocalizedName("woodlandPortal");
					GameRegistry.registerBlock(luminousPortal, Common.modid + luminousPortal.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(luminousPortal, "Luminous Portal");
					
				woodlandGrass = new BlockWoodlandGrass(LuminousForestConfig.woodlandGrassID).setHardness(0.7F).setUnlocalizedName("woodlandGrass");
					GameRegistry.registerBlock(woodlandGrass, Common.modid + woodlandGrass.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandGrass, "Woodland Grass");
							
				mythicalStone = new BlockBaseBlock(LuminousForestConfig.mythicalStoneID, Material.rock).setHardness(2.5F).setUnlocalizedName("mythicalStone");
					GameRegistry.registerBlock(mythicalStone, Common.modid + mythicalStone.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(mythicalStone, "Mythical Stone");
						
				exepditeLog = new BlockWoodlandLog(LuminousForestConfig.exepditeLogID, Material.wood).setHardness(2.0F).setUnlocalizedName("exepditeLog");
					GameRegistry.registerBlock(exepditeLog, Common.modid + exepditeLog.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(exepditeLog, "Exepdite Log");
						
				swiftnessFruit = new BlockSwiftnessFruit(LuminousForestConfig.swiftnessFruitBlockID, Material.plants).setHardness(0.2F).setUnlocalizedName("swiftnessFruit");
					GameRegistry.registerBlock(swiftnessFruit, Common.modid + swiftnessFruit.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(swiftnessFruit, "Swiftness Fruit Block");
						
				woodlandBench = new BlockWoodlandBench(MainConfig.woodlandBenchID).setHardness(2.5f).setUnlocalizedName("woodlandBench");
					GameRegistry.registerBlock(woodlandBench, Common.modid + woodlandBench.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandBench, "Woodland Bench");
						
				woodlandPlank = new BlockPlankBlock(MainConfig.woodlandPlankID, Material.wood).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setUnlocalizedName("plank");
			
						
				redCrystal = new BlockRedCrystal(LuminousForestConfig.redCrystalID, 1, Material.glass).setStepSound(Block.soundGlassFootstep).setHardness(5.0F).setUnlocalizedName("redCrystalParticles");
					GameRegistry.registerBlock(redCrystal, Common.modid + redCrystal.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(redCrystal, "Red Crystal");
						
				mythicalBrick = new BlockBaseBlock(LuminousForestConfig.mythicalBricksID, Material.rock).setHardness(2.5F).setUnlocalizedName("mythicalBrick");
					GameRegistry.registerBlock(mythicalBrick, Common.modid + mythicalBrick.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(mythicalBrick, "Mythical Bricks");
						
				tier1KeyBlock = new BlockTier1KeyCrystal(LuminousForestConfig.tier1KeyBlockID, 1, Material.wood).setStepSound(Block.soundMetalFootstep).setHardness(0.1F).setUnlocalizedName("tier1KeyParticles");
					GameRegistry.registerBlock(tier1KeyBlock, Common.modid + tier1KeyBlock.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(tier1KeyBlock, "Tier1 KeyBlock");
						
				lockedDoorBlock = new BlockBaseBlock(LuminousForestConfig.tier1LockedDoorBlockID + 1, Material.wood).setStepSound(Block.soundWoodFootstep).setBlockUnbreakable().setUnlocalizedName("lockedDoor").setResistance(6000000.0F);
					GameRegistry.registerBlock(lockedDoorBlock, Common.modid + lockedDoorBlock.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(lockedDoorBlock, "Locked DoorBlock");
							
				tier1LockedDoorBlock = new Blocktier1LockedDoorBlock(LuminousForestConfig.tier1LockedDoorBlockID, Material.wood).setStepSound(Block.soundWoodFootstep).setBlockUnbreakable().setUnlocalizedName("tier1LockedDoor").setResistance(6000000.0F);
					GameRegistry.registerBlock(tier1LockedDoorBlock, Common.modid + tier1LockedDoorBlock.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(tier1LockedDoorBlock, "Tier1 Locked-DoorBlock");
								
						
				tier1Enchanter = new BlockTier1Enchanter(LuminousForestConfig.tier1EnchanterID, 1, Material.wood).setStepSound(Block.soundWoodFootstep).setBlockUnbreakable().setUnlocalizedName("tier1EnchanterParticles");
					GameRegistry.registerBlock(tier1Enchanter, Common.modid + tier1Enchanter.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(tier1Enchanter, "Tier1 Enchanter");
						
				starDustGrass = new BlockStarDustGrass(LuminousForestConfig.starDustGrassID).setHardness(0.6F).setUnlocalizedName("starDustGrass");
					GameRegistry.registerBlock(starDustGrass, Common.modid + starDustGrass.getUnlocalizedName().substring(5));	
						LanguageRegistry.addName(starDustGrass, "StarDust Grass");
						
				woodlandLongGrass = new BlockWoodlandLongGrass(LuminousForestConfig.woodlandLongGrassID).setHardness(0.0F).setUnlocalizedName("woodlandLongGrass");
					GameRegistry.registerBlock(woodlandLongGrass, Common.modid + woodlandLongGrass.getUnlocalizedName().substring(5));	
						LanguageRegistry.addName(woodlandLongGrass, "Woodland LongGrass");
						
				warmingGrass = new BlockWoodlandGrass(LuminousForestConfig.warmingGrassID).setHardness(0.7F).setUnlocalizedName("warmingGrass");
					GameRegistry.registerBlock(warmingGrass, Common.modid + warmingGrass.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(warmingGrass, "Warming Grass");
					
		//Adding the Blocks
				GameRegistry.registerBlock(woodlandLog, Common.modid + woodlandLog.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(woodlandLeaf, Common.modid + woodlandLeaf.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(woodlandSapling, Common.modid + woodlandSapling.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustFlower, Common.modid + starDustFlower.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(exepditeLeaf, Common.modid + exepditeLeaf.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(woodlandPlank, ItemPlankBlock.class, Common.modid + (woodlandPlank.getUnlocalizedName().substring(5)));

				
		//Block Name
				LanguageRegistry.addName(woodlandLog, "Woodland Log");
				LanguageRegistry.addName(woodlandLeaf, "Woodland Leaves");
				LanguageRegistry.addName(woodlandSapling, "Woodland Sapling");
				LanguageRegistry.addName(starDustFlower, "StarDust Flower");
				LanguageRegistry.addName(exepditeLog, "Exepdite Log");
				LanguageRegistry.addName(exepditeLeaf, "Exepdite Leaves");
				LanguageRegistry.addName(new ItemStack(woodlandPlank, 1, 0), "Woodland Plank");
		        LanguageRegistry.addName(new ItemStack(woodlandPlank, 1, 1), "Expedite Plank");
		
	
		}
	}
}
