package Mod.enchantedwoodlands.Gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import Mod.enchantedwoodlands.Common.Common;

public class WoodlandBenchGui extends GuiContainer
{
public WoodlandBenchGui(InventoryPlayer inventoryplayer, World world, int i, int j, int k)
{
         super(new ContainerWoodlandBench(inventoryplayer, world, i, j, k));
}

public void onGuiClosed()
{
         super.onGuiClosed();
}

protected void drawGuiContainerForegroundLayer(int par1, int par2)
{
         //this.fontRenderer.drawString(StatCollector.translateToLocal("\u00a7dEnchanted"), 120, 5, 0x404040);
         //this.fontRenderer.drawString(StatCollector.translateToLocal("\u00a75Woodlands"), 116, 20, 0x404040);
         this.fontRenderer.drawString(StatCollector.translateToLocal("\u00a7fInventory"),100, this.ySize - 70 - 14, 0x404040);
}

protected void drawGuiContainerBackgroundLayer(float f, int i, int j)
{
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.mc.renderEngine.bindTexture(new ResourceLocation(Common.modid.toLowerCase(), "textures/gui/woodlandBench.png"));
         int l = (width - xSize) / 2;
         int i1 = (height - ySize) / 2;
         drawTexturedModalRect(l, i1, 0, 0, xSize, ySize);
}
}