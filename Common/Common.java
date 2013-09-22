package Mod.enchantedwoodlands.Common;

import Mod.enchantedwoodlands.Blocks.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Common.modid, name = "Enchanted Woodlands Mod", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Common {
	
	public static final String modid = "EnchantedWoodlands";
	
	@EventHandler
	public static void Init(FMLInitializationEvent event){
		
		Block.Init();
		
	}

}
