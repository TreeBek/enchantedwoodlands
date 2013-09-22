package Mod.enchantedwoodlands.Config;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {
	
	public static int testBlockID;
	
	@EventHandler
	public static void ConfigInit(FMLPreInitializationEvent event){
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		
		testBlockID = config.get(Configuration.CATEGORY_BLOCK, "TEST BLOCK", 2500).getInt();
		
	}
	
}
