package fr.kallium.kamod.util.handlers;

import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandlers {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(kaItems.ITEMS.toArray(new Item[0]));
		
	}

	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for(Item item : kaItems.ITEMS) {
			
			if (item instanceof IHasModel) {
				
				((IHasModel)item).registerModels();
			}
		}
	}
	
	public static void preInitRegistries() {
		
	}
	
	public static void initRegistries() {
		
	}
}