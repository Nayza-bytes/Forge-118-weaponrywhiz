package net.nayza.weaponrywhiz;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.nayza.weaponrywhiz.block.ModBlocks;
import net.nayza.weaponrywhiz.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WeaponryWhiz.MOD_ID)
public class WeaponryWhiz
{
    // Directly reference a log4j logger.
    public static final String MOD_ID = "weaponrywhiz";
    private static final Logger LOGGER = LogManager.getLogger();


    public WeaponryWhiz() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //REGISTRATION OF CLASS
        ModBlocks.register(eventBus);
        ModItems.register(eventBus);


        eventBus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
