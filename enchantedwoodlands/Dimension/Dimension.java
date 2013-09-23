package Mod.enchantedwoodlands.Dimension;

import Mod.enchantedwoodlands.Dimension.Biomes.Biome1;
import Mod.enchantedwoodlands.Dimension.Biomes.Biome2;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

public class Dimension {

	public static int DimID = 5;
	
	public static final BiomeGenBase Biome1 = new Biome1(27); 
	public static final BiomeGenBase Biome2 = new Biome2(28);
	
	public static void Init(){
		
		DimensionManager.registerProviderType(DimID, WorldProviderDim.class, true);
		DimensionManager.registerDimension(DimID, DimID);
	}
	
}
