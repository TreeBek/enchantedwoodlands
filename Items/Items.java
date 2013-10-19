package Mod.enchantedwoodlands.Items;


import cpw.mods.fml.common.registry.LanguageRegistry;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;


import net.minecraftforge.common.EnumHelper;
import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Config.LuminousForestConfig;
import Mod.enchantedwoodlands.Config.MainConfig;
import Mod.enchantedwoodlands.Items.LuminousForest.ItemKeyOne;
import Mod.enchantedwoodlands.Items.LuminousForest.ItemPortalPlacer;
import Mod.enchantedwoodlands.Items.LuminousForest.ItemSwiftFruit;
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
	public static Item mythicalStick;
	
	public static Item woodlandSpade;
	public static Item woodlandPickaxe;
	public static Item woodlandHoe;
	public static Item woodlandAxe;
	public static Item woodlandSword;
	
	public static void Init(){
	{
	
		//Item Properties
		woodlandLighter = new ItemWoodlandsLighter(MainConfig.woodlandLighterID).setUnlocalizedName("woodlandLighter");
			LanguageRegistry.addName(woodlandLighter, "Woodland Lighter");
		
		mythicalPortalPlacer = new ItemPortalPlacer(LuminousForestConfig.mythicalPortalPlacerID).setUnlocalizedName("mythicalPortalPlacer");
		 	LanguageRegistry.addName(mythicalPortalPlacer, "Mythical Portal Placer");
        
		teleWand = new ItemTeleWand(MainConfig.teleWandID).setUnlocalizedName("teleWand");
			LanguageRegistry.addName(teleWand, "Tele-Wand");
			
		swiftnessFruit = new ItemSwiftFruit(LuminousForestConfig.swiftnessFruitID, 3, 0.1F, false).setUnlocalizedName("swiftnessFruit");
			LanguageRegistry.addName(swiftnessFruit, "Swiftness Fruit");
			
		tier1Key = new ItemKeyOne(LuminousForestConfig.tier1KeyID).setUnlocalizedName("tier1Key");
			LanguageRegistry.addName(tier1Key, "Tier-1 Key");
			
		mythicalStick = new ItemBasicItem(LuminousForestConfig.mythicalStickID).setUnlocalizedName("mythicalStick");
			LanguageRegistry.addName(mythicalStick, "Mythical Stick");
			
		//woodlandSpade = new ItemWoodlandSword(Common.).setUnlocalizedName("woodlandSpade");
			//LanguageRegistry.addName(woodlandSpade, "woodlandSpade");
			
		
		
	   }
	}
	
}

