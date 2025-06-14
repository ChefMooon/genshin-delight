package com.chefmooon.genshindelight.common.registry;


import com.chefmooon.genshindelight.common.util.TextUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModItems {

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static Item.Properties basicConsumableItem(FoodProperties food) {
        return basicItem().food(food);
    }

    public static Item.Properties drinkItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }

    public static Item.Properties noStack() {
        return new Item.Properties().stacksTo(1);
    }

    // Crop Like Things
    public static final ResourceLocation BERRY = item("berry");
    public static final ResourceLocation WILD_BERRY = item("wild_berry");
    public static final ResourceLocation CALLA_LILY = item("calla_lily");
    public static final ResourceLocation MATASUKE = item("matasuke");
    public static final ResourceLocation MINT = item("mint");
    public static final ResourceLocation RADISH = item("radish");
    public static final ResourceLocation SMALL_LAMP_GRASS = item("small_lamp_grass");
    public static final ResourceLocation WILD_LAMP_GRASS = item("wild_lamp_grass");
    public static final ResourceLocation SNAPDRAGON = item("snapdragon");
    public static final ResourceLocation SWEET_FLOWER = item("sweet_flower");

    // Ingredients
    public static final ResourceLocation BUTTER = item("butter");
    public static final ResourceLocation CHEESE = item("cheese");
    public static final ResourceLocation CRAB = item("crab");
    public static final ResourceLocation CRAB_ROE = item("crab_roe");
    public static final ResourceLocation CREAM = item("cream");
    public static final ResourceLocation FLOUR = item("flour");
    public static final ResourceLocation PEPPER = item("pepper");
    public static final ResourceLocation PINECONE = item("pinecone");
    public static final ResourceLocation SALT = item("salt");
    public static final ResourceLocation SMOKED_FOWL = item("smoked_fowl");
    public static final ResourceLocation SUNSETTIAS = item("sunsettias");

    // Drinks
    public static final ResourceLocation APPLE_CIDER = item("apple_cider");
    public static final ResourceLocation BERRY_MINT_BURST = item("berry_mint_burst");
    public static final ResourceLocation FRUITS_OF_THE_FISTIVAL = item("fruits_of_the_festival");
    public static final ResourceLocation SPARKLING_BERRY_JUICE = item("sparkling_berry_juice");
    public static final ResourceLocation WOLFHOOK_JUICE = item("wolfhook_juice");

    // Food
    public static final ResourceLocation PILE_EM_UP = item("pile_em_up");
    public static final ResourceLocation ADVENTURERS_BREAKFAST_SANDWICH = item("adventurers_breakfast_sandwich");
    public static final ResourceLocation APPLE_ROLY_POLY = item("apple_roly_poly");
    public static final ResourceLocation BARBATOS_RATATOUILLE = item("barbatos_ratatouille");
    public static final ResourceLocation CALLA_LILY_SEAFOOD_SOUP = item("calla_lily_seafood_soup");
    public static final ResourceLocation CHICKEN_MUSHROOM_SKEWER = item("chicken_mushroom_skewer");
    public static final ResourceLocation COLD_CUT_PLATTER = item("cold_cut_platter");
    public static final ResourceLocation CRAB_HAM_VEGGIE_BAKE = item("crab_ham_veggie_bake");
    public static final ResourceLocation CREAM_STEW = item("cream_stew");
    public static final ResourceLocation CRISPY_POTATO_SHRIMP_PLATTER = item("crispy_potato_shrimp_platter");
    public static final ResourceLocation FISHERMANS_TOAST = item("fishermans_toast");
    public static final ResourceLocation FLAMING_RED_BOLOGNESE = item("flaming_red_bolognese");
    public static final ResourceLocation GOULASH = item("goulash");
    public static final ResourceLocation MEATNADO = item("meatnado");
    public static final ResourceLocation MINT_JELLY = item("mint_jelly");
    public static final ResourceLocation MONDSTADT_GRILLED_FISH = item("mondstadt_grilled_fish");
    public static final ResourceLocation MONDSTADT_HASH_BROWN = item("mondstadt_hash_brown");
    public static final ResourceLocation MOON_PIE = item("moon_pie");
    public static final ResourceLocation NORTHERN_APPLE_STEW = item("northern_apple_stew");
    public static final ResourceLocation RADISH_VEGGIE_SOUP = item("radish_veggie_soup");
    public static final ResourceLocation SATISFYING_SALAD = item("satisfying_salad");
    public static final ResourceLocation SAUTEED_MATSUTAKE = item("sauteed_matsutake");
    public static final ResourceLocation STEAK = item("steak");
    public static final ResourceLocation SUNSHINE_SPRAT = item("sunshine_sprat");
    public static final ResourceLocation SWEET_MADAME = item("sweet_madame");
    public static final ResourceLocation TEYVAT_FRIED_EGG = item("teyvat_fried_egg");

    // Food Block Item
    public static final ResourceLocation MUSHROOM_PIZZA = item("mushroom_pizza");
    public static final ResourceLocation STICKY_HONEY_ROAST = item("sticky_honey_roast");
    public static final ResourceLocation TEA_BREAK_PANCAKE = item("tea_break_pancake");

    public static final ResourceLocation MUSHROOM_PIZZA_BLOCK = item("mushroom_pizza_block");
    public static final ResourceLocation STICKY_HONEY_ROAST_BLOCK = item("sticky_honey_roast_block");
    public static final ResourceLocation TEA_BREAK_PANCAKE_BLOCK = item("tea_break_pancake_block");

    private static ResourceLocation item(String string) {
        return TextUtil.res(string);
    }

    public static void register() {
    }
}
