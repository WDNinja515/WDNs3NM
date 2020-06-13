package wdns3dnm.wdns3dnm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



@Mod("examplemod")
public class WDNs3DNM {
    public static WDNs3DNM instance;
    public static final String MOD_ID = "examplemod";
    public static final Logger LOGGER = LogManager.getLogger();
    private final Object StringReader = new Object();

    public WDNs3DNM() {

        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }


    private void setup(final FMLCommonSetupEvent event) {

    }

    private void clientSetup(final FMLClientSetupEvent event) {

    }

    public void onServerStarting(FMLServerStartingEvent event) {
    }


}