package net.nayza.weaponrywhiz.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
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

    public static final RegistryObject<Item> PURPLEFULL_STONE_INGOT = ITEMS.register("purplefull_stone_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.WEAPONRY_WHIZ_ITEM_TAB)));

    /*=================================END INGOTS ITEMS=================================*/
    /*=================================PURPLEFULL STONE TOOLSET=================================*/

    public static final RegistryObject<Item> PURPLEFULL_STONE_SWORD = ITEMS.register("purplefull_stone_sword",
            () -> new SwordItem(ModTiers.PURPLEFULL_TIER, 1, 0.4f, new Item.Properties().tab(ModCreativeModTab.WEAPONRY_WHIZ_ITEM_TAB)));

    /*=================================END PURPLEFULL STONE TOOLSET=================================*/



    //TODO: Add the PIXILITE TOOLS

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
