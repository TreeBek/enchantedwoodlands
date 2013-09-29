package Mod.enchantedwoodlands.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTier1Enchanter extends ModelBase
{
  ModelRenderer Middle;
  ModelRenderer Top;
  ModelRenderer Base;

public ModelTier1Enchanter()
{
  textureWidth = 128;
  textureHeight = 64;
  
  Middle = new ModelRenderer(this, 65, 0);
  Middle.addBox(-8F, 8F, -8F, 14, 1, 14);
  Middle.setRotationPoint(1F, -1F, 1F);
  Middle.setTextureSize(128, 64);
  Middle.mirror = true;
  setRotation(Middle, 0F, 0F, 0F);
  Top = new ModelRenderer(this, 0, 25);
  Top.addBox(-8F, 8F, -8F, 16, 1, 16);
  Top.setRotationPoint(0F, 0F, 0F);
  Top.setTextureSize(128, 64);
  Top.mirror = true;
  setRotation(Top, 0F, 0F, 0F);
  Base = new ModelRenderer(this, 0, 0);
  Base.addBox(8F, -8F, -8F, 16, 7, 16);
  Base.setRotationPoint(16F, -1F, 0F);
  Base.setTextureSize(128, 64);
  Base.mirror = true;
  setRotation(Base, 0F, 0F, 3.141593F);
}

  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Middle.render(f5);
    Top.render(f5);
    Base.render(f5);
  }
  
  public void render(float f5)
  {
	    Middle.render(f5);
	    Top.render(f5);
	    Base.render(f5);
  }
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}