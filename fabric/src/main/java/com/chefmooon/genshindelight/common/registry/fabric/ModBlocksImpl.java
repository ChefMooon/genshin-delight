package com.chefmooon.genshindelight.common.registry.fabric;

import com.chefmooon.genshindelight.common.block.MushroomPizzaBlock;
import com.chefmooon.genshindelight.common.block.StickyHoneyRoastBlock;
import com.chefmooon.genshindelight.common.block.TeaBreakPancakeBlock;
import com.chefmooon.genshindelight.common.registry.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocksImpl {

    public static final Supplier<Block> MUSHROOM_PIZZA_BLOCK = registerBlock(ModBlocks.MUSHROOM_PIZZA_BLOCK,
            new MushroomPizzaBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), () -> ModItemsImpl.MUSHROOM_PIZZA_BLOCK));
    public static final Supplier<Block> STICKY_HONEY_ROAST_BLOCK = registerBlock(ModBlocks.STICKY_HONEY_ROAST_BLOCK,
            new StickyHoneyRoastBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), () -> ModItemsImpl.STICKY_HONEY_ROAST_BLOCK));
    public static final Supplier<Block> TEA_BREAK_PANCAKE_BLOCK = registerBlock(ModBlocks.TEA_BREAK_PANCAKE_BLOCK,
            new TeaBreakPancakeBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), () -> ModItemsImpl.TEA_BREAK_PANCAKE_BLOCK));

    public static Supplier<Block> registerBlock(final ResourceLocation location, final Block block) {
        Registry.register(BuiltInRegistries.BLOCK, location, block);
        return () -> block;
    }

    public static void register() {
    }
}
