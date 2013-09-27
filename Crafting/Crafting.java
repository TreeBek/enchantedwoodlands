package Mod.enchantedwoodlands.Crafting;

import Mod.enchantedwoodlands.Blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting {

	public static void Init(){
		GameRegistry.addRecipe(new ItemStack(Blocks.woodlandBench), new Object[] {"##", "##", '#', Blocks.woodlandPlank});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.woodlandPlank, 4), new Object[] {Blocks.starDustLog});
		
		}
	
}
