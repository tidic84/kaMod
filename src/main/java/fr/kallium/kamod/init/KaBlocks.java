package fr.kallium.kamod.init;

import java.util.ArrayList;
import java.util.List;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.blocks.DiscoBlock;
import fr.kallium.kamod.blocks.KaBlock;
import fr.kallium.kamod.blocks.KaOre;
import fr.kallium.kamod.blocks.TinMachine;
import fr.kallium.kamod.util.References;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = References.MODID)
public class KaBlocks {
	
	public static List<Block> BLOCKS = new ArrayList<Block>();

		//Block de Minerais
		public static final Block kallium_block = new KaBlock("kallium_block", Material.ROCK, SoundType.STONE, 5, Kallium.KalliumTab);
		public static final Block argonite_block = new KaBlock("argonite_block", Material.ROCK, SoundType.STONE, 5, Kallium.KalliumTab);
		public static final Block bismuth_block = new KaBlock("bismuth_block", Material.ROCK, SoundType.STONE, 5, Kallium.KalliumTab);
		public static final Block galene_block = new KaBlock("galene_block", Material.ROCK, SoundType.STONE, 5, Kallium.KalliumTab);
		public static final Block atlas_block = new KaBlock("atlas_block", Material.ROCK, SoundType.STONE, 5, Kallium.KalliumTab);
		public static final Block aluminium_block = new KaBlock("aluminium_block", Material.ROCK, SoundType.METAL, 2, Kallium.KalliumTab);

		
		//Minerais
		public static final Block kallium_ore = new KaOre("kallium_ore", 3, Kallium.KalliumTab);
		public static final Block argonite_ore = new KaOre("argonite_ore", 3, Kallium.KalliumTab);
		public static final Block bismuth_ore = new KaOre("bismuth_ore", 3, Kallium.KalliumTab);
		public static final Block galene_ore = new KaOre("galene_ore", 3, Kallium.KalliumTab);
		public static final Block uranium_ore = new KaOre("uranium_ore", 3, Kallium.KalliumTab);
		public static final Block aluminium_ore = new KaOre("aluminium_ore", 2, Kallium.KalliumTab);

		
		//Autres
		public static final Block disco_block = new DiscoBlock("disco_block", Material.ROCK, 5, Kallium.KalliumTab);
		public static final Block leather_block = new KaBlock("leather_block", Material.ROCK, SoundType.CLOTH, 3, Kallium.KalliumTab);
		public static final Block tin_machine = new TinMachine("tin_machine", Material.IRON);
		
		
}