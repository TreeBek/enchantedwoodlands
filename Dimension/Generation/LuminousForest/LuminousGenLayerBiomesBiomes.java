package Mod.enchantedwoodlands.Dimension.Generation.LuminousForest;


import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Dimension.Dimensions;
import net.minecraft.world.gen.layer.GenLayer;


import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class LuminousGenLayerBiomesBiomes extends GenLayer {

protected BiomeGenBase[] allowedBiomes = {Dimensions.StarDustFields, Dimensions.WoodlandForest, Dimensions.WarmingHills};

public LuminousGenLayerBiomesBiomes(long seed, GenLayer genlayer) {
super(seed);
this.parent = genlayer;
}

public LuminousGenLayerBiomesBiomes(long seed) {
super(seed);
}

@Override
public int[] getInts(int x, int z, int width, int depth)
{
int[] dest = IntCache.getIntCache(width*depth);

for (int dz=0; dz<depth; dz++)
{
for (int dx=0; dx<width; dx++)
{
this.initChunkSeed(dx+x, dz+z);
dest[(dx+dz*width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
}
}
return dest;
}
}