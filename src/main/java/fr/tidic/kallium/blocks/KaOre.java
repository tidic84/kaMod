package fr.tidic.kallium.blocks;

import java.util.Random;

import fr.tidic.kallium.init.KaBlocks;
import fr.tidic.kallium.init.kaItems;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class KaOre extends BlockOre{

	private static boolean multipleQuantity = false;
	private static int minDrop;
	private static int maxDrop;
	
	public KaOre(String name, int harvestLevel, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", harvestLevel);
		setCreativeTab(tab);
	}
	
	public KaOre(String name, int harvestLevel, int minDrop, int maxDrop, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", harvestLevel);
		this.multipleQuantity = true;
		this.minDrop = minDrop;
		this.maxDrop = maxDrop;
		setCreativeTab(tab);
	}
	
	public Item getItemDropped(IBlockState state, Random random, int fortune) {
		if(this == KaBlocks.kallium_ore) {
			return kaItems.kallium;	
		} else {
			return Item.getItemFromBlock(this);	
		}

	}
	
	public int quantityDropped(Random random) {
		return this.multipleQuantity ? this.minDrop + random.nextInt(this.maxDrop - this.minDrop) : 1;
	}
	
	@Override
	public int getExpDrop(IBlockState state,IBlockAccess world, BlockPos pos, int fortune) {
		Random random = world instanceof World ? ((World)world).rand : new Random();
		if(this.getItemDropped(state, random, fortune) != Item.getItemFromBlock(this)) {
			if(this == KaBlocks.kallium_ore) {
				return MathHelper.getInt(random, 10, 50);
			}
		}
		
		return 0;
	}
}
