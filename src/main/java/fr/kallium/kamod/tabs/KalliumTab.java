package fr.kallium.kamod.tabs;

import fr.kallium.kamod.init.KaItems;
import fr.kallium.kamod.items.KaItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.datafix.fixes.ItemIntIDToString;

public class KalliumTab extends CreativeTabs

{

	public KalliumTab(String label) {
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(KaItems.kallium);
	}

}
