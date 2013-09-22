package Mod.enchantedwoodlands.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Dimension.Plants.BlockTestSapling;
import mythicalRPG.BlockMythicalPortal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {
	
	//Block Declaration
	public static Block mythicalStone;
	public static BlockWoodlandsPortal woodlandsPortal;
	public static BlockWoodlandsFire woodlandsFire;
	public static Block testSapling;
	
	public static void Init(){
		
		mythicalStone = new BlockBaseBlock(Common.mythicalStoneID, Material.rock).setHardness(5.0f).setUnlocalizedName("mythicalStone");
			GameRegistry.registerBlock(mythicalStone, Common.modid + mythicalStone.getUnlocalizedName().substring(5));
				LanguageRegistry.addName(mythicalStone, "Mythical Stone");
				
		woodlandsPortal = (BlockWoodlandsPortal) new BlockWoodlandsPortal(Common.woodlandsPortalID).setUnlocalizedName("woodlandsPortal");
			GameRegistry.registerBlock(woodlandsPortal, Common.modid + woodlandsPortal.getUnlocalizedName().substring(5));
				LanguageRegistry.addName(woodlandsPortal, "Woodlands Portal");
				
		woodlandsFire = (BlockWoodlandsFire) new BlockWoodlandsFire(Common.woodlandsFireID).setUnlocalizedName("woodlandsFire_0");
			GameRegistry.registerBlock(woodlandsFire, Common.modid + woodlandsFire.getUnlocalizedName().substring(5));
				LanguageRegistry.addName(woodlandsFire, "Woodlands Fire");	
				
		testSapling = new BlockTestSapling(Common.testSaplingID, 0).setUnlocalizedName("testSapling");
			GameRegistry.registerBlock(testSapling, Common.modid + testSapling.getUnlocalizedName().substring(5));
				LanguageRegistry.addName(testSapling, "Test Sapling");
	}

}
