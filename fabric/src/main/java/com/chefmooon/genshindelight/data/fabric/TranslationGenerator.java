package com.chefmooon.genshindelight.data.fabric;

import com.chefmooon.genshindelight.Mod;
import com.chefmooon.genshindelight.common.registry.fabric.ModBlocksImpl;
import com.chefmooon.genshindelight.common.registry.fabric.ModItemsImpl;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class TranslationGenerator extends FabricLanguageProvider {
    public TranslationGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        String MOD_ID = Mod.MOD_ID;

        translationBuilder.add("itemGroup." + MOD_ID, "Genshin Delight");

        translationBuilder.add(ModBlocksImpl.BERRY.get(), "Berry");
        translationBuilder.add(ModItemsImpl.BERRY, "Berry");
        translationBuilder.add(ModBlocksImpl.WILD_BERRY.get(), "Wild Berry");
        translationBuilder.add(ModBlocksImpl.CALLA_LILY.get(), "Calla Lily");
        translationBuilder.add(ModBlocksImpl.MATASUKE.get(), "Matasuke");
        translationBuilder.add(ModBlocksImpl.MINT.get(), "Mint");
        translationBuilder.add(ModBlocksImpl.RADISH.get(), "Radish");
        translationBuilder.add(ModBlocksImpl.SMALL_LAMP_GRASS.get(), "Small Lamp Grass");
        translationBuilder.add(ModBlocksImpl.WILD_LAMP_GRASS.get(), "Wild Lamp Grass");
        translationBuilder.add(ModBlocksImpl.SNAPDRAGON.get(), "Snapdragon");
        translationBuilder.add(ModBlocksImpl.SWEET_FLOWER.get(), "Sweet Flower");

        translationBuilder.add(ModItemsImpl.BUTTER, "Butter");
        translationBuilder.add(ModItemsImpl.CHEESE, "Cheese");
        translationBuilder.add(ModItemsImpl.CRAB, "Crab");
        translationBuilder.add(ModItemsImpl.CRAB_ROE, "Crab Roe");
        translationBuilder.add(ModItemsImpl.CREAM, "Cream");
        translationBuilder.add(ModItemsImpl.FLOUR, "Flour");
        translationBuilder.add(ModItemsImpl.PEPPER, "Pepper");
        translationBuilder.add(ModItemsImpl.PINECONE, "Pinecone");
        translationBuilder.add(ModItemsImpl.SALT, "Salt");
        translationBuilder.add(ModItemsImpl.SMOKED_FOWL, "Smoked Fowl");
        translationBuilder.add(ModItemsImpl.SUNSETTIAS, "Sunsettias");

        translationBuilder.add(ModItemsImpl.APPLE_CIDER, "Apple Cider");
        translationBuilder.add(ModItemsImpl.BERRY_MINT_BURST, "Berry & Mint Burst");
        translationBuilder.add(ModItemsImpl.FRUITS_OF_THE_FISTIVAL, "Fruits of the Fistival");
        translationBuilder.add(ModItemsImpl.SPARKLING_BERRY_JUICE, "Sparkling Berry Juice");
        translationBuilder.add(ModItemsImpl.WOLFHOOK_JUICE, "Wolfhook Juice");

        translationBuilder.add(ModItemsImpl.PILE_EM_UP, "Pile 'Em Up");
        translationBuilder.add(ModItemsImpl.ADVENTURERS_BREAKFAST_SANDWICH, "Adventurer's Breakfast Sandwich");
        translationBuilder.add(ModItemsImpl.APPLE_ROLY_POLY, "Apple Roly Poly");
        translationBuilder.add(ModItemsImpl.BARBATOS_RATATOUILLE, "Barbatos Ratatouille");
        translationBuilder.add(ModItemsImpl.CALLA_LILY_SEAFOOD_SOUP, "Calla Lily Seafood Soup");
        translationBuilder.add(ModItemsImpl.CHICKEN_MUSHROOM_SKEWER, "Chicken-Mushroom Skewer");
        translationBuilder.add(ModItemsImpl.COLD_CUT_PLATTER, "Cold Cut Platter");
        translationBuilder.add(ModItemsImpl.CRAB_HAM_VEGGIE_BAKE, "Crab, Ham & Veggie Bake");
        translationBuilder.add(ModItemsImpl.CREAM_STEW, "Cream Stew");
        translationBuilder.add(ModItemsImpl.CRISPY_POTATO_SHRIMP_PLATTER, "Crispy Potato Shrimp Platter");
        translationBuilder.add(ModItemsImpl.FISHERMANS_TOAST, "Fisherman's Toast");
        translationBuilder.add(ModItemsImpl.FLAMING_RED_BOLOGNESE, "Flaming Red Bolognese");
        translationBuilder.add(ModItemsImpl.GOULASH, "Goulash");
        translationBuilder.add(ModItemsImpl.MEATNADO, "Meatnado");
        translationBuilder.add(ModItemsImpl.MINT_JELLY, "Mint Jelly");
        translationBuilder.add(ModItemsImpl.MONDSTADT_GRILLED_FISH, "Mondstadt Grilled Fish");
        translationBuilder.add(ModItemsImpl.MONDSTADT_HASH_BROWN, "Mondstadt Hash Brown");
        translationBuilder.add(ModItemsImpl.MOON_PIE, "Moon Pie");
        translationBuilder.add(ModItemsImpl.NORTHERN_APPLE_STEW, "Northern Apple Stew");
        translationBuilder.add(ModItemsImpl.RADISH_VEGGIE_SOUP, "Radish Veggie Soup");
        translationBuilder.add(ModItemsImpl.SATISFYING_SALAD, "Satisfying Salad");
        translationBuilder.add(ModItemsImpl.SAUTEED_MATSUTAKE, "Sauteed Matsutake");
        translationBuilder.add(ModItemsImpl.STEAK, "Steak");
        translationBuilder.add(ModItemsImpl.SUNSHINE_SPRAT, "Sunshine Sprat");
        translationBuilder.add(ModItemsImpl.SWEET_MADAME, "Sweet Madame");
        translationBuilder.add(ModItemsImpl.TEYVAT_FRIED_EGG, "Teyvat Fried Egg");

        translationBuilder.add(ModItemsImpl.MUSHROOM_PIZZA, "Mushroom Pizza Slice");
        translationBuilder.add(ModItemsImpl.STICKY_HONEY_ROAST, "Sticky Honey Roast Plate");
        translationBuilder.add(ModItemsImpl.TEA_BREAK_PANCAKE, "Tea Break Pancake Plate");

        translationBuilder.add(ModItemsImpl.MUSHROOM_PIZZA_BLOCK, "Mushroom Pizza");
        translationBuilder.add(ModItemsImpl.STICKY_HONEY_ROAST_BLOCK, "Sticky Honey Roast");
        translationBuilder.add(ModItemsImpl.TEA_BREAK_PANCAKE_BLOCK, "Tea Break Pancake");
    }
}
