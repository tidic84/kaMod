package fr.kallium.kamod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class KaItemFood extends ItemFood {

	public KaItemFood( String name, CreativeTabs tab, int amount, float saturation,boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
	}

	

}
