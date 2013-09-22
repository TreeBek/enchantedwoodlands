package Mod.enchantedwoodlands.Items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import Mod.enchantedwoodlands.Common.Common;
import mythicalRPG.ItemTutorialFlintAndSteel;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;

public class Items {

		public static Item teleWand;
		public static Item woodlandsLighter;
	
	public static void Init(){
		
		teleWand = new ItemTeleWand(Common.teleWandID).setUnlocalizedName("teleWand");
			LanguageRegistry.addName(teleWand, "Tele-Wand");
		
		woodlandsLighter = new ItemWoodlandsLighter(Common.woodlandsLighterID).setUnlocalizedName("woodlandsLighter");
			LanguageRegistry.addName(woodlandsLighter, "Woodlands Lighter");
		
		}
	}

