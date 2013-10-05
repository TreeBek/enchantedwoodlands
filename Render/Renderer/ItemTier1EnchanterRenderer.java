package Mod.enchantedwoodlands.Render.Renderer;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import Mod.enchantedwoodlands.Render.Models.ModelTier1Enchanter;
import Mod.enchantedwoodlands.Render.TitleEntity.TileEntityTier1Enchanter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class ItemTier1EnchanterRenderer implements IItemRenderer {

private ModelTier1Enchanter Tier1EnchanterModel;

public ItemTier1EnchanterRenderer() {

	Tier1EnchanterModel = new ModelTier1Enchanter();
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
TileEntityRenderer.instance.renderTileEntityAt(new TileEntityTier1Enchanter(), 0.0D, 0.0D, 0.0D, 0.0F);
}
}
