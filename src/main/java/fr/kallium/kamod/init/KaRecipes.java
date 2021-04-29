package fr.kallium.kamod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class KaRecipes {
	
	
	public static KaRecipes instance = new KaRecipes();
	
	public static void init() {
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(KaItems.purified_flesh), 2);
		GameRegistry.addSmelting(KaBlocks.kallium_ore, new ItemStack(KaItems.kallium, 1, 0), 2F);
		GameRegistry.addSmelting(KaBlocks.argonite_ore, new ItemStack(KaItems.argonite, 1, 0), 2F);
		GameRegistry.addSmelting(KaBlocks.galene_ore, new ItemStack(KaItems.galene, 1, 0), 2F);
		GameRegistry.addSmelting(KaBlocks.bismuth_ore, new ItemStack(KaItems.bismuth, 1, 0), 2F);
		

	}
}