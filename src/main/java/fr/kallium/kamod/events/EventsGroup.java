package fr.kallium.kamod.events;

import fr.kallium.kamod.init.KaItems;
import fr.kallium.kamod.items.KaItem;
import fr.kallium.kamod.util.ResetHitCooldown;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventsGroup {
	
	@SubscribeEvent
    public void livingFallEvent(LivingFallEvent event){
		
		if (event.getEntityLiving() instanceof EntityPlayer) {
	    EntityPlayer player = Minecraft.getMinecraft().player;
	     
		ItemStack helmet = player.inventory.armorInventory.get(3);
		ItemStack chestplate = player.inventory.armorInventory.get(2);
		ItemStack leggings = player.inventory.armorInventory.get(1);
		ItemStack boots = player.inventory.armorInventory.get(0);
    	System.out.println("Test0");
		
            if (chestplate.getItem() == KaItems.atlas_chestplate) {
                System.out.println("Test1");
                event.setDistance(0F);
            }
        }
    }
}
