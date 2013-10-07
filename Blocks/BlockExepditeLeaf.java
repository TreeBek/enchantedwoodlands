package Mod.enchantedwoodlands.Blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Mod.enchantedwoodlands.Blocks.Blocks;
import Mod.enchantedwoodlands.Common.Common;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
public class BlockExepditeLeaf extends BlockLeavesBase implements IShearable
{
	public static final String[] Fer_LEAF_TYPES = new String[] {"fer"};
	public static final String[] LEAF_TYPES = new String[] {"fer"};
    public static final String[][] field_94396_b = new String[][] {{"fer"}, {"fer"}};
    @SideOnly(Side.CLIENT)
    private int field_94394_cP;
    private Icon[][] iconArray = new Icon[2][];

    public BlockExepditeLeaf(int par1, Material air,  boolean par3)
    {
        super(par1, Material.leaves, false);
        this.setTickRandomly(true);
        this.setCreativeTab(Common.EnchWoodRPGTab);
        this.graphicsLevel = par3;
        this.setStepSound(soundGrassFootstep);
    }
    public boolean isOpaqueCube()
    {
            return false;
    }

    /**
     * ejects contained items into the world, and notifies neighbours of an update, as appropriate
     */
    public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
    {
        byte b0 = 1;
        int j1 = b0 + 1;

        if (par1World.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2 + j1, par3 + j1, par4 + j1))
        {
            for (int k1 = -b0; k1 <= b0; ++k1)
            {
                for (int l1 = -b0; l1 <= b0; ++l1)
                {
                    for (int i2 = -b0; i2 <= b0; ++i2)
                    {
                        int j2 = par1World.getBlockId(par2 + k1, par3 + l1, par4 + i2);

                        if (Block.blocksList[j2] != null)
                        {
                            Block.blocksList[j2].beginLeavesDecay(par1World, par2 + k1, par3 + l1, par4 + i2);
                        }
                    }
                }
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    /**
     * Ticks the block randomly for leaves.
     * This checks to see if there is wood nearby.
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
       int var7 = 2;  //Basic leaf distance check
       int var12, var13, var14;
       int bid;
       int totaldist = 0;

       if (!par1World.isRemote)
       {      
          for (var12 = -var7; var12 <=  var7; ++var12) 
          {
             for (var13 = -var7; var13 <= 0; ++var13)   //Only check down, because leaves only grow on top of wood
             {
                for (var14 = -var7; var14 <= var7; ++var14)
                {
                   totaldist = Math.abs(var12) + Math.abs(var13) + Math.abs(var14); //Make roundish corners, not square!
                   if(totaldist <= 3){ //Furthest a leaf is allowed to be from a block of wood!
                      bid = par1World.getBlockId(par2 + var12, par3 + var13, par4 + var14);
                      Block block = Block.blocksList[bid];
                      if (block != null && block.canSustainLeaves(par1World, par2 + var12, par3 + var13, par4 + var14))
                      {
                         //We are a valid leaf block. See if there is air underneath. Maybe we will drop an item!
                         bid = par1World.getBlockId(par2, par3 - 1, par4);
                         if(bid == 0)
                         {
                            if (par1World.rand.nextInt(20) == 0)
                            {
                               this.dropBlockAsItemWithChance(par1World, par2, par3 - 1, par4, 0, 0.0F, 0);
                            }
                         }
                         return; //Found wood. Ours or not, who cares. Attached or not, who cares. Just nearby is all that counts.
                      }
                   }
                }
             }
          }
          this.removeLeaves(par1World, par2, par3, par4);
       }
    }
    
    private void removeLeaves(World par1World, int par2, int par3, int par4)
    {
        this.dropBlockAsItem(par1World, par2, par3, par4, 0, 0);
        par1World.setBlock(par2, par3, par4, 0,0,2);
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par1World.canLightningStrikeAt(par2, par3 + 1, par4) && !par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4) && par5Random.nextInt(15) == 1)
        {
            double d0 = (double)((float)par2 + par5Random.nextFloat());
            double d1 = (double)par3 - 0.05D;
            double d2 = (double)((float)par4 + par5Random.nextFloat());
            par1World.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }
    }

   
    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
		return 0 ;
       
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        if (!par1World.isRemote)
        {
            int j1 = 20;

            if ((par5 & 3) == 3)
            {
                j1 = 40;
            }

            if (par7 > 0)
            {
                j1 -= 2 << par7;

                if (j1 < 10)
                {
                    j1 = 10;
                }
            }

            if (par1World.rand.nextInt(j1) == 0)
            {
                int k1 = this.idDropped(par5, par1World.rand, par7);
                this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(k1, 1, this.damageDropped(par5)));
            }

            j1 = 200;

            if (par7 > 0)
            {
                j1 -= 10 << par7;

                if (j1 < 40)
                {
                    j1 = 40;
                }
            }

            if ((par5 & 3) == 0 && par1World.rand.nextInt(j1) == 0)
            {
                //this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(Item.appleRed, 1, 0));
                //this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(Main.fer_ore, 1, 0));
            }
        }
    }

    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
        super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
    }


    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
   

   

    

    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        par3List.add(new ItemStack(par1, 1, 0));
        
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int par1)
    {
        return new ItemStack(this.blockID, 1, par1 & 3);
    }

    private Icon top, bottom, side1, side2, side3, side4;
    private Icon [][] iconBuffer;
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {
       this.blockIcon = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
       this.top = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
        this.bottom = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
        this.side1 = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
        this.side2 = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
        this.side3 = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
        this.side4 = iconRegister.registerIcon(Common.modid + ":" + this.getUnlocalizedName().substring(5));
    }

    public Icon getIcon(int side, int par2)
    {
       if(side == 0){
            return bottom;
        }
        if(side == 1){
            return top;
        }
        if(side == 2){
            return side1;
        }
        if(side == 3){
            return side2;
        }
        if(side == 4){
            return side3;
        }
        if(side == 5){
            return side4;
        }
        else{
            return side2;
        }
    }
    
    @Override
    public boolean isShearable(ItemStack item, World world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, World world, int x, int y, int z, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
    }

    @Override
    public void beginLeavesDecay(World world, int x, int y, int z)
    {
        world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }

    @Override
    public boolean isLeaves(World world, int x, int y, int z)
    {
        return true;
    }
	
}