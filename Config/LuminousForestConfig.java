package Mod.enchantedwoodlands.Config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class LuminousForestConfig {

	//Item ID
		public static int mythicalPortalPlacerID;
		public static int swiftnessFruitID;
		public static int tier1KeyID;
		public static int mythicalStickID;
		public static int spawnEggID;
	
	//Block ID
		public static int woodlandPortalID;
		public static int starDustGrassID;
		public static int mythicalStoneID;
		public static int starDustFlowerID;
		public static int starDustLogID;
		public static int starDustLeafID;
		public static int starDustSaplingID;
		public static int woodlandGrassID;
		public static int exepditeLogID;
		public static int exepditeLeafID;
		public static int swiftnessFruitBlockID;
		public static int redCrystalID;
		public static int mythicalBricksID;
		public static int tier1KeyBlockID;
		public static int tier1LockedDoorBlockID;
		public static int tier1EnchanterID;
		public static int woodlandLongGrassID;
		public static int warmingGrassID;
		
		
public static void PreInit(FMLPreInitializationEvent event){
	Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    config.load();
    //Blocks
    woodlandPortalID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Portal", 4001).getInt();
    starDustGrassID = config.getTerrainBlock("Enchanted Woodlands Generation", "StarDust Grass", 200,null).getInt();
    mythicalStoneID = config.get(Configuration.CATEGORY_BLOCK, "Mythical Stone", 4003).getInt();
    starDustFlowerID = config.get(Configuration.CATEGORY_BLOCK,"StarDust Flower", 4004).getInt();
    starDustLogID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Log", 4005).getInt();
    starDustLeafID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Leaves", 4006).getInt();
    starDustSaplingID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Sapling", 4007).getInt();
    woodlandGrassID = config.getTerrainBlock("Enchanted Woodlands Generation", "Woodland Grass", 201,null).getInt();
    exepditeLogID = config.get(Configuration.CATEGORY_BLOCK, "Exepdite Log", 4009).getInt();
    exepditeLeafID = config.get(Configuration.CATEGORY_BLOCK, "Exepdite Leaves", 4010).getInt();
    swiftnessFruitBlockID = config.get(Configuration.CATEGORY_BLOCK, "Swiftness FruitBlock", 4011).getInt();
    redCrystalID = config.get(Configuration.CATEGORY_BLOCK, "Red Crystal", 4014).getInt();
    mythicalBricksID = config.get(Configuration.CATEGORY_BLOCK, "Mythical Bricks", 4015).getInt();
    tier1KeyBlockID = config.get(Configuration.CATEGORY_BLOCK, "Tier1 KeyBlock", 4016).getInt();
    tier1EnchanterID = config.get(Configuration.CATEGORY_BLOCK, "Tier1 Enchanter", 4019).getInt();
    tier1LockedDoorBlockID = config.get("AVOID CHANGING", "Tier1 LockedDoor", 4017,"But if you do make sure there is always an ID open one above this one's!").getInt();
    woodlandLongGrassID = config.get(Configuration.CATEGORY_BLOCK, "Woodland LongGrass", 4020).getInt();
    warmingGrassID = config.getTerrainBlock("Enchanted Woodlands Generation", "Warming Grass", 202,null).getInt();
    
    //Items
    mythicalPortalPlacerID = config.get(Configuration.CATEGORY_ITEM, "Mythical PortalPlacer", 7001).getInt();
    swiftnessFruitID = config.get(Configuration.CATEGORY_ITEM, "Swiftness Fruit", 7003).getInt();
    tier1KeyID = config.get(Configuration.CATEGORY_ITEM, "Tier 1 Dungeon", 7004).getInt();
    mythicalStickID = config.get(Configuration.CATEGORY_ITEM, "Mythical Stick", 7005).getInt();
    spawnEggID = config.get(Configuration.CATEGORY_ITEM, "Spawn Egg", 7006).getInt();
    config.save();
	}
	
}
