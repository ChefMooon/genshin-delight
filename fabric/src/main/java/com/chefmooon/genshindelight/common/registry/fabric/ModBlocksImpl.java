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

    public static final Supplier<Block> EXAMPLE_BLOCK = () -> registerBlock(ModBlocks.EXAMPLE_BLOCK, new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static Block registerBlock(final ResourceLocation location, final Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, location, block);
    }

    public static void register() {
    }
}
