package fr.kallium.kamod;

import fr.kallium.kamod.init.KaBlocks;
import fr.kallium.kamod.init.KaRecipes;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.proxy.ServerProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MC_VERSION)
public class Kallium {

	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY, modId = References.MODID)
    public static ServerProxy proxy;
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
    	KaBlocks.init();
    	kaItems.init();
    	KaRecipes.instance.init();
    }

    @EventHandler
	public void init(FMLInitializationEvent event) {
    	proxy.register();
    }
    
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) {
    	
    	
    }
}
