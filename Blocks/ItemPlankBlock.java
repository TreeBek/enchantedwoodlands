package Mod.enchantedwoodlands.Blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemPlankBlock extends ItemBlock {
	
	public ItemPlankBlock(int par1)
    {
          super(par1);
          setHasSubtypes(true);
    }
   
    public String getUnlocalizedName(ItemStack itemstack)
    {
          String name = "";
          switch(itemstack.getItemDamage())
          {
                 case 0:
                 {
                        name = "world";
                        break;
                 }
                 case 1:
                 {
                        name = "nether";
                        break;
                 }
                 case 2:
                 {
                        name = "2";
                        break;
                 }
                 case 3:
                 {
                        name = "3";
                        break;
                 }
                 case 4:
                 {
                        name = "4";
                        break;
                 }
                 case 5:
                 {
                        name = "5";
                        break;
                 }
                 default: name = "broken";
          }
          return getUnlocalizedName() + "." + name;
    }
   
    public int getMetadata(int par1)
    {
          return par1;
    }
}
