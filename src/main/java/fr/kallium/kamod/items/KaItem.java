package fr.kallium.kamod.items;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.KaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class KaItem extends Item implements IHasModel {
	
	public KaItem(String name, CreativeTabs tab) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		KaItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(this, 0);
	}

}