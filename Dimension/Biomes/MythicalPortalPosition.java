package Mod.enchantedwoodlands.Dimension.Biomes;

import Mod.enchantedwoodlands.Dimension.Generation.MythicalTeleporter;
import net.minecraft.util.ChunkCoordinates;
public class MythicalPortalPosition extends ChunkCoordinates
{
public long field_85087_d;
final MythicalTeleporter field_85088_e;
public MythicalPortalPosition(MythicalTeleporter tutorialTeleporter, int par2, int par3, int par4, long par5)
{
super(par2, par3, par4);
this.field_85088_e = tutorialTeleporter;
this.field_85087_d = par5;
}
}