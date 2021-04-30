package fr.kallium.kamod.init;

import java.util.ArrayList;
import java.util.List;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.items.KaItemFood;
import fr.kallium.kamod.items.KaItem;
import fr.kallium.kamod.items.armor.KaArmor;
import fr.kallium.kamod.items.other.KaCd;
import fr.kallium.kamod.items.other.KaSwitchMorpher;
import fr.kallium.kamod.items.tools.KaAxe;
import fr.kallium.kamod.items.tools.KaPickaxe;
import fr.kallium.kamod.items.tools.KaShovel;
import fr.kallium.kamod.items.tools.KaSword;
import fr.kallium.kamod.util.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = References.MODID)
public class KaItems {
	
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Tool materials
	public static final ToolMaterial galene_material = EnumHelper.addToolMaterial("galene_material", 4, 2250, 10, 6.0F, 12);
	public static final ToolMaterial bismuth_material = EnumHelper.addToolMaterial("bismuth_material", 4, 2250, 10, 6.0F, 12);
	public static final ToolMaterial argonite_material = EnumHelper.addToolMaterial("argonite_material", 4, 2250, 10, 6.0F, 12);
	public static final ToolMaterial kallium_material = EnumHelper.addToolMaterial("kallium_material", 4, 2250, 10, 6.0F, 12);
	
	
	
	
	//Armor Material
	public static final ArmorMaterial kallium_armor = EnumHelper.addArmorMaterial("kallium_armor", References.MODID + ":kallium", 100, new int[] {15, 21, 20, 18}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial argonite_armor = EnumHelper.addArmorMaterial("argonite_armor", References.MODID + ":argonite", 100, new int[] {10, 15, 14, 13}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial bismuth_armor = EnumHelper.addArmorMaterial("bismuth_armor", References.MODID + ":bismuth", 100, new int[] {10, 15, 14, 13}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial galene_armor = EnumHelper.addArmorMaterial("galene_armor", References.MODID + ":galene", 100, new int[] {10, 15, 14, 13}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	public static final ArmorMaterial atlas_armor = EnumHelper.addArmorMaterial("atlas_armor", References.MODID + ":atlas", 100, new int[] {1, 2, 3, 1}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
    public static final ArmorMaterial invisibility_cloak_armor = EnumHelper.addArmorMaterial("invisibility_cloak_armor", References.MODID + ":invisibility_cloak", 100, new int[] {10, 10, 10, 10}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1.0F);

	
	//Kallium
	public static final Item kallium = new KaItem("kallium", Kallium.KalliumTab);
	public static final Item kallium_helmet = new KaArmor("kallium_helmet", kallium_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item kallium_chestplate = new KaArmor("kallium_chestplate", kallium_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item kallium_leggings = new KaArmor("kallium_leggings", kallium_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item kallium_boots = new KaArmor("kallium_boots", kallium_armor, 1, EntityEquipmentSlot.FEET);
	public static final Item kallium_sword = new KaSword("kallium_sword", kallium_material, Kallium.KalliumTab );
	public static final Item kallium_pickaxe = new KaPickaxe("kallium_pickaxe", kallium_material, Kallium.KalliumTab );
	public static final Item kallium_axe = new KaAxe("kallium_axe", kallium_material, Kallium.KalliumTab );
	public static final Item kallium_shovel = new KaShovel("kallium_shovel", kallium_material, Kallium.KalliumTab );
	
	//Argonite
	public static final Item argonite = new KaItem("argonite", Kallium.KalliumTab);
	public static final Item argonite_helmet = new KaArmor("argonite_helmet", argonite_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item argonite_chestplate = new KaArmor("argonite_chestplate", argonite_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item argonite_leggings = new KaArmor("argonite_leggings", argonite_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item argonite_boots = new KaArmor("argonite_boots", argonite_armor, 1, EntityEquipmentSlot.FEET);
	public static final Item argonite_sword = new KaSword("argonite_sword", argonite_material, Kallium.KalliumTab );
	public static final Item argonite_pickaxe = new KaPickaxe("argonite_pickaxe", argonite_material, Kallium.KalliumTab );
	public static final Item argonite_axe = new KaAxe("argonite_axe", argonite_material, Kallium.KalliumTab );
	public static final Item argonite_shovel = new KaShovel("argonite_shovel", argonite_material, Kallium.KalliumTab );
	
	//Bismuth
	public static final Item bismuth = new KaItem("bismuth", Kallium.KalliumTab);
	public static final Item bismuth_helmet = new KaArmor("bismuth_helmet", bismuth_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item bismuth_chestplate = new KaArmor("bismuth_chestplate", bismuth_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item bismuth_leggings = new KaArmor("bismuth_leggings", bismuth_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item bismuth_boots = new KaArmor("bismuth_boots", bismuth_armor, 1, EntityEquipmentSlot.FEET);
	public static final Item bismuth_sword = new KaSword("bismuth_sword", bismuth_material, Kallium.KalliumTab );
	public static final Item bismuth_pickaxe = new KaPickaxe("bismuth_pickaxe", bismuth_material, Kallium.KalliumTab );
	public static final Item bismuth_axe = new KaAxe("bismuth_axe", bismuth_material, Kallium.KalliumTab );
	public static final Item bismuth_shovel = new KaShovel("bismuth_shovel", bismuth_material, Kallium.KalliumTab );
	
	//Galene
	public static final Item galene = new KaItem("galene", Kallium.KalliumTab);
	public static final Item galene_helmet = new KaArmor("galene_helmet", galene_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item galene_chestplate = new KaArmor("galene_chestplate", galene_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item galene_leggings = new KaArmor("galene_leggings", galene_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item galene_boots = new KaArmor("galene_boots", galene_armor, 1, EntityEquipmentSlot.FEET);
	public static final Item galene_sword = new KaSword("galene_sword", galene_material, Kallium.KalliumTab );
	public static final Item galene_pickaxe = new KaPickaxe("galene_pickaxe", galene_material, Kallium.KalliumTab );
	public static final Item galene_axe = new KaAxe("galene_axe", galene_material, Kallium.KalliumTab );
	public static final Item galene_shovel = new KaShovel("galene_shovel", galene_material, Kallium.KalliumTab );
	
	//Atlas
	public static final Item atlas = new KaItem("atlas", Kallium.KalliumTab);
	public static final Item atlas_helmet = new KaArmor("atlas_helmet", atlas_armor, 1, EntityEquipmentSlot.HEAD);
	public static final Item atlas_chestplate = new KaArmor("atlas_chestplate", atlas_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item atlas_leggings = new KaArmor("atlas_leggings", atlas_armor, 2, EntityEquipmentSlot.LEGS);
	public static final Item atlas_boots = new KaArmor("atlas_boots", atlas_armor, 1, EntityEquipmentSlot.FEET);
	
	//Aluminium
	public static final Item aluminium_ingot = new KaItem("aluminium_ingot", Kallium.KalliumTab);

	
	//Foods
	public static final Item purified_flesh = new KaItemFood("purified_flesh", CreativeTabs.FOOD, 6, 10, true);
	public static final Item bean = new KaItemFood("bean", CreativeTabs.FOOD, 1, 5, true);
		
	//Other
	public static final Item invisibility_cloak = new KaArmor("invisibility_cloak", invisibility_cloak_armor, 1, EntityEquipmentSlot.CHEST);
	public static final Item switch_morpher = new KaSwitchMorpher("switch_morpher", CreativeTabs.FOOD);
	public static final Item cd1 = new KaCd("cd1", Kallium.KalliumTab, new SoundEvent(new ResourceLocation(References.MODID + "cd1")));
	public static final Item tin_can = new KaItem("tin_can",Kallium.KalliumTab);
	public static final Item canned_beans = new KaItem("canned_beans",Kallium.KalliumTab);
	public static final Item canned_carrots = new KaItem("canned_carrots",Kallium.KalliumTab);
	public static final Item canned_potatos = new KaItem("canned_potatos",Kallium.KalliumTab);
	
	
	
	}