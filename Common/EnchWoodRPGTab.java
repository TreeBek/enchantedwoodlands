package Mod.enchantedwoodlands.Common;



import Mod.enchantedwoodlands.Blocks.Blocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class EnchWoodRPGTab extends CreativeTabs
{
	public EnchWoodRPGTab(int par1, String par2Str)
    {
        super(par1, par2Str);
    }
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Blocks.woodlandGrass.blockID;
    }
    public String getTranslatedTabLabel()
    {
        return "Enchanted Woodlands";
    }
}
