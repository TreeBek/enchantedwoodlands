package Mod.enchantedwoodlands.Common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import Mod.enchantedwoodlands.Blocks.*;
import Mod.enchantedwoodlands.Dimension.Dimension;
import Mod.enchantedwoodlands.Items.Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Common.modid, name = "Enchanted Woodlands Mod", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Common {
	
	
	public static CreativeTabs EnchantedWoodslandsTab = new EnchantWoodsTab(CreativeTabs.getNextID(), "Enchanted Woodlands");
	public static final String modid = "EnchantedWoodlands";
	
		//Block ID
	   public static int mythicalStoneID;
	   public static int woodlandsPortalID;
	   public static int woodlandsFireID;
	   public static int testSaplingID;
	   public static int woodlandGrassID;
	
	   //Item ID
	   public static int teleWandID;
	   public static int woodlandsLighterID;

		@EventHandler
		public static void ConfigInit(FMLPreInitializationEvent event){
			
			Configuration config = new Configuration(event.getSuggestedConfigurationFile());
			config.load();
			
			mythicalStoneID = config.get(Configuration.CATEGORY_BLOCK, "Mythical Stone", 2500).getInt();
			woodlandsPortalID = config.get(Configuration.CATEGORY_BLOCK, "Enchanted-Woodlands Portal", 2501).getInt();
			woodlandsFireID = config.get(Configuration.CATEGORY_BLOCK, "Enchanted-Woodlands Fire", 2502).getInt();
			testSaplingID = config.get(Configuration.CATEGORY_BLOCK, "Test Sapling", 2503).getInt();
			woodlandGrassID = config.get(Configuration.CATEGORY_BLOCK, "woodland Grass", 2504).getInt();
			
			teleWandID = config.get(Configuration.CATEGORY_ITEM, "Tele-Wand", 7002).getInt();
			woodlandsLighterID = config.get(Configuration.CATEGORY_ITEM, "Woodlands Lighter", 7003).getInt();
			config.save();
			
		}
		
		@EventHandler
		public static void Init(FMLInitializationEvent event){
		
			Blocks.Init();
			Dimension.Init();
			Items.Init();
		
		}
		
  
}
