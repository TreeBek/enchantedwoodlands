package Mod.enchantedwoodlands.Proxy;

import net.minecraftforge.client.MinecraftForgeClient;
import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Client.TileEntityRedCrystalRenderer;
import Mod.enchantedwoodlands.Client.TileEntityTier1EnchanterRenderer;
import Mod.enchantedwoodlands.Client.TileEntityTier1KeyRenderer;
import Mod.enchantedwoodlands.Client.ItemRender.ItemRedCrystalRenderer;
import Mod.enchantedwoodlands.Client.ItemRender.ItemTier1EnchanterRenderer;
import Mod.enchantedwoodlands.Client.ItemRender.ItemTier1KeyRenderer;
import Mod.enchantedwoodlands.Client.TitleEntity.TileEntityRedCrystal;
import Mod.enchantedwoodlands.Client.TitleEntity.TileEntityTier1Enchanter;
import Mod.enchantedwoodlands.Client.TitleEntity.TileEntityTier1Key;
import cpw.mods.fml.client.registry.ClientRegistry;

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
