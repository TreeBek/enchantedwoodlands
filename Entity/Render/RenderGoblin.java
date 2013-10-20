package Mod.enchantedwoodlands.Entity.Render;

import Mod.enchantedwoodlands.Client.Models.Mobs.ModelGoblin;
import Mod.enchantedwoodlands.Entity.EntityGoblin;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderGoblin extends RenderLiving {

	protected ModelGoblin model;
	
	public RenderGoblin(ModelBase par1ModelBase, float par2){
		super(par1ModelBase, par2);
		model = ((ModelGoblin)mainModel);
		
	}
	
	public void renderGoblin(EntityGoblin entity, double par2, double par4, double par6, float par8, float par9){
		super.doRenderLiving(entity, par2, par4, par6, par8, par9);
	}
	
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9){
		renderGoblin((EntityGoblin)par1EntityLiving, par2, par4, par6, par8, par9);
	}
	
	@Override
	public void doRender(Entity entity, double d0, double d1, double d2,float f, float f1) 
	{
		renderGoblin((EntityGoblin)entity, d0, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		return new ResourceLocation("EnchantedWoodlands:textures/models/goblin.png");
	}

}
