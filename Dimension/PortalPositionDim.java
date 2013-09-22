package Mod.enchantedwoodlands.Dimension;

import net.minecraft.util.ChunkCoordinates;
public class PortalPositionDim extends ChunkCoordinates
{
public long field_85087_d;
final TeleporterDim field_85088_e;
public PortalPositionDim(TeleporterDim tutorialTeleporter, int par2, int par3, int par4, long par5)
{
super(par2, par3, par4);
this.field_85088_e = tutorialTeleporter;
this.field_85087_d = par5;
}
}