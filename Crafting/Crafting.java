package Mod.enchantedwoodlands.Crafting;

import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting {

	public static void Init(){
			
		
		GameRegistry.addRecipe(new ItemStack(Blocks.woodlandBench), new Object[] {"##", "##", '#', Blocks.woodlandPlank});
		GameRegistry.addRecipe(new ItemStack(Blocks.woodlandPlank, 4, 0), new Object[] {"#", '#', new ItemStack(Blocks.woodlandLog)});
		GameRegistry.addRecipe(new ItemStack(Blocks.woodlandPlank, 4, 1), new Object[] {"#", '#', new ItemStack(Blocks.exepditeLog)});
	
}
}