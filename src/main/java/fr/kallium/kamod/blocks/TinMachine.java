package fr.kallium.kamod.blocks;

import fr.kallium.kamod.Kallium;
import fr.kallium.kamod.init.KaBlocks;
import fr.kallium.kamod.init.KaItems;
import fr.kallium.kamod.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TinMachine extends Block implements IHasModel{

	public TinMachine(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3);
		setCreativeTab(Kallium.KalliumTab);
		setSoundType(SoundType.METAL);
		KaBlocks.BLOCKS.add(this);
		KaItems.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}

	@Override
	public void registerModels() {
		
		Kallium.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
		
	}
	
	
}
