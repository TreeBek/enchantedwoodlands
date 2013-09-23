package Mod.enchantedwoodlands.Items;


import cpw.mods.fml.common.registry.LanguageRegistry;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;


import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	//ITEMS
	public static Item woodlandLighter;
	public static Item mythicalPortalPlacer;
	public static Item teleWand;
	
	public static void Init(){
	{
	
		//Item Properties
		 woodlandLighter = new ItemWoodlandsLighter(Common.woodlandLighterID).setUnlocalizedName("woodlandLighter");
			LanguageRegistry.addName( woodlandLighter, "Woodland Lighter");
		
		 mythicalPortalPlacer = new ItemPortalPlacer(Common.mythicalPortalPlacerID).setUnlocalizedName("mythicalPortalPlacer");
		 	LanguageRegistry.addName(mythicalPortalPlacer, "Mythical Portal Placer");
        
		 teleWand = new ItemTeleWand(Common.teleWandID).setUnlocalizedName("teleWand");
			LanguageRegistry.addName(teleWand, "Tele-Wand");
		
	   }
	}
	
}

