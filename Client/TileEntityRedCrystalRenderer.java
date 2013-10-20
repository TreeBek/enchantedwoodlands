package Mod.enchantedwoodlands.Client;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Client.Models.ModelRedCrystal;
import Mod.enchantedwoodlands.Client.TitleEntity.TileEntityRedCrystal;


public class TileEntityRedCrystalRenderer extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelRedCrystal modelAltar;
    public TileEntityRedCrystalRenderer()
    {
        modelAltar = new ModelRedCrystal();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityRedCrystal)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityRedCrystal tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y, (float)z + 0.5F);
        this.bindTexture(new ResourceLocation(Common.modid.toLowerCase(), "textures/blocks/redCrystal.png"));
        GL11.glPushMatrix();
        modelAltar.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}