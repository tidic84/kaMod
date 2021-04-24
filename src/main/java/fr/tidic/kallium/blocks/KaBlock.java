package fr.tidic.kallium.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class KaBlock extends Block {

	public KaBlock(String name, Material materialIn, int hardness, CreativeTabs tab) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setCreativeTab(tab);
	}

}
