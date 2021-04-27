package fr.kallium.kamod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class KaRecipes {
	
	
	public static KaRecipes instance = new KaRecipes();
	
	public static void init() {
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(kaItems.purified_flesh), 2);
		GameRegistry.addSmelting(new ItemStack(KaBlocks.kallium_ore), new ItemStack(Blocks.STONE), 5);
		GameRegistry.addSmelting(new ItemStack(Items.AIR), new ItemStack(KaBlocks.argonite_ore, 1), 5);
		GameRegistry.addSmelting(Items.APPLE, new ItemStack(kaItems.kallium), 5);
		GameRegistry.addSmelting(new ItemStack(kaItems.galene), new ItemStack(KaBlocks.galene_ore), 5);
		GameRegistry.addSmelting(Blocks.STONE, new ItemStack(Items.APPLE, 4), 10f);	
		GameRegistry.addSmelting(kaItems.atlas, new ItemStack(Items.APPLE, 5), 5);;	
		GameRegistry.addSmelting(Blocks.BED, new ItemStack(kaItems.atlas, 5), 5);;	
		GameRegistry.addSmelting(KaBlocks.argonite_block, new ItemStack(Items.APPLE), 4);

	}
}