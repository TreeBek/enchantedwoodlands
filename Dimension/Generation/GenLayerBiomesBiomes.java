package Mod.enchantedwoodlands.Dimension.Generation;


import Mod.enchantedwoodlands.Common.Common;
import Mod.enchantedwoodlands.Dimension.Dimensions;
import net.minecraft.world.gen.layer.GenLayer;


import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomesBiomes extends GenLayer {

protected BiomeGenBase[] allowedBiomes = {Dimensions.Biome2, Dimensions.Biome1};

public GenLayerBiomesBiomes(long seed, GenLayer genlayer) {
super(seed);
this.parent = genlayer;
}

public GenLayerBiomesBiomes(long seed) {
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