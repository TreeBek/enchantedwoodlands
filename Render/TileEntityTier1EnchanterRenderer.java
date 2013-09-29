package Mod.enchantedwoodlands.Render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import Mod.enchantedwoodlands.Common.Common;


public class TileEntityTier1EnchanterRenderer extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelTier1Enchanter model;
    public TileEntityTier1EnchanterRenderer()
    {
        model = new ModelTier1Enchanter();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityTier1Enchanter)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityTier1Enchanter tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y, (float)z + 0.5F);
        this.bindTexture(new ResourceLocation(Common.modid.toLowerCase(), "textures/blocks/tier1Enchanter.png"));
        GL11.glPushMatrix();
        model.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}