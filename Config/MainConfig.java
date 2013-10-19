package Mod.enchantedwoodlands.Config;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraftforge.common.Configuration;

public class MainConfig {

	//Block ID
		public static int woodlandFireID;
		public static int woodlandBenchID;
		public static int woodlandPlankID;
		
	//Item ID
		public static int woodlandLighterID;
		public static int teleWandID;
	
	public static void PreInit(FMLPreInitializationEvent event){
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	     config.load();
	     //Blocks
	     woodlandFireID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Fire", 4000).getInt();
	     woodlandBenchID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Bench", 4012).getInt();
	     woodlandPlankID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Planks", 4013).getInt();
	     
	     //Items
	     woodlandLighterID = config.get(Configuration.CATEGORY_ITEM, "Woodland Lighter", 7000).getInt();
	     teleWandID = config.get(Configuration.CATEGORY_ITEM, "Tele-Wand", 7002).getInt();
	     
	     config.save();
		
	}
	
}
