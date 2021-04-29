package fr.kallium.kamod.items.armor;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.tabs.KalliumTab;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.client.particle.ParticleDrip.WaterFactory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class KaArmor extends ItemArmor implements IHasModel {

	public KaArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Kallium.KalliumTab);
		kaItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(this,  0);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		super.onArmorTick(world, player, itemStack);
		
		
		//Atlas
		if(player.inventory.armorInventory.get(0) != null && player.inventory.armorInventory.get(1) != null && player.inventory.armorInventory.get(2) != null && player.inventory.armorInventory.get(3) != null) {
			
			ItemStack helmet = player.inventory.armorInventory.get(3);
			ItemStack chestplate = player.inventory.armorInventory.get(2);
			ItemStack leggings = player.inventory.armorInventory.get(1);
			ItemStack boots = player.inventory.armorInventory.get(0);
			
			if (helmet.getItem() == kaItems.atlas_helmet && chestplate.getItem() == kaItems.atlas_chestplate && leggings.getItem() == kaItems.atlas_leggings && boots.getItem() == kaItems.atlas_boots) {
			
			player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 1, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 3, 1));
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 3, 0));
			player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 20, 0));
		
			if (!player.onGround )
				player.motionY *= 0.70;			

			
			}
			
		}
		
		
	}
	
}
