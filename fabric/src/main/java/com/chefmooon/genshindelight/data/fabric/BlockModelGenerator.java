package com.chefmooon.genshindelight.data.fabric;

import com.chefmooon.genshindelight.common.block.base.BaseFeastBlock;
import com.chefmooon.genshindelight.common.registry.fabric.ModBlocksImpl;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class BlockModelGenerator {

    private static BlockModelGenerators GENERATOR;
    public static void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        GENERATOR = blockStateModelGenerator;

        registerBaseFeast(ModBlocksImpl.MUSHROOM_PIZZA_BLOCK.get());
//        registerBaseFeast(ModBlocksImpl.STICKY_HONEY_ROAST.get());
        registerBaseFeast(ModBlocksImpl.TEA_BREAK_PANCAKE_BLOCK.get());
    }

    private static void registerBaseFeast(Block block) {
        // basic setup
        // TODO add serving variants

        ResourceLocation BLOCK_LOCATION = ModelLocationUtils.getModelLocation(block);

        GENERATOR.blockStateOutput.accept(MultiVariantGenerator.multiVariant(block)
                .with(BlockModelGenerators.createHorizontalFacingDispatch())
                .with(PropertyDispatch.property(BaseFeastBlock.SERVINGS)
                        .select(1, Variant.variant().with(VariantProperties.MODEL, BLOCK_LOCATION.withSuffix("_4")))
                        .select(2, Variant.variant().with(VariantProperties.MODEL, BLOCK_LOCATION.withSuffix("_4")))
                        .select(3, Variant.variant().with(VariantProperties.MODEL, BLOCK_LOCATION.withSuffix("_4")))
                        .select(4, Variant.variant().with(VariantProperties.MODEL, BLOCK_LOCATION.withSuffix("_4")))
                )
        );
    }
}
