package fr.kallium.kamod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends ServerProxy{

	@Override
	public void registerItemRenderer(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new  ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
	
	@Override
	public void registerVarientRenderer(Item item, int meta, String filenamme, String id) {
		super.registerVarientRenderer(item, meta, filenamme, id);
	}
	
	@Override
	public void registerEntityRenderers() {
		super.registerEntityRenderers();
	}
	
	@Override
	public void preInit() {
		super.preInit();
	}
}