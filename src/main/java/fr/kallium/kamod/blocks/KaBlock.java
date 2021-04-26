package fr.kallium.kamod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class KaBlock extends Block {

	public KaBlock(String name, Material materialIn, int hardness, CreativeTabs tab) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setCreativeTab(tab);
		
		Blocks.DIRT.getRegistryName();
	}

}
