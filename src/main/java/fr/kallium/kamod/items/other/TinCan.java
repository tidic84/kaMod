package fr.kallium.kamod.items.other;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.KaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TinCan extends Item implements IHasModel{

	public TinCan(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxDamage(8);
		setMaxStackSize(16);
		setDamage(new ItemStack(KaItems.tin_can), 6);
		KaItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(this, 0);
	}
	
}
