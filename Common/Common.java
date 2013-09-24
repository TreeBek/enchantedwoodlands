package Mod.enchantedwoodlands.Common;


import Mod.enchantedwoodlands.Blocks.BlockMythicalLeaf;
import Mod.enchantedwoodlands.Blocks.BlockMythicalStone;
import Mod.enchantedwoodlands.Blocks.BlockStarDustFlower;
import Mod.enchantedwoodlands.Blocks.BlockStarDustSapling;
import Mod.enchantedwoodlands.Blocks.BlockTutorialGrass;
import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Blocks.BlockstarDustLog;
import Mod.enchantedwoodlands.Dimension.Dimensions;
import Mod.enchantedwoodlands.Dimension.MythicalEventClass;
import Mod.enchantedwoodlands.Dimension.Biomes.OreWorldGen;
import Mod.enchantedwoodlands.Items.ItemPortalPlacer;
import Mod.enchantedwoodlands.Items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockFire;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
@Mod(modid="EnchantedWoodlands", name="EnchantedWoodlands", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Common
{

public static final String modid = "EnchantedWoodlands";	
//Creative Tabs
public static CreativeTabs EnchWoodRPGTab = new EnchWoodRPGTab(CreativeTabs.getNextID(), "EnchantedWoodlands");
		
		
/////////////////////////////////////////
//
//ITEM AND BLOCK CONFIG
//
/////////////////////////////////////////
//Block ID
	public static int woodlandFireID;
	public static int woodlandPortalID;
	public static int starDustGrassID;
	public static int mythicalStoneID;
	public static int starDustFlowerID;
	public static int starDustLogID;
	public static int starDustLeafID;
	public static int starDustSaplingID;
	public static int woodlandGrassID;
	
//Item ID
	public static int woodlandLighterID;
	public static int mythicalPortalPlacerID;
	public static int teleWandID;

 
 public void preInit(FMLPreInitializationEvent event){
	 Configuration config = new Configuration(event.getSuggestedConfigurationFile());
     config.load();
     //Blocks
     woodlandFireID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Fire", 4000).getInt();
     woodlandPortalID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Portal", 4001).getInt();
     starDustGrassID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Grass", 205).getInt();
     mythicalStoneID = config.getTerrainBlock("Enchanted", "Mythical Stone", 206,"Enchanted Woodlands").getInt();
     starDustFlowerID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Flower", 207).getInt();
     starDustLogID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Log", 208).getInt();
     starDustLeafID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Leaf", 209).getInt();
     starDustSaplingID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Sapling", 210).getInt();
     woodlandGrassID = config.getTerrainBlock("Enchanted", "Woodline Grass", 211,"Enchanted Woodlands").getInt();
    
     //Items
     woodlandLighterID = config.get(Configuration.CATEGORY_ITEM, "Woodland Lighter", 7000).getInt();
     mythicalPortalPlacerID = config.get(Configuration.CATEGORY_ITEM, "Mythical PortalPlacer", 7001).getInt();
     teleWandID = config.get(Configuration.CATEGORY_ITEM, "Tele-Wand", 7002).getInt();
 }


 /** Dimension **/
public static int DimID = 2;

@EventHandler
public static void Init(FMLInitializationEvent event)
{
	Blocks.Init();
	Dimensions.Init();
	Items.Init();
}





}
