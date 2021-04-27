package fr.kallium.kamod.init;

import java.util.ArrayList;
import java.util.List;

import fr.kallium.kamod.items.KaItemFood;
import fr.kallium.kamod.items.KaSwitchMorpher;
import fr.kallium.kamod.items.kaItem;
import fr.kallium.kamod.util.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = References.MODID)
public class kaItems {
	
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	//Armor Material
	public static final ArmorMaterial kallium_armor = EnumHelper.addArmorMaterial("armor_kallium", ":kallium", 100, new int[] {15, 21, 20, }, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);
	
	//Kallium
	public static final Item kallium = new kaItem("kallium", CreativeTabs.MISC);
		
	//Argoite
	public static final Item argonite = new kaItem("argonite", CreativeTabs.MISC);
	
	//Bismuth
	public static final Item bismuth = new kaItem("bismuth", CreativeTabs.MISC);
		
	//Galene
	public static final Item galene = new kaItem("galene", CreativeTabs.MISC);
		
	//Atlas
	public static final Item atlas = new kaItem("atlas", CreativeTabs.MISC);
		
	//Foods
	public static final Item purified_flesh = new KaItemFood("purified_flesh", CreativeTabs.FOOD, 6, 10, true);
		
	//Other
	public static final Item switch_morpher = new KaSwitchMorpher("switch_morpher", CreativeTabs.FOOD);
	
	}