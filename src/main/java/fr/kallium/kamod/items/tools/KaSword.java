package fr.kallium.kamod.items.tools;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

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
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
		
		EntityPlayer player = Minecraft.getMinecraft().player;
		
		if(!Minecraft.getMinecraft().isGamePaused()) {
			player.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(100);
		}

	}
}
