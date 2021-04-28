package fr.kallium.kamod;

import java.util.logging.Logger;

import fr.kallium.kamod.init.KaBlocks;
import fr.kallium.kamod.init.KaRecipes;
import fr.kallium.kamod.init.kaItems;
import fr.kallium.kamod.proxy.ServerProxy;
import fr.kallium.kamod.util.References;
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
    
	public static org.apache.logging.log4j.Logger logger;
	
    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
    	
    	logger = event.getModLog();
    	
    	proxy.preInit();

    }

    @EventHandler
	public void init(FMLInitializationEvent event) {
    }
    
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) {
    	
    	KaRecipes.instance.init();

    	
    	
    	
    	
    	
    }
}