package Mod.enchantedwoodlands.Proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraftforge.client.MinecraftForgeClient;
import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Render.ItemRedCrystalRenderer;
import Mod.enchantedwoodlands.Render.TileEntityRedCrystal;
import Mod.enchantedwoodlands.Render.TileEntityRedCrystalRenderer;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenderThings() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRedCrystal.class, new TileEntityRedCrystalRenderer());
		MinecraftForgeClient.registerItemRenderer(Blocks.redCrystal.blockID, new ItemRedCrystalRenderer());
	}
	
}
