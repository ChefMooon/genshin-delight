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
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocksImpl {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, Mod.MOD_ID);

    public static final RegistryObject<Block> MUSHROOM_PIZZA = registerBlock(ModBlocks.MUSHROOM_PIZZA,
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> STICKY_HONEY_ROAST = registerBlock(ModBlocks.STICKY_HONEY_ROAST,
            new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static RegistryObject<Block> registerBlock(final ResourceLocation location, final Block block) {
        return BLOCKS.register(location.getPath(), () -> block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
