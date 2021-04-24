package fr.tidic.kallium;

import fr.tidic.kallium.init.KaBlocks;
import fr.tidic.kallium.init.KaRecipes;
import fr.tidic.kallium.init.kaItems;
import fr.tidic.kallium.proxy.ServerProxy;
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
