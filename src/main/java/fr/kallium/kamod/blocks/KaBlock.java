package fr.kallium.kamod.blocks;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.KaBlocks;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class KaBlock extends Block implements IHasModel{

	public KaBlock(String name, Material materialIn, int hardness, CreativeTabs tab) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setCreativeTab(tab);
		KaBlocks.BLOCKS.add(this);
		kaItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
		
	}

	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
		
	}
}