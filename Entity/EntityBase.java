package Mod.enchantedwoodlands.Entity;

import Mod.enchantedwoodlands.Client.Models.Mobs.ModelGoblin;
import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Dimension.Dimensions;
import Mod.enchantedwoodlands.Entity.Render.RenderGoblin;
import Mod.enchantedwoodlands.Items.SpawnEggs.CustomSpawner;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class EntityBase {

	static int startEntityId = 300;
	public static Item customSpawner;
	
	public static int getUniqueEntityId(){
		
		do{
			startEntityId++;
		}
		while(EntityList.getStringFromID(startEntityId) != null);
		return startEntityId++;
	}
	
	public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor){
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
	
	public static void Init(){
		{
			customSpawner = new CustomSpawner(1016).setUnlocalizedName("customSpawner").setTextureName("EnchantedWoodlands:customSpawner").setCreativeTab(Common.EnchWoodRPGTab);
				LanguageRegistry.addName(customSpawner, "Spawn");
			
			EntityRegistry.registerGlobalEntityID(EntityGoblin.class, "Goblin", 1);
				EntityRegistry.addSpawn(EntityGoblin.class, 100, 2, 8, EnumCreatureType.monster, Dimensions.StarDustFields);
					EntityRegistry.findGlobalUniqueEntityId();
						RenderingRegistry.registerEntityRenderingHandler(EntityGoblin.class, new RenderGoblin(new ModelGoblin(), 0.3F));
							LanguageRegistry.instance().addStringLocalization("entity.Goblin.name", "Goblin");
		}			
	}	

}