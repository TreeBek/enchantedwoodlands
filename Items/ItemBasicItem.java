package Mod.enchantedwoodlands.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBasicItem extends Item{

	public ItemBasicItem(int par1) {
		super(par1);
		this.setCreativeTab(Common.EnchWoodRPGTab);
	}

	 @SideOnly(Side.CLIENT)
	    public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
	    
	    }
	
}
