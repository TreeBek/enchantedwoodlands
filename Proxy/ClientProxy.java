package Mod.enchantedwoodlands.Proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Render.ItemRedCrystalRenderer;
import Mod.enchantedwoodlands.Render.ItemTier1EnchanterRenderer;
import Mod.enchantedwoodlands.Render.ItemTier1KeyRenderer;
import Mod.enchantedwoodlands.Render.TileEntityRedCrystal;
import Mod.enchantedwoodlands.Render.TileEntityRedCrystalRenderer;
import Mod.enchantedwoodlands.Render.TileEntityTier1Enchanter;
import Mod.enchantedwoodlands.Render.TileEntityTier1EnchanterRenderer;
import Mod.enchantedwoodlands.Render.TileEntityTier1Key;
import Mod.enchantedwoodlands.Render.TileEntityTier1KeyRenderer;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenderThings() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRedCrystal.class, new TileEntityRedCrystalRenderer());
		MinecraftForgeClient.registerItemRenderer(Blocks.redCrystal.blockID, new ItemRedCrystalRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTier1Key.class, new TileEntityTier1KeyRenderer());
		MinecraftForgeClient.registerItemRenderer(Blocks.tier1KeyBlock.blockID, new ItemTier1KeyRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTier1Enchanter.class, new TileEntityTier1EnchanterRenderer());
		MinecraftForgeClient.registerItemRenderer(Blocks.tier1Enchanter.blockID, new ItemTier1EnchanterRenderer());
	}
	
	
}
