package Mod.enchantedwoodlands.Render.Renderer;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import Mod.enchantedwoodlands.Render.Models.ModelTier1Key;
import Mod.enchantedwoodlands.Render.TitleEntity.TileEntityTier1Key;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemTier1KeyRenderer implements IItemRenderer {

private ModelTier1Key Tier1KeyModel;

public ItemTier1KeyRenderer() {

	Tier1KeyModel = new ModelTier1Key();
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
TileEntityRenderer.instance.renderTileEntityAt(new TileEntityTier1Key(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}
