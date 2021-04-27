package fr.kallium.kamod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class KaRecipes {
	
	
	public static KaRecipes instance = new KaRecipes();
	
	public static void init() {
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(kaItems.purified_flesh), 2);
		GameRegistry.addSmelting(new ItemStack(KaBlocks.argonite_ore), new ItemStack(kaItems.argonite), 2);
		

	}
}