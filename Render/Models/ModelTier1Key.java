package Mod.enchantedwoodlands.Render.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTier1Key extends ModelBase
{
  //fields
    ModelRenderer Handle1;
    ModelRenderer Handle2;
    ModelRenderer Handle3;
    ModelRenderer Handle4;
    ModelRenderer Nubs1;
    ModelRenderer Nubs2;
  
  public ModelTier1Key()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Handle1 = new ModelRenderer(this, 0, 2);
      Handle1.addBox(0F, 0F, 0F, 3, 1, 1);
      Handle1.setRotationPoint(-6F, 2F, 0F);
      Handle1.setTextureSize(64, 32);
      Handle1.mirror = true;
      setRotation(Handle1, 0F, 0F, 0F);
      Handle2 = new ModelRenderer(this, 0, 4);
      Handle2.addBox(0F, 0F, 0F, 3, 1, 1);
      Handle2.setRotationPoint(-6F, 0F, 0F);
      Handle2.setTextureSize(64, 32);
      Handle2.mirror = true;
      setRotation(Handle2, 0F, 0F, 0F);
      Handle3 = new ModelRenderer(this, 0, 6);
      Handle3.addBox(0F, 0F, 0F, 1, 1, 1);
      Handle3.setRotationPoint(-6F, 1F, 0F);
      Handle3.setTextureSize(64, 32);
      Handle3.mirror = true;
      setRotation(Handle3, 0F, 0F, 0F);
      Handle4 = new ModelRenderer(this, 0, 8);
      Handle4.addBox(0F, 0F, 0F, 7, 1, 1);
      Handle4.setRotationPoint(-4F, 1F, 0F);
      Handle4.setTextureSize(64, 32);
      Handle4.mirror = true;
      setRotation(Handle4, 0F, 0F, 0F);
      Nubs1 = new ModelRenderer(this, 0, 10);
      Nubs1.addBox(0F, 0F, 0F, 1, 1, 1);
      Nubs1.setRotationPoint(2F, 2F, 0F);
      Nubs1.setTextureSize(64, 32);
      Nubs1.mirror = true;
      setRotation(Nubs1, 0F, 0F, 0F);
      Nubs2 = new ModelRenderer(this, 0, 12);
      Nubs2.addBox(0F, 0F, 0F, 1, 1, 1);
      Nubs2.setRotationPoint(0F, 2F, 0F);
      Nubs2.setTextureSize(64, 32);
      Nubs2.mirror = true;
      setRotation(Nubs2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle1.render(f5);
    Handle2.render(f5);
    Handle3.render(f5);
    Handle4.render(f5);
    Nubs1.render(f5);
    Nubs2.render(f5);
  }
  
  public void render(float f5)
  {
	  Handle1.render(f5);
	  Handle2.render(f5);
	  Handle3.render(f5);
	  Handle4.render(f5);
	  Nubs1.render(f5);
	  Nubs2.render(f5);
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
