package net.nayza.weaponrywhiz.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    /* VANILLA TIERS FOR REFERENCES
    * public enum Tiers implements Tier {
        WOOD(0, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.of(ItemTags.PLANKS);
        }),
       STONE(1, 131, 4.0F, 1.0F, 5, () -> {
          return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);
       }),
       IRON(2, 250, 6.0F, 2.0F, 14, () -> {
          return Ingredient.of(Items.IRON_INGOT);
       }),
       DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {
          return Ingredient.of(Items.DIAMOND);
       }),
       GOLD(0, 32, 12.0F, 0.0F, 22, () -> {
          return Ingredient.of(Items.GOLD_INGOT);
       }),
       NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {
          return Ingredient.of(Items.NETHERITE_INGOT);
       });

    */

    // =============================START GAME TIER=============================
    // Sharp stone tools tier.
    public static final ForgeTier PURPLEFULL_TIER = new ForgeTier(1, 161, 4.1f, 1.3f, 12,
            BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS));

    // King tools tier
    public static final ForgeTier KING_TIER = new ForgeTier(1, 473, 12.0f, 1.2f, 22,
            BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(Items.GOLD_INGOT));

    // =============================MID GAME TIER=============================

    // =============================END GAME TIER=============================
    // Pixilite Tier
    public static final ForgeTier PIXILITE_TIER = new ForgeTier(5, 3500, 10f, 6f, 15,
            BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.PIXILITE_INGOT.get()));
}
