package net.nayza.weaponrywhiz.util;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.nayza.weaponrywhiz.block.ModBlocks;
import net.nayza.weaponrywhiz.item.ModItems;

public class ModCreativeModTab {
    public static final CreativeModeTab WEAPONRY_WHIZ_BLOCK_TAB = new CreativeModeTab("ww_block_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.LAVENDER_LULLWOOD.get());
        }
    };

    public static final CreativeModeTab WEAPONRY_WHIZ_ITEM_TAB = new CreativeModeTab("ww_item_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PIXILITE_INGOT.get());
        }
    };
}
