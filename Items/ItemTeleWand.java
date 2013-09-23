package Mod.enchantedwoodlands.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTeleWand extends Item{

	public ItemTeleWand(int par1) {
		super(par1);
		this.setCreativeTab(Common.EnchWoodRPGTab);
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
			int PlayerDimension = par3EntityPlayer.dimension;
  
				if(PlayerDimension == 2){
   
					par3EntityPlayer.travelToDimension(0);
					return par1ItemStack;
   
				}else return par1ItemStack;
  
    }
	
   
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
    
    }
}
