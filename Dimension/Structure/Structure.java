package Mod.enchantedwoodlands.Dimension.Structure;

import cpw.mods.fml.common.registry.GameRegistry;

public class Structure {
	
	public static void Init(){
	
		GameRegistry.registerWorldGenerator(new WorldGeneratorCastleTier1Crystal());
		
		}
}

