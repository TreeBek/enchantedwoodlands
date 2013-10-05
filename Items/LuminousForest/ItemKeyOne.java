package Mod.enchantedwoodlands.Items.LuminousForest;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Common.Common;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKeyOne extends Item{

	public ItemKeyOne(int par1) {
		super(par1);
		this.setMaxStackSize(16);
		this.setCreativeTab(Common.EnchWoodRPGTab);
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
  int Id = par3World.getBlockId(par4, par5, par6);
  
        if(Id == Blocks.tier1LockedDoorBlock.blockID){
         
         par1ItemStack.stackSize -= 1;
         par3World.destroyBlock(par4, par5, par6, false);
         
         if(par3World.getBlockId(par4 + 1, par5, par6)== Id + 1){
          
          par3World.destroyBlock(par4 + 1, par5, par6, false);
         }
         
         if(par3World.getBlockId(par4 , par5 + 1, par6)== Id + 1){
          
          par3World.destroyBlock(par4, par5 + 1, par6, false);
         }
         
         if(par3World.getBlockId(par4 + 1 , par5 + 1, par6)== Id + 1){
          
          par3World.destroyBlock(par4 + 1, par5 + 1, par6, false);
         }
         if(par3World.getBlockId(par4 - 1, par5, par6)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5, par6, false);
         }
         
         if(par3World.getBlockId(par4 , par5 - 1, par6)== Id + 1){
          
          par3World.destroyBlock(par4, par5 - 1, par6, false);
         }
         
         if(par3World.getBlockId(par4 - 1 , par5 - 1, par6)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5 - 1, par6, false);
         }
         if(par3World.getBlockId(par4 - 1 , par5 + 1, par6)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5 + 1, par6, false);
         }
   if(par3World.getBlockId(par4 + 1 , par5 - 1, par6)== Id + 1){
 
    par3World.destroyBlock(par4 + 1, par5 - 1, par6, false);
   }
   
   //+z
   if(par3World.getBlockId(par4 + 1, par5, par6 + 1)== Id + 1){
          
          par3World.destroyBlock(par4 + 1, par5, par6 + 1, false);
         }
         
         if(par3World.getBlockId(par4 , par5 + 1, par6 + 1)== Id + 1){
          
          par3World.destroyBlock(par4, par5 + 1, par6 + 1, false);
         }
         
         if(par3World.getBlockId(par4 + 1 , par5 + 1, par6 + 1)== Id + 1){
          
          par3World.destroyBlock(par4 + 1, par5 + 1, par6 + 1, false);
         }
         if(par3World.getBlockId(par4 - 1, par5, par6 + 1)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5, par6 + 1, false);
         }
         
         if(par3World.getBlockId(par4 , par5 - 1, par6 + 1)== Id + 1){
          
          par3World.destroyBlock(par4, par5 - 1, par6 + 1, false);
         }
         
         if(par3World.getBlockId(par4 - 1 , par5 - 1, par6 + 1)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5 - 1, par6 + 1, false);
         }
         if(par3World.getBlockId(par4 - 1 , par5 + 1, par6 + 1)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5 + 1, par6 + 1, false);
         }
   if(par3World.getBlockId(par4 + 1 , par5 - 1, par6 + 1)== Id + 1){
 
    par3World.destroyBlock(par4 + 1, par5 - 1, par6 + 1, false);
   }
   //-z
   if(par3World.getBlockId(par4 + 1, par5, par6 - 1)== Id + 1){
          
          par3World.destroyBlock(par4 + 1, par5, par6 - 1, false);
         }
         
         if(par3World.getBlockId(par4 , par5 + 1, par6 - 1)== Id + 1){
          
          par3World.destroyBlock(par4, par5 + 1, par6 - 1, false);
         }
         
         if(par3World.getBlockId(par4 + 1 , par5 + 1, par6 - 1)== Id + 1){
          
          par3World.destroyBlock(par4 + 1, par5 + 1, par6 - 1, false);
         }
         if(par3World.getBlockId(par4 - 1, par5, par6 - 1)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5, par6 - 1, false);
         }
         
         if(par3World.getBlockId(par4 , par5 - 1, par6 - 1)== Id + 1){
          
          par3World.destroyBlock(par4, par5 - 1, par6 - 1, false);
         }
         
         if(par3World.getBlockId(par4 - 1 , par5 - 1, par6 - 1)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5 - 1, par6 - 1, false);
         }
         if(par3World.getBlockId(par4 - 1 , par5 + 1, par6 - 1)== Id + 1){
          
          par3World.destroyBlock(par4 - 1, par5 + 1, par6 - 1, false);
         }
   if(par3World.getBlockId(par4 + 1 , par5 - 1, par6 - 1)== Id + 1){
 
    par3World.destroyBlock(par4 + 1, par5 - 1, par6 - 1, false);
   }
   //-+z
   if(par3World.getBlockId(par4, par5, par6 + 1)== Id + 1){
          
          par3World.destroyBlock(par4, par5, par6 + 1, false);
         }
   if(par3World.getBlockId(par4, par5, par6 - 1)== Id + 1){
          
          par3World.destroyBlock(par4, par5, par6 - 1, false);
         }
         
         return true;
        }else
         return false;
    }
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
    }
      
    }

    


