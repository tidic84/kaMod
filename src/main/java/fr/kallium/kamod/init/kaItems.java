package fr.kallium.kamod.init;

import java.util.ArrayList;
import java.util.List;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.items.KaItemFood;
import fr.kallium.kamod.items.KaSwitchMorpher;
import fr.kallium.kamod.items.kaItem;
import fr.kallium.kamod.items.armor.KaArmor;
import fr.kallium.kamod.items.tools.KaPickaxe;
import fr.kallium.kamod.items.tools.KaSword;
import fr.kallium.kamod.util.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = References.MODID)
public class kaItems {
	
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Tool materials
	public static final ToolMaterial galene_material = EnumHelper.addToolMaterial("galene_material", 4, 2250, 10, 6.0F, 12);
	
	
	
	
	//Armor Material
	public static final ArmorMaterial kallium_armor = EnumHelper.addArmorMaterial("kallium_armor", References.MODID + ":kallium", 100, new int[] {15, 21, 20, 18}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial argonite_armor = EnumHelper.addArmorMaterial("argonite_armor", References.MODID + ":argonite", 100, new int[] {10, 15, 14, 13}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial bismuth_armor = EnumHelper.addArmorMaterial("bismuth_armor", References.MODID + ":bismuth", 100, new int[] {10, 15, 14, 13}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial galene_armor = EnumHelper.addArmorMaterial("galene_armor", References.MODID + ":galene", 100, new int[] {10, 15, 14, 13}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial atlas_armor = EnumHelper.addArmorMaterial("atlas_armor", References.MODID + ":atlas", 100, new int[] {2, 5, 6, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	
	
	//Kallium
	public static final Item kallium = new kaItem("kallium", CreativeTabs.MISC);
	public static final Item kallium_helmet = new KaArmor("kallium_helmet", kallium_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item kallium_chestplate = new KaArmor("kallium_chestplate", kallium_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item kallium_leggings = new KaArmor("kallium_leggings", kallium_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item kallium_boots = new KaArmor("kallium_boots", kallium_armor, 1, EntityEquipmentSlot.FEET);
	
	//Argoite
	public static final Item argonite = new kaItem("argonite", CreativeTabs.MISC);
	public static final Item argonite_helmet = new KaArmor("argonite_helmet", argonite_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item argonite_chestplate = new KaArmor("argonite_chestplate", argonite_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item argonite_leggings = new KaArmor("argonite_leggings", argonite_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item argonite_boots = new KaArmor("argonite_boots", argonite_armor, 1, EntityEquipmentSlot.FEET);
	
	//Bismuth
	public static final Item bismuth = new kaItem("bismuth", CreativeTabs.MISC);
	public static final Item bismuth_helmet = new KaArmor("bismuth_helmet", bismuth_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item bismuth_chestplate = new KaArmor("bismuth_chestplate", bismuth_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item bismuth_leggings = new KaArmor("bismuth_leggings", bismuth_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item bismuth_boots = new KaArmor("bismuth_boots", bismuth_armor, 1, EntityEquipmentSlot.FEET);
	
	//Galene
	public static final Item galene = new kaItem("galene", CreativeTabs.MISC);
	public static final Item galene_helmet = new KaArmor("galene_helmet", galene_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item galene_chestplate = new KaArmor("galene_chestplate", galene_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item galene_leggings = new KaArmor("galene_leggings", galene_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item galene_boots = new KaArmor("galene_boots", galene_armor, 1, EntityEquipmentSlot.FEET);
	public static final Item galene_sword = new KaSword("galene_sword", galene_material, Kallium.KalliumTab );
	public static final Item galene_pickaxe = new KaPickaxe("galene_pickaxe", galene_material, Kallium.KalliumTab );

	
	
	
	//Atlas
	public static final Item atlas = new kaItem("atlas", CreativeTabs.MISC);
	public static final Item atlas_helmet = new KaArmor("atlas_helmet", atlas_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item atlas_chestplate = new KaArmor("atlas_chestplate", atlas_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item atlas_leggings = new KaArmor("atlas_leggings", atlas_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item atlas_boots = new KaArmor("atlas_boots", atlas_armor, 1, EntityEquipmentSlot.FEET);
	
	
	//Foods
	public static final Item purified_flesh = new KaItemFood("purified_flesh", CreativeTabs.FOOD, 6, 10, true);
	public static final Item bean = new KaItemFood("bean", CreativeTabs.FOOD, 1, 5, true);
		
	//Other
	public static final Item switch_morpher = new KaSwitchMorpher("switch_morpher", CreativeTabs.FOOD);
	
	}