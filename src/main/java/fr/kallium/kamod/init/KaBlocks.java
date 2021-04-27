package fr.kallium.kamod.init;

import java.util.ArrayList;
import java.util.List;

import fr.kallium.kamod.blocks.KaBlock;
import fr.kallium.kamod.blocks.KaOre;
import fr.kallium.kamod.util.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = References.MODID)
public class KaBlocks {
	
	public static List<Block> BLOCKS = new ArrayList<Block>();

		//Block de Minerais
		public static final Block kallium_block = new KaBlock("kallium_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		public static final Block argonite_block = new KaBlock("argonite_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		public static final Block bismuth_block = new KaBlock("bismuth_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		public static final Block galene_block = new KaBlock("galene_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		public static final Block atlas_block = new KaBlock("atlas_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);

		
		//Minerais
		public static final Block kallium_ore = new KaOre("kallium_ore", 3, CreativeTabs.BUILDING_BLOCKS);
		public static final Block argonite_ore = new KaOre("argonite_ore", 3, CreativeTabs.BUILDING_BLOCKS);
		public static final Block bismuth_ore = new KaOre("bismuth_ore", 3, CreativeTabs.BUILDING_BLOCKS);
		public static final Block galene_ore = new KaOre("galene_ore", 3, CreativeTabs.BUILDING_BLOCKS);
		public static final Block uranium_ore = new KaOre("uranium_ore", 3, CreativeTabs.BUILDING_BLOCKS);

		
		//Autres
		public static final Block chelou_block = new KaBlock("chelou_block", Material.ROCK, 5, CreativeTabs.BUILDING_BLOCKS);
		public static final Block leather_block = new KaBlock("leather_block", Material.ANVIL, 3, CreativeTabs.BUILDING_BLOCKS);

}
