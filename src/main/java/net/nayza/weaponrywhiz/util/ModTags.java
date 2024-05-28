package net.nayza.weaponrywhiz.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.nayza.weaponrywhiz.WeaponryWhiz;

public class ModTags {
    public static class Block {
        public static final Tags.IOptionalNamedTag<net.minecraft.world.level.block.Block> VIOLET_STONES = tag("violet_stones");

        private static Tags.IOptionalNamedTag<net.minecraft.world.level.block.Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(WeaponryWhiz.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<net.minecraft.world.level.block.Block> forgeTag(String name) {
            return BlockTags.createOptional(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final Tags.IOptionalNamedTag<Item> PIXILITE_INGOT = forgeTag("ingots/pixilite");
        public static final Tags.IOptionalNamedTag<Item> PURPLEFULL_INGOT = forgeTag("ingots/purplefull_stone");

        private static Tags.IOptionalNamedTag<Item> tag(String name) {
            return ItemTags.createOptional(new ResourceLocation(WeaponryWhiz.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> forgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }

    }

}
