package Mod.enchantedwoodlands.Client.ItemRender;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import Mod.enchantedwoodlands.Client.Models.ModelRedCrystal;
import Mod.enchantedwoodlands.Client.TitleEntity.TileEntityRedCrystal;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemRedCrystalRenderer implements IItemRenderer {

private ModelRedCrystal RedCrystalModel;

public ItemRedCrystalRenderer() {

	RedCrystalModel = new ModelRedCrystal();
}

@Override
public boolean handleRenderType(ItemStack item, ItemRenderType type) {

return true;
}

@Override
public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

return true;
}

@Override
public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
TileEntityRenderer.instance.renderTileEntityAt(new TileEntityRedCrystal(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}
