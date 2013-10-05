package Mod.enchantedwoodlands.Items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Dimension.Generation.LuminousForest.LuminousTeleporter;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTeleWand extends Item{

	public ItemTeleWand(int par1) {
		super(par1);
		this.setCreativeTab(Common.EnchWoodRPGTab);
		this.setMaxStackSize(1);
		this.setMaxDamage(3);
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
		if ((par3EntityPlayer.ridingEntity == null) && (par3EntityPlayer.riddenByEntity == null) && ((par3EntityPlayer instanceof EntityPlayerMP)))
        {
			EntityPlayerMP thePlayer = (EntityPlayerMP)par3EntityPlayer;
        	
			if (thePlayer.dimension == Common.DimID)
        	{
				par1ItemStack.damageItem(1, par3EntityPlayer);
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, Common.DimID, new LuminousTeleporter(thePlayer.mcServer.worldServerForDimension(Common.DimID)));
        	}
        	
        }
		return par1ItemStack;
    }
	
   
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
    
    }
}
