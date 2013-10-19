package Mod.enchantedwoodlands.Items.LuminousForest;

import java.util.List;

import Mod.enchantedwoodlands.Common.Common;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSwiftFruit extends ItemFood
{
    private final int healAmount;
    private final boolean isWolfsFavoriteMeat;
    private final float saturationModifier;
    public final int itemUseDuration;

    public ItemSwiftFruit(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.itemUseDuration = 32;
        this.healAmount = 10;
        this.isWolfsFavoriteMeat = true;
        this.saturationModifier = 3.0F;
        this.setCreativeTab(Common.EnchWoodRPGTab);
    }
    @Override
    public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
    	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5 * 20, 2));    
    }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("\u00a7eFills 1.5 Hunger");
        par3List.add("\u00a7b5 Second Speed Boost");
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
    }
}