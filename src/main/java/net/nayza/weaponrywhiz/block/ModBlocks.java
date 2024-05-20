package net.nayza.weaponrywhiz.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nayza.weaponrywhiz.WeaponryWhiz;
import net.nayza.weaponrywhiz.block.custom.ModFlammablePlanksBlock;
import net.nayza.weaponrywhiz.block.custom.ModFlammableRotatedPillarBlock;
import net.nayza.weaponrywhiz.item.ModCreativeModTab;
import net.nayza.weaponrywhiz.item.ModItems;

import java.util.function.Supplier;
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WeaponryWhiz.MOD_ID);

    //Blocks created
    /*=================================BLOCK WOOD=================================*/
    //lavender lullwood
    public static final RegistryObject<Block> LAVENDER_LULLWOOD = registerBlock("lavender_lullwood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);

    public static final RegistryObject<Block> STRIPPED_LAVENDER_LULLWOOD = registerBlock("stripped_lavender_lullwood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);

    public static final RegistryObject<Block> LAVENDER_LULLWOOD_WOOD = registerBlock("lavender_lullwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);

    public static final RegistryObject<Block> STRIPPED_LAVENDER_LULLWOOD_WOOD = registerBlock("stripped_lavender_lullwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);

    public static final RegistryObject<Block> LAVENDER_LULLWOOD_PLANKS = registerBlock("lavender_lullwood_planks",
            () -> new ModFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),
            ModCreativeModTab.WEAPONRY_WHIZ_BLOCK_TAB);

    /*=================================END BLOCK WOOD=================================*/

    /*=================================BLOCK LEAVES=================================*/
    //lavender lullwood leaves
    /*=================================END BLOCK LEAVES=================================*/




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
