package Mod.enchantedwoodlands.Common;



import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Crafting.Crafting;
import Mod.enchantedwoodlands.Dimension.Dimensions;
import Mod.enchantedwoodlands.Dimension.Biomes.OreWorldGen;
import Mod.enchantedwoodlands.Dimension.Structure.Structure;
import Mod.enchantedwoodlands.Gui.GuiHandlerEnchantedWoodlands;
import Mod.enchantedwoodlands.Items.LuminousForest.ItemPortalPlacer;
import Mod.enchantedwoodlands.Items.Items;
import Mod.enchantedwoodlands.Proxy.CommonProxy;
import Mod.enchantedwoodlands.Render.TitleEntity.TileEntityRedCrystal;
import Mod.enchantedwoodlands.Render.TitleEntity.TileEntityTier1Enchanter;
import Mod.enchantedwoodlands.Render.TitleEntity.TileEntityTier1Key;
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
/////////////////////////////////////////
//
//ITEM AND BLOCK CONFIG
//
/////////////////////////////////////////

//Block ID
	public static int woodlandFireID;
	public static int woodlandPortalID;
	public static int starDustGrassID;
	public static int mythicalStoneID;
	public static int starDustFlowerID;
	public static int starDustLogID;
	public static int starDustLeafID;
	public static int starDustSaplingID;
	public static int woodlandGrassID;
	public static int exepditeLogID;
	public static int exepditeLeafID;
	public static int swiftnessFruitBlockID;
	public static int woodlandBenchID;
	public static int woodlandPlankID;
	public static int redCrystalID;
	public static int mythicalBricksID;
	public static int tier1KeyBlockID;
	public static int tier1LockedDoorBlockID;
	public static int tier1EnchanterID;
	public static int woodlandLongGrassID;
	
//Item ID
	public static int woodlandLighterID;
	public static int mythicalPortalPlacerID;
	public static int teleWandID;
	public static int swiftnessFruitID;
	public static int tier1KeyID;

@EventHandler
 public void preInit(FMLPreInitializationEvent event){
	 Configuration config = new Configuration(event.getSuggestedConfigurationFile());
     config.load();
     //Blocks
     woodlandFireID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Fire", 4000).getInt();
     woodlandPortalID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Portal", 4001).getInt();
     starDustGrassID = config.getTerrainBlock("Enchanted Woodlands Generation", "StarDust Grass", 200,null).getInt();
     mythicalStoneID = config.get(Configuration.CATEGORY_BLOCK, "Mythical Stone", 4003).getInt();
     starDustFlowerID = config.get(Configuration.CATEGORY_BLOCK,"StarDust Flower", 4004).getInt();
     starDustLogID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Log", 4005).getInt();
     starDustLeafID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Leaves", 4006).getInt();
     starDustSaplingID = config.get(Configuration.CATEGORY_BLOCK, "StarDust Sapling", 4007).getInt();
     woodlandGrassID = config.getTerrainBlock("Enchanted Woodlands Generation", "Woodline Grass", 201,null).getInt();
     exepditeLogID = config.get(Configuration.CATEGORY_BLOCK, "Exepdite Log", 4009).getInt();
     exepditeLeafID = config.get(Configuration.CATEGORY_BLOCK, "Exepdite Leaves", 4010).getInt();
     swiftnessFruitBlockID = config.get(Configuration.CATEGORY_BLOCK, "Swiftness FruitBlock", 4011).getInt();
     woodlandBenchID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Bench", 4012).getInt();
     woodlandPlankID = config.get(Configuration.CATEGORY_BLOCK, "Woodland Planks", 4013).getInt();
     redCrystalID = config.get(Configuration.CATEGORY_BLOCK, "Red Crystal", 4014).getInt();
     mythicalBricksID = config.get(Configuration.CATEGORY_BLOCK, "Mythical Bricks", 4015).getInt();
     tier1KeyBlockID = config.get(Configuration.CATEGORY_BLOCK, "Tier1 KeyBlock", 4016).getInt();
     tier1EnchanterID = config.get(Configuration.CATEGORY_BLOCK, "Tier1 Enchanter", 4019).getInt();
     tier1LockedDoorBlockID = config.get("AVOID CHANGING", "Tier1 LockedDoor", 4017,"But if you do make sure there is always an ID open one above this one's!").getInt();
     woodlandLongGrassID = config.get(Configuration.CATEGORY_BLOCK, "Woodland LongGrass", 4020).getInt();
     
     //Items
     woodlandLighterID = config.get(Configuration.CATEGORY_ITEM, "Woodland Lighter", 7000).getInt();
     mythicalPortalPlacerID = config.get(Configuration.CATEGORY_ITEM, "Mythical PortalPlacer", 7001).getInt();
     teleWandID = config.get(Configuration.CATEGORY_ITEM, "Tele-Wand", 7002).getInt();
     swiftnessFruitID = config.get(Configuration.CATEGORY_ITEM, "Swiftness Fruit", 7003).getInt();
     tier1KeyID = config.get(Configuration.CATEGORY_ITEM, "Tier 1 Dungeon", 7004).getInt();
     config.save();
 }


 /** Dimension **/
public static int DimID = 2;


@EventHandler
public static void Init(FMLInitializationEvent event)
{
	Blocks.Init();
	Dimensions.Init();
	Items.Init();
	Crafting.Init();
	NetworkRegistry.instance().registerGuiHandler(guiHandlerEnchantedWoodlands, guiHandlerEnchantedWoodlands);
	GameRegistry.registerBlock(Blocks.redCrystal);
	proxy.registerRenderThings();
	Structure.Init();
	TileEntity.addMapping(TileEntityRedCrystal.class, "Red Crystal");
	TileEntity.addMapping(TileEntityTier1Key.class, "Tier1 Key");
	TileEntity.addMapping(TileEntityTier1Enchanter.class, "Tier1 Enchanter");
	
}





}
