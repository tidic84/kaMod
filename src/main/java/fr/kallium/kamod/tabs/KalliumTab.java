package fr.kallium.kamod.tabs;

import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.items.kaItem;
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
		return new ItemStack(kaItems.kallium);
	}

}
