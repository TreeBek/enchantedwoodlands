package Mod.enchantedwoodlands.Dimension.Structure;

import Mod.enchantedwoodlands.Dimension.Structure.LuminousForest.WorldGeneratorCastleTier1Crystal;
import cpw.mods.fml.common.registry.GameRegistry;

public class Structure {
	
	public static void Init(){
	
		GameRegistry.registerWorldGenerator(new WorldGeneratorCastleTier1Crystal());
		
		}
}

