package wdns3dnm.wdns3dnm;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {
    public static final Logger LOGGER = WDNs3DNM.LOGGER;
    public static final String MOD_ID = WDNs3DNM.MOD_ID;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll
                (
                        ItemList.shuriken = new Item(new Item.Properties().group(ItemGroup.COMBAT).maxDamage(50)).setRegistryName(location("windmill_shuriken"))


                                );

    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(MOD_ID, name);


    }
}