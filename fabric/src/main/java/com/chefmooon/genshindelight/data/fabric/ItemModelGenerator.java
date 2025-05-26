package com.chefmooon.genshindelight.data.fabric;

import com.chefmooon.genshindelight.common.registry.fabric.ModItemsImpl;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;

public class ItemModelGenerator {
    private static ItemModelGenerators GENERATOR;
    public static void generateItemModels(ItemModelGenerators itemModelGenerator) {
        GENERATOR = itemModelGenerator;

        generateFlatItem(ModItemsImpl.BERRY);
        generateFlatItem(ModItemsImpl.WILD_BERRY);
        generateFlatItem(ModItemsImpl.CALLA_LILY);
        generateFlatItem(ModItemsImpl.MATASUKE);
        generateFlatItem(ModItemsImpl.MINT);
        generateFlatItem(ModItemsImpl.RADISH);
        generateFlatItem(ModItemsImpl.SMALL_LAMP_GRASS);
        generateFlatItem(ModItemsImpl.WILD_LAMP_GRASS);
        generateFlatItem(ModItemsImpl.SNAPDRAGON);
        generateFlatItem(ModItemsImpl.SWEET_FLOWER);

        generateFlatItem(ModItemsImpl.BUTTER);
        generateFlatItem(ModItemsImpl.CHEESE);
        generateFlatItem(ModItemsImpl.CRAB);
        generateFlatItem(ModItemsImpl.CRAB_ROE);
        generateFlatItem(ModItemsImpl.CREAM);
        generateFlatItem(ModItemsImpl.FLOUR);
        generateFlatItem(ModItemsImpl.PEPPER);
        generateFlatItem(ModItemsImpl.PINECONE);
        generateFlatItem(ModItemsImpl.SALT);
        generateFlatItem(ModItemsImpl.SMOKED_FOWL);
        generateFlatItem(ModItemsImpl.SUNSETTIAS);

        generateFlatItem(ModItemsImpl.APPLE_CIDER);
        generateFlatItem(ModItemsImpl.BERRY_MINT_BURST);
        generateFlatItem(ModItemsImpl.FRUITS_OF_THE_FISTIVAL);
        generateFlatItem(ModItemsImpl.SPARKLING_BERRY_JUICE);
        generateFlatItem(ModItemsImpl.WOLFHOOK_JUICE);

        generateFlatItem(ModItemsImpl.PILE_EM_UP);
        generateFlatItem(ModItemsImpl.ADVENTURERS_BREAKFAST_SANDWICH);
        generateFlatItem(ModItemsImpl.APPLE_ROLY_POLY);
        generateFlatItem(ModItemsImpl.BARBATOS_RATATOUILLE);
        generateFlatItem(ModItemsImpl.CALLA_LILY_SEAFOOD_SOUP);
        GENERATOR.generateFlatItem(ModItemsImpl.CHICKEN_MUSHROOM_SKEWER, ModelTemplates.FLAT_HANDHELD_ITEM);
        generateFlatItem(ModItemsImpl.COLD_CUT_PLATTER);
        generateFlatItem(ModItemsImpl.CRAB_HAM_VEGGIE_BAKE);
        generateFlatItem(ModItemsImpl.CREAM_STEW);
        generateFlatItem(ModItemsImpl.CRISPY_POTATO_SHRIMP_PLATTER);
        generateFlatItem(ModItemsImpl.FISHERMANS_TOAST);
        generateFlatItem(ModItemsImpl.FLAMING_RED_BOLOGNESE);
        generateFlatItem(ModItemsImpl.GOULASH);
        generateFlatItem(ModItemsImpl.MEATNADO);
        generateFlatItem(ModItemsImpl.MINT_JELLY);
        generateFlatItem(ModItemsImpl.MONDSTADT_GRILLED_FISH);
        generateFlatItem(ModItemsImpl.MONDSTADT_HASH_BROWN);
        generateFlatItem(ModItemsImpl.MOON_PIE);
        generateFlatItem(ModItemsImpl.NORTHERN_APPLE_STEW);
        generateFlatItem(ModItemsImpl.RADISH_VEGGIE_SOUP);
        generateFlatItem(ModItemsImpl.SATISFYING_SALAD);
        generateFlatItem(ModItemsImpl.SAUTEED_MATSUTAKE);
        generateFlatItem(ModItemsImpl.STEAK);
        generateFlatItem(ModItemsImpl.SUNSHINE_SPRAT);
        generateFlatItem(ModItemsImpl.SWEET_MADAME);
        generateFlatItem(ModItemsImpl.TEYVAT_FRIED_EGG);

        generateFlatItem(ModItemsImpl.MUSHROOM_PIZZA);
        generateFlatItem(ModItemsImpl.STICKY_HONEY_ROAST);
        generateFlatItem(ModItemsImpl.TEA_BREAK_PANCAKE);

        generateFlatItem(ModItemsImpl.MUSHROOM_PIZZA_BLOCK);
        generateFlatItem(ModItemsImpl.STICKY_HONEY_ROAST_BLOCK);
        generateFlatItem(ModItemsImpl.TEA_BREAK_PANCAKE_BLOCK);
    }

    private static void generateFlatItem(Item item) {
        GENERATOR.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }
}
