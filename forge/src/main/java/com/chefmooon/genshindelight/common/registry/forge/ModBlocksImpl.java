package com.chefmooon.genshindelight.common.registry.forge;

import com.chefmooon.genshindelight.Mod;
import com.chefmooon.genshindelight.common.registry.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocksImpl {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Mod.MOD_ID);

    public static final Supplier<Block> EXAMPLE_BLOCK = registerBlock(ModBlocks.EXAMPLE_BLOCK, new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static Supplier<Block> registerBlock(final ResourceLocation location, final Block block) {
        return BLOCKS.register(location.getPath(), () -> block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
