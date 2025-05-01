package com.chefmooon.genshindelight.common.registry;

import com.chefmooon.genshindelight.common.util.TextUtil;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class ModBlocks {
    
    // Crop Like Things
    public static final ResourceLocation BERRY = block("berry");
    public static final ResourceLocation WILD_BERRY = block("wild_berry");
    public static final ResourceLocation CALLA_LILY = block("calla_lily");
    public static final ResourceLocation MATASUKE = block("matasuke");
    public static final ResourceLocation MINT = block("mint");
    public static final ResourceLocation RADISH = block("radish");
    public static final ResourceLocation SMALL_LAMP_GRASS = block("small_lamp_grass");
    public static final ResourceLocation WILD_LAMP_GRASS = block("wild_lamp_grass");
    public static final ResourceLocation SNAPDRAGON = block("snapdragon");
    public static final ResourceLocation SWEET_FLOWER = block("sweet_flower");
    
    public static final ResourceLocation MUSHROOM_PIZZA_BLOCK = block("mushroom_pizza_block");
    public static final ResourceLocation STICKY_HONEY_ROAST_BLOCK = block("sticky_honey_roast_block");
    public static final ResourceLocation TEA_BREAK_PANCAKE_BLOCK = block("tea_break_pancake_block");

    private static ResourceLocation block(String string) {
        return TextUtil.res(string);
    }

    public static void register() {
    }
}
