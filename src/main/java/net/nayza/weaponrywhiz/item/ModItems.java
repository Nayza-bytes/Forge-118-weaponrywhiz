package net.nayza.weaponrywhiz.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.nayza.weaponrywhiz.WeaponryWhiz;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WeaponryWhiz.MOD_ID);

    /*=================================BLOCK ITEMS=================================*/

    /*=================================END BLOCK ITEMS=================================*/

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
