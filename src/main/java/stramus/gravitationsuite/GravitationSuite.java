package stramus.gravitationsuite;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import stramus.gravitationsuite.proxy.CommonProxy;
import stramus.gravitationsuite.tabs.GravitationSuiteTab;

@Mod(modid = GravitationSuite.MODID, name = GravitationSuite.NAME, version = GravitationSuite.VERSION)
public class GravitationSuite {
    public static final String MODID = "fwagravitationsuite";
    public static final String NAME = "Gravitation Suite";
    public static final String VERSION = "1.0";

   // public static final GravitationSuiteTab gravitationsuitetab = new GravitationSuiteTab("gravitationsuitetab");

    @SidedProxy(clientSide = "stramus.gravitationsuite.proxy.ClientProxy", serverSide = "stramus.gravitationsuite.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static GravitationSuite instance;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }
}
