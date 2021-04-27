package fr.kallium.kamod.items;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class kaItem extends Item implements IHasModel {
	
	public kaItem(String name, CreativeTabs tab) {
		
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