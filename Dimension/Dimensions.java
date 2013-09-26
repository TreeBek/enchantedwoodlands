package Mod.enchantedwoodlands.Dimension;

import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Dimension.Biomes.OreWorldGen;
import Mod.enchantedwoodlands.Dimension.Generation.WorldProviderDim;
import Mod.enchantedwoodlands.Dimension.Plants.WorldGenExepditeTree;
import Mod.enchantedwoodlands.Dimension.Plants.WorldGenTestTree;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

public class Dimensions {
	
	/** Biome's **/
	public static final BiomeGenBase Biome1 = new Mod.enchantedwoodlands.Dimension.Biomes.Biome1(25);
	public static final BiomeGenBase Biome2 = new Mod.enchantedwoodlands.Dimension.Biomes.Biome2(26);
	
	public static void Init(){
		
		//Dimension Registry
		DimensionManager.registerProviderType(Common.DimID, WorldProviderDim.class, true);
		GameRegistry.registerWorldGenerator(new OreWorldGen());
		GameRegistry.registerWorldGenerator(new WorldGenTestTree(false));
		GameRegistry.registerWorldGenerator(new WorldGenExepditeTree(false));
		//DimensionManager.registerProviderType(DimID, WorldProviderBiomes.class, true);
		DimensionManager.registerDimension(Common.DimID, Common.DimID);

		MinecraftForge.EVENT_BUS.register(new MythicalEventClass());
	
	}
	
}
