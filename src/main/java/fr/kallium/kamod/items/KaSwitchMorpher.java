package fr.kallium.kamod.items;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.playerHelper.KaPlayerHelper;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class KaSwitchMorpher extends Item implements IHasModel{
	
	
	public KaSwitchMorpher(String name, CreativeTabs tab) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		kaItems.ITEMS.add(this);

	}
	
	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(this, 0);
	}

	@SubscribeEvent
	public static void TickEvent(PlayerTickEvent player, EntityPlayer playerIn) {
    	
		if(player != null) {
			KaPlayerHelper.setPlayerSize(playerIn, 0.3F, 0.3F, 0.5F);
		}
    	
	/**ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		KaPlayerHelper.setPlayerSize(playerIn, 0.6F / 2, 1.8F / 2, playerIn.getDefaultEyeHeight() / 2);
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }**/
}
}
