package com.chefmooon.genshindelight.common.registry.forge;

import com.chefmooon.genshindelight.Mod;
import com.chefmooon.genshindelight.common.FoodValues;
import com.chefmooon.genshindelight.common.registry.ModItems;
import com.google.common.collect.Sets;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

import static com.chefmooon.genshindelight.common.registry.ModItems.*;

public class ModItemsImpl {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Mod.MOD_ID);
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    // Drinks
    public static final RegistryObject<Item> APPLE_CIDER = registerItemWithTab(ModItems.APPLE_CIDER, () -> new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));
    public static final RegistryObject<Item> BERRY_MINT_BURST = registerItemWithTab(ModItems.BERRY_MINT_BURST, () -> new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));
    public static final RegistryObject<Item> FRUITS_OF_THE_FISTIVAL = registerItemWithTab(ModItems.FRUITS_OF_THE_FISTIVAL, () -> new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));
    public static final RegistryObject<Item> SPARKLING_BERRY_JUICE = registerItemWithTab(ModItems.SPARKLING_BERRY_JUICE, () -> new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));
    public static final RegistryObject<Item> WOLFHOOK_JUICE = registerItemWithTab(ModItems.WOLFHOOK_JUICE, () -> new DrinkableItem(drinkItem(FoodValues.BASIC_DRINK)));

    // Food
    public static final RegistryObject<Item> PILE_EM_UP = registerItemWithTab(ModItems.PILE_EM_UP, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> ADVENTURERS_BREAKFAST_SANDWICH = registerItemWithTab(ModItems.ADVENTURERS_BREAKFAST_SANDWICH, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> APPLE_ROLY_POLY = registerItemWithTab(ModItems.APPLE_ROLY_POLY, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> BARBATOS_RATATOUILLE = registerItemWithTab(ModItems.BARBATOS_RATATOUILLE, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> CALLA_LILY_SEAFOOD_SOUP = registerItemWithTab(ModItems.CALLA_LILY_SEAFOOD_SOUP, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> CHICKEN_MUSHROOM_SKEWER = registerItemWithTab(ModItems.CHICKEN_MUSHROOM_SKEWER, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> COLD_CUT_PLATTER = registerItemWithTab(ModItems.COLD_CUT_PLATTER, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> CRAB_HAM_VEGGIE_BAKE = registerItemWithTab(ModItems.CRAB_HAM_VEGGIE_BAKE, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> CREAM_STEW = registerItemWithTab(ModItems.CREAM_STEW, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> CRISPY_POTATO_SHRIMP_PLATTER = registerItemWithTab(ModItems.CRISPY_POTATO_SHRIMP_PLATTER, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> FISHERMANS_TOAST = registerItemWithTab(ModItems.FISHERMANS_TOAST, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> FLAMING_RED_BOLOGNESE = registerItemWithTab(ModItems.FLAMING_RED_BOLOGNESE, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> GOULASH = registerItemWithTab(ModItems.GOULASH, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> MEATNADO = registerItemWithTab(ModItems.MEATNADO, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> MINT_JELLY = registerItemWithTab(ModItems.MINT_JELLY, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> MONDSTADT_GRILLED_FISH = registerItemWithTab(ModItems.MONDSTADT_GRILLED_FISH, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> MONDSTADT_HASH_BROWN = registerItemWithTab(ModItems.MONDSTADT_HASH_BROWN, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> MOON_PIE = registerItemWithTab(ModItems.MOON_PIE, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> NORTHERN_APPLE_STEW = registerItemWithTab(ModItems.NORTHERN_APPLE_STEW, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> RADISH_VEGGIE_SOUP = registerItemWithTab(ModItems.RADISH_VEGGIE_SOUP, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> SATISFYING_SALAD = registerItemWithTab(ModItems.SATISFYING_SALAD, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> SAUTEED_MATSUTAKE = registerItemWithTab(ModItems.SAUTEED_MATSUTAKE, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> SUNSHINE_SPRAT = registerItemWithTab(ModItems.SUNSHINE_SPRAT, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> SWEET_MADAME = registerItemWithTab(ModItems.SWEET_MADAME, () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> TEYVAT_FRIED_EGG = registerItemWithTab(ModItems.TEYVAT_FRIED_EGG, () -> new Item(basicConsumableItem(FoodValues.BASIC)));

    public static final RegistryObject<Item> MUSHROOM_PIZZA = registerItemWithTab(ModItems.MUSHROOM_PIZZA,
            () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> STICKY_HONEY_ROAST = registerItemWithTab(ModItems.STICKY_HONEY_ROAST,
            () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    public static final RegistryObject<Item> TEA_BREAK_PANCAKE = registerItemWithTab(ModItems.TEA_BREAK_PANCAKE,
            () -> new Item(basicConsumableItem(FoodValues.BASIC)));
    // Food Block Item
    public static final RegistryObject<Item> MUSHROOM_PIZZA_BLOCK = registerItemWithTab(ModItems.MUSHROOM_PIZZA_BLOCK,
            () -> new BlockItem(ModBlocksImpl.MUSHROOM_PIZZA_BLOCK.get(), noStack()));
    public static final RegistryObject<Item> STICKY_HONEY_ROAST_BLOCK = registerItemWithTab(ModItems.STICKY_HONEY_ROAST_BLOCK,
            () -> new BlockItem(ModBlocksImpl.STICKY_HONEY_ROAST_BLOCK.get(), noStack()));
    public static final RegistryObject<Item> TEA_BREAK_PANCAKE_BLOCK = registerItemWithTab(ModItems.TEA_BREAK_PANCAKE_BLOCK,
            () -> new BlockItem(ModBlocksImpl.TEA_BREAK_PANCAKE_BLOCK.get(), noStack()));



    public static RegistryObject<Item> registerItemWithTab(final ResourceLocation location, final Supplier<Item> supplier) {
        RegistryObject<Item> item = ITEMS.register(location.getPath(), supplier);
        CREATIVE_TAB_ITEMS.add(item);
        return item;
    }

    public static RegistryObject<Item> registerItem(final ResourceLocation location, final Supplier<Item> supplier) {
        return ITEMS.register(location.getPath(), supplier);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
