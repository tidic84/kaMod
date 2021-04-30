package fr.kallium.kamod;

import fr.kallium.kamod.events.EventsGroup;
import fr.kallium.kamod.init.KaRecipes;
import fr.kallium.kamod.proxy.ServerProxy;
import fr.kallium.kamod.tabs.KalliumTab;
import fr.kallium.kamod.util.References;
import fr.kallium.kamod.util.ResetHitCooldown;
import fr.kallium.kamod.util.handlers.RegistryHandlers;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MC_VERSION)
public class Kallium {

	@Instance
	public static Kallium instance; 
	
	public static final CreativeTabs KalliumTab = new KalliumTab("kallium");
	
	
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
    	RegistryHandlers.initRegistries();
    	MinecraftForge.EVENT_BUS.register(new ResetHitCooldown());

    	MinecraftForge.EVENT_BUS.register(new EventsGroup());
    	
    }
    
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) {
    	
    	KaRecipes.instance.init();
    	
    	
    }
}