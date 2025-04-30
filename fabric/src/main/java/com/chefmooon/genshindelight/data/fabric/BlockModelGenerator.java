package com.chefmooon.genshindelight.data.fabric;

import com.chefmooon.genshindelight.common.block.base.BaseBushBlock;
import com.chefmooon.genshindelight.common.block.base.BaseFeastBlock;
import com.chefmooon.genshindelight.common.registry.ModBlocks;
import com.chefmooon.genshindelight.common.registry.fabric.ModBlocksImpl;
import com.chefmooon.genshindelight.common.utility.fabric.ModModels;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class BlockModelGenerator {

    private static BlockModelGenerators GENERATOR;
    public static void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        GENERATOR = blockStateModelGenerator;

        registerBaseFeast(ModBlocksImpl.MUSHROOM_PIZZA_BLOCK.get());
//        registerBaseFeast(ModBlocksImpl.STICKY_HONEY_ROAST.get());
        registerBaseFeast(ModBlocksImpl.TEA_BREAK_PANCAKE_BLOCK.get());

        ResourceLocation BERRY_BUSH_STAGE_0 = registerCropCross("_stage_0", ModBlocksImpl.BERRY.get());
        ResourceLocation BERRY_BUSH_STAGE_1 = registerCropCross("_stage_1", ModBlocksImpl.BERRY.get());
        ResourceLocation BERRY_BUSH_STAGE_2 = registerCropCross("_stage_2", ModBlocksImpl.BERRY.get());
        ResourceLocation BERRY_BUSH_STAGE_3 = registerCropCross("_stage_3", ModBlocksImpl.BERRY.get());
        blockStateModelGenerator.blockStateOutput.accept(MultiVariantGenerator.multiVariant(ModBlocksImpl.BERRY.get())
                .with(PropertyDispatch.property(BaseBushBlock.AGE)
                        .select(0, Variant.variant().with(VariantProperties.MODEL, BERRY_BUSH_STAGE_0))
                        .select(1, Variant.variant().with(VariantProperties.MODEL, BERRY_BUSH_STAGE_1))
                        .select(2, Variant.variant().with(VariantProperties.MODEL, BERRY_BUSH_STAGE_2))
                        .select(3, Variant.variant().with(VariantProperties.MODEL, BERRY_BUSH_STAGE_3))
                ));
        ResourceLocation WILD_BERRY = registerCropCross("", ModBlocksImpl.WILD_BERRY.get());
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(ModBlocksImpl.WILD_BERRY.get(), WILD_BERRY));


//       ResourceLocation CALLA_LILY =  registerCropCross("", ModBlocksImpl.CALLA_LILY.get());
//        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(ModBlocksImpl.CALLA_LILY.get(), CALLA_LILY));
        ResourceLocation SMALL_LAMP_GRASS = registerCropCross("", ModBlocksImpl.SMALL_LAMP_GRASS.get());
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(ModBlocksImpl.SMALL_LAMP_GRASS.get(), SMALL_LAMP_GRASS));
        ResourceLocation WILD_LAMP_GRASS = registerCropCross("", ModBlocksImpl.WILD_LAMP_GRASS.get());
        blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(ModBlocksImpl.WILD_LAMP_GRASS.get(), WILD_LAMP_GRASS));
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

    private static ResourceLocation registerCropCross(String stage, Block block) {
        return ModModels.TEMPLATE_CROP_CROSS.create(new ResourceLocation(ModelLocationUtils.getModelLocation(block) + stage),
                TextureMapping.cross(new ResourceLocation(ModelLocationUtils.getModelLocation(block) + stage)), GENERATOR.modelOutput);
    }
}
