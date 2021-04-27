package fr.kallium.kamod.blocks;

import java.util.Random;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.KaBlocks;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class KaOre extends BlockOre implements IHasModel{

	private static boolean multipleQuantity = false;
	private static int minDrop;
	private static int maxDrop;
	
	public KaOre(String name, int harvestLevel, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", harvestLevel);
		setCreativeTab(tab);
		KaBlocks.BLOCKS.add(this);
		kaItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
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

	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
		
	}
}