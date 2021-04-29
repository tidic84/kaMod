package fr.kallium.kamod.util.handlers;

import fr.kallium.kamod.util.References;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler {
	public static SoundEvent cd1;
	
	public static void registerSounds() {
		cd1 = registerSounds("records.cd1");
	}
	
	private static SoundEvent registerSounds(String name) {
		ResourceLocation location = new ResourceLocation(References.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;

	}
}
