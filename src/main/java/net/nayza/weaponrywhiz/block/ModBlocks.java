package net.nayza.weaponrywhiz.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nayza.weaponrywhiz.WeaponryWhiz;
import net.nayza.weaponrywhiz.util.ModCreativeModTab;
import net.nayza.weaponrywhiz.item.ModItems;

import java.util.function.Supplier;
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WeaponryWhiz.MOD_ID);

    //Blocks created
    /*=================================BLOCK WOOD=================================*/
    public static final RegistryObject<Block> LAVENDER_LULLWOOD = registerBlock("lavender_lullwood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> STRIPPED_LAVENDER_LULLWOOD = registerBlock("stripped_lavender_lullwood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).sound(SoundType.WOOD)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> LAVENDER_LULLWOOD_WOOD = registerBlock("lavender_lullwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> STRIPPED_LAVENDER_LULLWOOD_WOOD = registerBlock("stripped_lavender_lullwood_wood", () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).sound(SoundType.WOOD)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> LAVENDER_LULLWOOD_PLANKS = registerBlock("lavender_lullwood_planks", () -> new ModFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> LAVENDER_LULLWOOD_STAIRS = registerBlock("lavender_lullwood_stairs", () -> new StairBlock(() -> ModBlocks.LAVENDER_LULLWOOD_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> LAVENDER_LULLWOOD_SLABS = registerBlock("lavender_lullwood_slabs", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    /*=================================BLOCK STONES=================================*/
    public static final RegistryObject<Block> VIOLET_STONE = registerBlock("ethereal_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.2f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> VIOLET_SMOOTH_STONE = registerBlock("ethereal_smooth_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.2f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> VIOLET_STONE_BRICK = registerBlock("ethereal_stone_brick", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.2f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> VIOLET_STONE_CHISELED = registerBlock("ethereal_chiseled_stone", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(2.2f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> VIOLET_STONE_PILLAR = registerBlock("ethereal_stone_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2.2f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> VIOLET_STONE_BRICk_STAIRS = registerBlock("ethereal_stone_brick_stairs", () -> new StairBlock(() -> ModBlocks.VIOLET_STONE_BRICK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(2.2f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    public static final RegistryObject<Block> VIOLET_STONE_BRICk_SLABS = registerBlock("ethereal_stone_brick_slabs", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(2.2f, 6f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);
    /*=================================BLOCK ORES=================================*/





    //function to create the blocks
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    //Function to make the block item
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
