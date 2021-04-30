package fr.kallium.kamod.util;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class ResetHitCooldown {
	
	protected final double ATTACK_SPEED = 100.0D;
	 
	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerLoggedInEvent event) {
		event.player.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(this.ATTACK_SPEED);
	}
	 
	@SubscribeEvent
	public void onPlayerRespawn(PlayerRespawnEvent event) {
		event.player.getEntityAttribute(SharedMonsterAttributes.ATTACK_SPEED).setBaseValue(this.ATTACK_SPEED);
	}

}
