package fr.kallium.kamod.items;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class KaItemFood extends ItemFood implements IHasModel {

	public KaItemFood( String name, CreativeTabs tab, int amount, float saturation,boolean isWolfFood) {
		super(amount, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		kaItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(this, 0);
	}

}

