package com.chefmooon.genshindelight.common.registry.fabric;

import com.chefmooon.genshindelight.common.FoodValues;
import com.chefmooon.genshindelight.common.item.fabric.ModConsumableItemNameBlockItemImpl;
import com.chefmooon.genshindelight.common.registry.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;

import static com.chefmooon.genshindelight.common.registry.ModItems.*;

public class ModItemsImpl {

    // Crop Like Things
    public static final Item BERRY = registerItemWithTab(ModItems.BERRY,
            new ModConsumableItemNameBlockItemImpl(ModBlocksImpl.BERRY.get(), basicItem()));
    public static final Item WILD_BERRY = registerItemWithTab(ModItems.WILD_BERRY, new BlockItem(ModBlocksImpl.WILD_BERRY.get(), basicItem()));
    public static final Item CALLA_LILY = registerItemWithTab(ModItems.CALLA_LILY, new BlockItem(ModBlocksImpl.CALLA_LILY.get(), basicItem()));
    public static final Item MATASUKE = registerItemWithTab(ModItems.MATASUKE, new BlockItem(ModBlocksImpl.MATASUKE.get(), basicItem()));
    public static final Item MINT = registerItemWithTab(ModItems.MINT, new BlockItem(ModBlocksImpl.MINT.get(), basicItem()));
    public static final Item RADISH = registerItemWithTab(ModItems.RADISH, new BlockItem(ModBlocksImpl.RADISH.get(), basicItem()));
    public static final Item SMALL_LAMP_GRASS = registerItemWithTab(ModItems.SMALL_LAMP_GRASS, new BlockItem(ModBlocksImpl.SMALL_LAMP_GRASS.get(), basicItem()));
    public static final Item WILD_LAMP_GRASS = registerItemWithTab(ModItems.WILD_LAMP_GRASS, new BlockItem(ModBlocksImpl.WILD_LAMP_GRASS.get(), basicItem()));
    public static final Item SNAPDRAGON = registerItemWithTab(ModItems.SNAPDRAGON, new BlockItem(ModBlocksImpl.SNAPDRAGON.get(), basicItem()));
    public static final Item SWEET_FLOWER = registerItemWithTab(ModItems.SWEET_FLOWER, new BlockItem(ModBlocksImpl.SWEET_FLOWER.get(), basicItem()));

    // Ingredients
    public static final Item BUTTER = registerItemWithTab(ModItems.BUTTER, new Item(basicItem()));
    public static final Item CHEESE = registerItemWithTab(ModItems.CHEESE, new Item(basicItem()));
    public static final Item CRAB = registerItemWithTab(ModItems.CRAB, new Item(basicItem()));
    public static final Item CRAB_ROE = registerItemWithTab(ModItems.CRAB_ROE, new Item(basicItem()));
    public static final Item CREAM = registerItemWithTab(ModItems.CREAM, new Item(basicItem()));
    public static final Item FLOUR = registerItemWithTab(ModItems.FLOUR, new Item(basicItem()));
    public static final Item PEPPER = registerItemWithTab(ModItems.PEPPER, new Item(basicItem()));
    public static final Item PINECONE = registerItemWithTab(ModItems.PINECONE, new Item(basicItem()));
    public static final Item SALT = registerItemWithTab(ModItems.SALT, new Item(basicItem()));
    public static final Item SMOKED_FOWL = registerItemWithTab(ModItems.SMOKED_FOWL, new Item(basicItem()));
    public static final Item SUNSETTIAS = registerItemWithTab(ModItems.SUNSETTIAS, new Item(basicItem()));

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
    public static final Item STEAK = registerItemWithTab(ModItems.STEAK, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item SUNSHINE_SPRAT = registerItemWithTab(ModItems.SUNSHINE_SPRAT, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item SWEET_MADAME = registerItemWithTab(ModItems.SWEET_MADAME, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item TEYVAT_FRIED_EGG = registerItemWithTab(ModItems.TEYVAT_FRIED_EGG, new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));

    public static final Item MUSHROOM_PIZZA = registerItemWithTab(ModItems.MUSHROOM_PIZZA,
            new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item STICKY_HONEY_ROAST = registerItemWithTab(ModItems.STICKY_HONEY_ROAST,
            new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));
    public static final Item TEA_BREAK_PANCAKE = registerItemWithTab(ModItems.TEA_BREAK_PANCAKE,
            new ConsumableItem(basicConsumableItem(FoodValues.BASIC)));

    // Food Block Item
    public static final Item MUSHROOM_PIZZA_BLOCK = registerItemWithTab(ModItems.MUSHROOM_PIZZA_BLOCK,
            new BlockItem(ModBlocksImpl.MUSHROOM_PIZZA_BLOCK.get(), noStack()));
    public static final Item STICKY_HONEY_ROAST_BLOCK = registerItemWithTab(ModItems.STICKY_HONEY_ROAST_BLOCK,
            new BlockItem(ModBlocksImpl.STICKY_HONEY_ROAST_BLOCK.get(), noStack()));
    public static final Item TEA_BREAK_PANCAKE_BLOCK = registerItemWithTab(ModItems.TEA_BREAK_PANCAKE_BLOCK,
            new BlockItem(ModBlocksImpl.TEA_BREAK_PANCAKE_BLOCK.get(), noStack()));

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
