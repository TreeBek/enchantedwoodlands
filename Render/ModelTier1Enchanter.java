package Mod.enchantedwoodlands.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTier1Enchanter extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
  
  public ModelTier1Enchanter()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(-8F, 0F, -8F, 16, 8, 16);
      Base.setRotationPoint(0F, 0F, 0F);
      Base.setTextureSize(128, 64);
      Base.mirror = true;
      setRotation(Base, 20F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 25);
      Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
      Shape1.setRotationPoint(-8F, -2F, -8F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 20F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 65, 0);
      Shape2.addBox(-7F, 0F, -7F, 14, 1, 14);
      Shape2.setRotationPoint(0F, -1F, 0F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 20F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
  }
  
  public void render(float f5)
  {
	  Base.render(f5);
	  Shape1.render(f5);
	  Shape2.render(f5);
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