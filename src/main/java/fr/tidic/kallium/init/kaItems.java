package fr.tidic.kallium.init;

import fr.tidic.kallium.References;
import fr.tidic.kallium.items.KaItemFood;
import fr.tidic.kallium.items.KaSwitchMorpher;
import fr.tidic.kallium.items.kaItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class kaItems {
	
	public static Item kallium, argonite, bismuth, galene, atlas, purified_flesh, switch_morpher;
	
	public static void init() {
		//Kallium
		kallium = new kaItem("kallium", CreativeTabs.MISC);
		
		//Argoite
		argonite = new kaItem("argonite", CreativeTabs.MISC);
		
		//Bismuth
		bismuth = new kaItem("bismuth", CreativeTabs.MISC);
		
		//Galene
		galene = new kaItem("galene", CreativeTabs.MISC);
		
		//Atlas
		atlas = new kaItem("atlas", CreativeTabs.MISC);
		
		//Foods
		purified_flesh = new KaItemFood("purified_flesh", CreativeTabs.FOOD, 6, 10, true);
		
		//Other
		switch_morpher = new KaSwitchMorpher("switch_morpher", CreativeTabs.FOOD);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(kallium, argonite, bismuth, galene, atlas, purified_flesh, switch_morpher);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(kallium);
		registerRender(argonite);
		registerRender(bismuth);
		registerRender(galene);
		registerRender(atlas);
		registerRender(purified_flesh);
		registerRender(switch_morpher);
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
