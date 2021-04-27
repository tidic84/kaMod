package fr.kallium.kamod.blocks;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.KaBlocks;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AcceleratorBlock extends Block implements IHasModel{

	public AcceleratorBlock(String name, Material materialIn, int hardness, CreativeTabs tab) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setCreativeTab(tab);
		KaBlocks.BLOCKS.add(this);
		kaItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
		
	}

	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
		
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		super.onEntityWalk(worldIn, pos, entityIn);
		
		EntityLivingBase playerIn = Minecraft.getMinecraft().player;
		
		if(!Minecraft.getMinecraft().isGamePaused()) {
			playerIn.addPotionEffect(new PotionEffect(MobEffects.SPEED, 20*3, 1));
		
		}
		
	}

}