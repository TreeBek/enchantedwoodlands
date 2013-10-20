package Mod.enchantedwoodlands.Common;



import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Config.LuminousForestConfig;
import Mod.enchantedwoodlands.Config.MainConfig;
import Mod.enchantedwoodlands.Crafting.Crafting;
import Mod.enchantedwoodlands.Dimension.Dimensions;
import Mod.enchantedwoodlands.Dimension.Biomes.OreWorldGen;
import Mod.enchantedwoodlands.Dimension.Structure.Structure;
import Mod.enchantedwoodlands.Entity.EntityBase;
import Mod.enchantedwoodlands.Gui.GuiHandlerEnchantedWoodlands;
import Mod.enchantedwoodlands.Items.LuminousForest.ItemPortalPlacer;
import Mod.enchantedwoodlands.Items.Items;
import Mod.enchantedwoodlands.Proxy.CommonProxy;
import Mod.enchantedwoodlands.Client.TitleEntity.TileEntityRedCrystal;
import Mod.enchantedwoodlands.Client.TitleEntity.TileEntityTier1Enchanter;
import Mod.enchantedwoodlands.Client.TitleEntity.TileEntityTier1Key;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.BlockFire;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
@Mod(modid="EnchantedWoodlands", name="EnchantedWoodlands", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Common
{
	@SidedProxy(clientSide = "Mod.enchantedwoodlands.Proxy.ClientProxy", serverSide = "Mod.enchantedwoodlands.Proxy.CommonProxy")
	 public static CommonProxy proxy;
	@Instance("EnchantedWoodlands")
	public static Common instance;

public static final String modid = "EnchantedWoodlands";	
//Creative Tabs
public static CreativeTabs EnchWoodRPGTab = new EnchWoodRPGTab(CreativeTabs.getNextID(), "EnchantedWoodlands");
		
private static GuiHandlerEnchantedWoodlands guiHandlerEnchantedWoodlands = new GuiHandlerEnchantedWoodlands();		


 /** Dimension **/
public static int DimID = 2;


@EventHandler
public static void Init(FMLInitializationEvent event)
{
	Blocks.Init();
	Dimensions.Init();
	Items.Init();
	Crafting.Init();
	EntityBase.Init();
	NetworkRegistry.instance().registerGuiHandler(guiHandlerEnchantedWoodlands, guiHandlerEnchantedWoodlands);
	GameRegistry.registerBlock(Blocks.redCrystal);
	proxy.registerRenderThings();
	Structure.Init();
	TileEntity.addMapping(TileEntityRedCrystal.class, "Red Crystal");
	TileEntity.addMapping(TileEntityTier1Key.class, "Tier1 Key");
	TileEntity.addMapping(TileEntityTier1Enchanter.class, "Tier1 Enchanter");
	
}

@EventHandler
public static void PreInit(FMLPreInitializationEvent event)
{
	MainConfig.PreInit(event);
	LuminousForestConfig.PreInit(event);
}





}
