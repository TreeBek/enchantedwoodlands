package Mod.enchantedwoodlands.Common.Gui;

import java.util.Comparator;
import net.minecraft.item.crafting.IRecipe;

public class WoodlandRecipeSorter implements Comparator
{
final WoodlandCraftingManager WoodlandCraftingManager;

public WoodlandRecipeSorter(WoodlandCraftingManager par1BetterCraftingManager)
{
         this.WoodlandCraftingManager = par1BetterCraftingManager;
         
}

public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
{
         return par1IRecipe instanceof WoodlandShapelessRecipes && par2IRecipe instanceof WoodlandShapedRecipes ? 1 : (par2IRecipe instanceof WoodlandShapelessRecipes && par1IRecipe instanceof WoodlandShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
}

public int compare(Object par1Obj, Object par2Obj)
{
         return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
}
}