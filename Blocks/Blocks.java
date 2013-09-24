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
	public static final Block starDustGrass = new BlockTutorialGrass(225).setHardness(0.6F).setUnlocalizedName("starDustGrass");
	public static Block mythicalStone;
	public static final Block starDustFlower = new BlockStarDustFlower(207).setUnlocalizedName("starDustFlower");
	public static final Block starDustLog = new BlockstarDustLog(208).setUnlocalizedName("starDustLog");
	public static final Block starDustLeaf = new BlockMythicalLeaf(209).setUnlocalizedName("starDustLeaf");
	public static final Block starDustSapling = new BlockStarDustSapling(210, 0).setUnlocalizedName("starDustSapling");
	public static Block woodlandGrass; 
	
	public static void Init(){
	{
		//Block Properties
				woodlandFire = (BlockWoodlandFire) new BlockWoodlandFire(4000).setUnlocalizedName("woodlandFire");
					GameRegistry.registerBlock(woodlandFire, Common.modid + woodlandFire.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandFire, "Woodland Fire");
						
				woodlandPortal = (BlockWoodlandPortal) new BlockWoodlandPortal(4002).setUnlocalizedName("woodlandPortal");
					GameRegistry.registerBlock(woodlandPortal, Common.modid + woodlandPortal.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandPortal, "Woodland Portal");
					
				woodlandGrass = new BlockWoodlandGrass(211).setHardness(0.7F).setUnlocalizedName("woodlandGrass");
					GameRegistry.registerBlock(woodlandGrass, Common.modid + woodlandGrass.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(woodlandGrass, "Woodland Grass");
							MinecraftForge.setBlockHarvestLevel(woodlandGrass, "shovel", 0);
							
				mythicalStone = new BlockMythicalStone(206, Material.rock).setHardness(2.5F).setUnlocalizedName("mythicalStone");
					GameRegistry.registerBlock(mythicalStone, Common.modid + mythicalStone.getUnlocalizedName().substring(5));
						LanguageRegistry.addName(mythicalStone, "Mythical Stone");
				
		//Adding the Blocks
				GameRegistry.registerBlock(starDustGrass, Common.modid + starDustGrass.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustLog, Common.modid + starDustLog.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustLeaf, Common.modid + starDustLeaf.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustSapling, Common.modid + starDustSapling.getUnlocalizedName().substring(5));
				GameRegistry.registerBlock(starDustFlower, Common.modid + starDustFlower.getUnlocalizedName().substring(5));
				
		//Block Name
				LanguageRegistry.addName(starDustGrass, "StarDust Grass");
				LanguageRegistry.addName(starDustLog, "StarDust Log");
				LanguageRegistry.addName(starDustLeaf, "StarDust Leaf");
				LanguageRegistry.addName(starDustSapling, "StarDust Sapling");
				LanguageRegistry.addName(starDustFlower, "StarDust Flower");
		
		
	
		}
	}
}
