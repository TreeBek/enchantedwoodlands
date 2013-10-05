package Mod.enchantedwoodlands.Dimension.Generation.LuminousForest;


import Mod.enchantedwoodlands.Common.Common;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3Pool;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LuminousWorldProviderDim extends WorldProvider
{
public void registerWorldChunkManager()
{
/** tells Minecraft to use our new WorldChunkManager **/
this.worldChunkMgr = new LuminousWorldChunkMangerBiomes(worldObj.getSeed(), terrainType);
this.hasNoSky = false;
}
@Override
public Vec3 getSkyColor(Entity cameraEntity, float partialTicks)
{
         return this.worldObj.getWorldVec3Pool().getVecFromPool(0, 0.2, 0.3);
}

@Override
public boolean isSkyColored()
{
         return true;
}

@Override
/** Dimension Name **/
public String getDimensionName()
{
return "Luminous Forest";
}

/** Get Provider for dimension **/
public static WorldProvider getProviderForDimension(int id)
{
return DimensionManager.createProviderFor(Common.DimID);
}

/** Welcome message **/
public String getWelcomeMessage()
{
return "Entering the Luminous Dimension";
}

/** What chunk provider to use **/
public IChunkProvider createChunkGenerator()
{
return new LuminousChunkProvider(worldObj, worldObj.getSeed(), true);
}

/** Can player re-spawn here **/
public boolean canRespawnHere()
{
return false;
}

/** Set user message **/
// not sure if this works any more ?
protected synchronized String setUserMessage(String par1Str)
{
return "Building Enchanted Luminous Forest Dimension";
}

/** Determines the dimension the player will be respawned in **/
public int getRespawnDimension(EntityPlayerMP player)
{
return 0;
}

/** Dimension Movement speed **/
public double getMovementFactor()
{
return 10.0;
}
}