package fr.kallium.kamod.items.tools;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.items.kaItem;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class KaSword extends ItemSword implements IHasModel{

	public KaSword(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
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
