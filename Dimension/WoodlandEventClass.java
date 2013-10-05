package Mod.enchantedwoodlands.Dimension;

import java.awt.Event;
import java.util.ArrayList;
import java.util.Random;

import Mod.enchantedwoodlands.Blocks.LuminousForest.BlockWoodlandSapling;
import Mod.enchantedwoodlands.Blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;
public class WoodlandEventClass
{
	private int BlockID;
	/** Used to make the sapling grow the tree **/
	@ForgeSubscribe
	public void bonemealUsed(BonemealEvent event)
	{
		if(event.world.getBlockId(event.X, event.Y, event.Z) == Blocks.woodlandSapling.blockID)
		{
			((BlockWoodlandSapling)Blocks.woodlandSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
		}
	}
}