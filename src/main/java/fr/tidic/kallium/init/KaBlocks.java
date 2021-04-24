package fr.tidic.kallium.init;

import fr.kallium.kamod.References;
import fr.tidic.kallium.blocks.KaBlock;
import fr.tidic.kallium.blocks.KaOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class KaBlocks {
	
	public static Block kallium_block, argonite_block, bismuth_block, galene_block, atlas_block, kallium_ore, argonite_ore, bismuth_ore, galene_ore;
	
	public static void init() {
		kallium_block = new KaBlock("kallium_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		argonite_block = new KaBlock("argonite_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		bismuth_block = new KaBlock("bismuth_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		galene_block = new KaBlock("galene_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		atlas_block = new KaBlock("atlas_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		
		kallium_ore = new KaOre("kallium_ore", 3, CreativeTabs.BUILDING_BLOCKS);
		argonite_ore = new KaOre("argonite_ore", 3, CreativeTabs.BUILDING_BLOCKS);
		bismuth_ore = new KaOre("bismuth_ore", 3, CreativeTabs.BUILDING_BLOCKS);
		galene_ore = new KaOre("galene_ore", 3, CreativeTabs.BUILDING_BLOCKS);
		

	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(kallium_block, argonite_block, bismuth_block, galene_block, atlas_block, kallium_ore, argonite_ore, bismuth_ore, galene_ore);
	}
	
	@SubscribeEvent
	public static void registryItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new ItemBlock(kallium_block).setRegistryName(kallium_block.getRegistryName()),
				new ItemBlock(argonite_block).setRegistryName(argonite_block.getRegistryName()),
				new ItemBlock(bismuth_block).setRegistryName(bismuth_block.getRegistryName()),
				new ItemBlock(galene_block).setRegistryName(galene_block.getRegistryName()),
				new ItemBlock(atlas_block).setRegistryName(atlas_block.getRegistryName()),
				
				new ItemBlock(kallium_ore).setRegistryName(kallium_ore.getRegistryName()),
				new ItemBlock(argonite_ore).setRegistryName(argonite_ore.getRegistryName()),
				new ItemBlock(bismuth_ore).setRegistryName(bismuth_ore.getRegistryName()),
				new ItemBlock(galene_ore).setRegistryName(galene_ore.getRegistryName())
				);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(kallium_block));
		registerRender(Item.getItemFromBlock(argonite_block));
		registerRender(Item.getItemFromBlock(bismuth_block));
		registerRender(Item.getItemFromBlock(galene_block));
		registerRender(Item.getItemFromBlock(atlas_block));
		registerRender(Item.getItemFromBlock(kallium_ore));
		registerRender(Item.getItemFromBlock(argonite_ore));
		registerRender(Item.getItemFromBlock(bismuth_ore));
		registerRender(Item.getItemFromBlock(galene_ore));
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
		
}
