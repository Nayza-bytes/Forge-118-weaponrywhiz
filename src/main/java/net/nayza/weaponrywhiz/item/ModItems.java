package net.nayza.weaponrywhiz.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nayza.weaponrywhiz.WeaponryWhiz;
import net.nayza.weaponrywhiz.util.ModCreativeModTab;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WeaponryWhiz.MOD_ID);

    /*=================================INGOTS ITEMS=================================*/
    public static final RegistryObject<Item> PIXILITE_INGOT = ITEMS.register("pixilite_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.WEAPONRY_WHIZ_ITEM_TAB)));

    /*=================================END INGOTS ITEMS=================================*/

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
