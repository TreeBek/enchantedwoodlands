package Mod.enchantedwoodlands.Dimension.Generation.LuminousForest;

import Mod.enchantedwoodlands.Dimension.Generation.LuminousForest.LuminousTeleporter;
import net.minecraft.util.ChunkCoordinates;
public class LuminousPortalPosition extends ChunkCoordinates
{
public long field_85087_d;
final LuminousTeleporter field_85088_e;
public LuminousPortalPosition(LuminousTeleporter tutorialTeleporter, int par2, int par3, int par4, long par5)
{
super(par2, par3, par4);
this.field_85088_e = tutorialTeleporter;
this.field_85087_d = par5;
}
}