package Mod.enchantedwoodlands.Gui;

import Mod.enchantedwoodlands.Blocks.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandlerEnchantedWoodlands implements IGuiHandler
{
@Override
public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
{
TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
switch(id)
{
case 0: return id == 0 && world.getBlockId(x, y, z) == Blocks.woodlandBench.blockID ? new ContainerWoodlandBench(player.inventory, world, x, y, z) : null;
}
return null;
}
@Override
public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
{
TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
switch(id)
{
case 0: return id == 0 && world.getBlockId(x, y, z) == Blocks.woodlandBench.blockID ? new WoodlandBenchGui(player.inventory, world, x, y, z) : null;
}
return null;
}
}