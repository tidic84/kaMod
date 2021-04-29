package fr.kallium.kamod.items.tools;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.KaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class KaPickaxe extends ItemPickaxe implements IHasModel{

	public KaPickaxe(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
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
