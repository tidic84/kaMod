package fr.kallium.kamod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class kaItem extends Item {
	
	public kaItem(String name, CreativeTabs tab) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}

}
