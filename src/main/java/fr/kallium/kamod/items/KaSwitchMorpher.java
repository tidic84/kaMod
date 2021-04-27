package fr.kallium.kamod.items;

import fr.kallium.kamod.playerHelper.KaPlayerHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class KaSwitchMorpher extends Item{
	
	
	public KaSwitchMorpher(String name, CreativeTabs tab) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
	
	@SubscribeEvent
	public static void TickEvent(PlayerTickEvent player, EntityPlayer playerIn) {
    	
		{if(player != null) {
			KaPlayerHelper.setPlayerSize(playerIn, 0.3F, 0.3F, 0.5F);
		}
    	}
	/**ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		KaPlayerHelper.setPlayerSize(playerIn, 0.6F / 2, 1.8F / 2, playerIn.getDefaultEyeHeight() / 2);
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }*/
}
}
