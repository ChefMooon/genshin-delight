package com.chefmooon.genshindelight.common.registry.fabric;

import com.chefmooon.genshindelight.common.block.MushroomPizzaBlock;
import com.chefmooon.genshindelight.common.block.StickyHoneyRoastBlock;
import com.chefmooon.genshindelight.common.block.TeaBreakPancakeBlock;
import com.chefmooon.genshindelight.common.block.base.BaseBushBlock;
import com.chefmooon.genshindelight.common.registry.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocksImpl {

    public static final Supplier<Block> BERRY = registerBlock(ModBlocks.BERRY,
            new BaseBushBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final Supplier<Block> WILD_BERRY = registerBlock(ModBlocks.WILD_BERRY,
            new Block(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final Supplier<Block> CALLA_LILY = registerBlock(ModBlocks.CALLA_LILY,
            new Block(BlockBehaviour.Properties.copy(Blocks.LILY_OF_THE_VALLEY)));
    public static final Supplier<Block> MATASUKE = registerBlock(ModBlocks.MATASUKE,
            new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_MUSHROOM)));
    public static final Supplier<Block> MINT = registerBlock(ModBlocks.MINT,
            new Block(BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final Supplier<Block> RADISH = registerBlock(ModBlocks.RADISH,
            new Block(BlockBehaviour.Properties.copy(Blocks.CARROTS)));
    public static final Supplier<Block> SMALL_LAMP_GRASS = registerBlock(ModBlocks.SMALL_LAMP_GRASS,
            new Block(BlockBehaviour.Properties.copy(Blocks.DANDELION).lightLevel((state) -> 8)));
    public static final Supplier<Block> WILD_LAMP_GRASS = registerBlock(ModBlocks.WILD_LAMP_GRASS,
            new Block(BlockBehaviour.Properties.copy(Blocks.DANDELION).lightLevel((state) -> 8)));
    public static final Supplier<Block> SNAPDRAGON = registerBlock(ModBlocks.SNAPDRAGON,
            new Block(BlockBehaviour.Properties.copy(Blocks.DANDELION)));
    public static final Supplier<Block> SWEET_FLOWER = registerBlock(ModBlocks.SWEET_FLOWER,
            new Block(BlockBehaviour.Properties.copy(Blocks.DANDELION)));

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
