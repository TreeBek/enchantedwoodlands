package Mod.enchantedwoodlands.Items;


import cpw.mods.fml.common.registry.LanguageRegistry;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;


import net.minecraftforge.common.EnumHelper;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	//ITEMS
	public static Item woodlandLighter;
	public static Item mythicalPortalPlacer;
	public static Item teleWand;
	public static Item swiftnessFruit;
	public static Item tier1Key;
	
	public static void Init(){
	{
	
		//Item Properties
		woodlandLighter = new ItemWoodlandsLighter(7000).setUnlocalizedName("woodlandLighter");
			LanguageRegistry.addName(woodlandLighter, "Woodland Lighter");
		
		mythicalPortalPlacer = new ItemPortalPlacer(7001).setUnlocalizedName("mythicalPortalPlacer");
		 	LanguageRegistry.addName(mythicalPortalPlacer, "Mythical Portal Placer");
        
		teleWand = new ItemTeleWand(7002).setUnlocalizedName("teleWand");
			LanguageRegistry.addName(teleWand, "Tele-Wand");
			
		swiftnessFruit = new ItemSwiftFruit(7003, 3, 0.1F, false).setUnlocalizedName("swiftnessFruit");
			LanguageRegistry.addName(swiftnessFruit, "Swiftness Fruit");
			
		tier1Key = new ItemKeyOne(7004).setUnlocalizedName("tier1Key");
			LanguageRegistry.addName(tier1Key, "Tier-1 Key");
		
	   }
	}
	
}

