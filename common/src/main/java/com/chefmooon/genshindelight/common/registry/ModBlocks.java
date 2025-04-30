package com.chefmooon.genshindelight.common.registry;

import com.chefmooon.genshindelight.common.util.TextUtil;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocks {

    public static final ResourceLocation MUSHROOM_PIZZA_BLOCK = block("mushroom_pizza_block");
    public static final ResourceLocation STICKY_HONEY_ROAST_BLOCK = block("sticky_honey_roast_block");
    public static final ResourceLocation TEA_BREAK_PANCAKE_BLOCK = block("tea_break_pancake_block");

    @ExpectPlatform
    public static Supplier<Block> registerBlock(final ResourceLocation location, final Block block) {
        throw new AssertionError();
    }

    private static ResourceLocation block(String string) {
        return TextUtil.res(string);
    }

    public static void register() {
    }
}
