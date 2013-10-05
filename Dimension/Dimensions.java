package Mod.enchantedwoodlands.Dimension;

import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Dimension.Biomes.OreWorldGen;
import Mod.enchantedwoodlands.Dimension.Generation.LuminousForest.LuminousWorldProviderDim;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenExepditeTree;
import Mod.enchantedwoodlands.Dimension.Plants.LuminousForest.WorldGenTestTree;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

public class Dimensions {
	
	/** Biome's **/
	public static final BiomeGenBase WoodlandForest = new Mod.enchantedwoodlands.Dimension.Biomes.LuminousForest.WoodlandForest(25);
	public static final BiomeGenBase StarDustFields = new Mod.enchantedwoodlands.Dimension.Biomes.LuminousForest.StarDustFields(26);
	
	public static void Init(){
		
		//Dimension Registry
		DimensionManager.registerProviderType(Common.DimID, LuminousWorldProviderDim.class, true);
		GameRegistry.registerWorldGenerator(new OreWorldGen());
		GameRegistry.registerWorldGenerator(new WorldGenTestTree(false));
		GameRegistry.registerWorldGenerator(new WorldGenExepditeTree(false));
		DimensionManager.registerDimension(Common.DimID, Common.DimID);

		MinecraftForge.EVENT_BUS.register(new WoodlandEventClass());
	
	}
	
}
