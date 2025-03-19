package com.chefmooon.genshindelight.common.registry.fabric;

import com.chefmooon.genshindelight.common.registry.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocksImpl {

    public static final Supplier<Block> MUSHROOM_PIZZA = registerBlock(ModBlocks.MUSHROOM_PIZZA,
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final Supplier<Block> STICKY_HONEY_ROAST = registerBlock(ModBlocks.STICKY_HONEY_ROAST,
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static Supplier<Block> registerBlock(final ResourceLocation location, final Block block) {
        Registry.register(BuiltInRegistries.BLOCK, location, block);
        return () -> block;
    }

    public static void register() {
    }
}
