package fr.kallium.kamod.items.other;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.util.References;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KaCd extends ItemRecord implements IHasModel{

	public KaCd(String name, CreativeTabs tab, SoundEvent soundIn) {
		super(name, soundIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		kaItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Kallium.proxy.registerItemRenderer(this, 0);

	}
	
	@SideOnly(Side.CLIENT)
	public String getRecordTitle()
	{
	    return "ModTutorial - " + this.getRecordTitle();
	}
	
	public ResourceLocation getRecordResource(String name)
    {
        return new ResourceLocation(References.MODID + name);
    }

}
