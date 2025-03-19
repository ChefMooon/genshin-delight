package com.chefmooon.genshindelight.common.registry.fabric;

import com.chefmooon.genshindelight.common.FoodValues;
import com.chefmooon.genshindelight.common.registry.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.function.Supplier;

import static com.chefmooon.genshindelight.common.registry.ModItems.*;

public class ModItemsImpl {

    // Drinks
    public static final Item APPLE_CIDER = registerItemWithTab(ModItems.APPLE_CIDER, new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));
    public static final Item BERRY_MINT_BURST = registerItemWithTab(ModItems.BERRY_MINT_BURST, new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));
    public static final Item FRUITS_OF_THE_FISTIVAL = registerItemWithTab(ModItems.FRUITS_OF_THE_FISTIVAL, new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));
    public static final Item SPARKLING_BERRY_JUICE = registerItemWithTab(ModItems.SPARKLING_BERRY_JUICE, new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));
    public static final Item WOLFHOOK_JUICE = registerItemWithTab(ModItems.WOLFHOOK_JUICE, new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));

    // Food
    public static final Item PILE_EM_UP = registerItemWithTab(ModItems.PILE_EM_UP, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item ADVENTURERS_BREAKFAST_SANDWICH = registerItemWithTab(ModItems.ADVENTURERS_BREAKFAST_SANDWICH, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item APPLE_ROLY_POLY = registerItemWithTab(ModItems.APPLE_ROLY_POLY, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item BARBATOS_RATATOUILLE = registerItemWithTab(ModItems.BARBATOS_RATATOUILLE, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item CALLA_LILY_SEAFOOD_SOUP = registerItemWithTab(ModItems.CALLA_LILY_SEAFOOD_SOUP, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item CHICKEN_MUSHROOM_SKEWER = registerItemWithTab(ModItems.CHICKEN_MUSHROOM_SKEWER, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item COLD_CUT_PLATTER = registerItemWithTab(ModItems.COLD_CUT_PLATTER, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item CRAB_HAM_VEGGIE_BAKE = registerItemWithTab(ModItems.CRAB_HAM_VEGGIE_BAKE, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item CREAM_STEW = registerItemWithTab(ModItems.CREAM_STEW, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item CRISPY_POTATO_SHRIMP_PLATTER = registerItemWithTab(ModItems.CRISPY_POTATO_SHRIMP_PLATTER, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item FISHERMANS_TOAST = registerItemWithTab(ModItems.FISHERMANS_TOAST, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item FLAMING_RED_BOLOGNESE = registerItemWithTab(ModItems.FLAMING_RED_BOLOGNESE, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item GOULASH = registerItemWithTab(ModItems.GOULASH, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item MEATNADO = registerItemWithTab(ModItems.MEATNADO, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item MINT_JELLY = registerItemWithTab(ModItems.MINT_JELLY, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item MONDSTADT_GRILLED_FISH = registerItemWithTab(ModItems.MONDSTADT_GRILLED_FISH, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item MONDSTADT_HASH_BROWN = registerItemWithTab(ModItems.MONDSTADT_HASH_BROWN, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item MOON_PIE = registerItemWithTab(ModItems.MOON_PIE, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item NORTHERN_APPLE_STEW = registerItemWithTab(ModItems.NORTHERN_APPLE_STEW, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item RADISH_VEGGIE_SOUP = registerItemWithTab(ModItems.RADISH_VEGGIE_SOUP, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item SATISFYING_SALAD = registerItemWithTab(ModItems.SATISFYING_SALAD, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item SAUTEED_MATSUTAKE = registerItemWithTab(ModItems.SAUTEED_MATSUTAKE, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item SUNSHINE_SPRAT = registerItemWithTab(ModItems.SUNSHINE_SPRAT, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item SWEET_MADAME = registerItemWithTab(ModItems.SWEET_MADAME, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item TEA_BREAK_PANCAKE = registerItemWithTab(ModItems.TEA_BREAK_PANCAKE, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item TEYVAT_FRIED_EGG = registerItemWithTab(ModItems.TEYVAT_FRIED_EGG, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));

    // Food Block Item
    public static final Item MUSHROOM_PIZZA = registerItemWithTab(ModItems.MUSHROOM_PIZZA,
            new BlockItem(ModBlocksImpl.MUSHROOM_PIZZA.get(), noStack()));
    public static final Item STICKY_HONEY_ROAST = registerItemWithTab(ModItems.STICKY_HONEY_ROAST,
            new BlockItem(ModBlocksImpl.STICKY_HONEY_ROAST.get(), noStack()));

    public static Item registerItemWithTab(final ResourceLocation location, final Item supplier) {
        Registry.register(BuiltInRegistries.ITEM, location, supplier);
        ItemGroupEvents.modifyEntriesEvent(ModCreativeTabsImpl.ITEM_GROUP).register(entries -> entries.accept(supplier));
        return supplier;
    }

    public static Item registerItem(final ResourceLocation location, final Item supplier) {
        Registry.register(BuiltInRegistries.ITEM, location, supplier);
        return supplier;
    }

    public static void register() {
    }
}
