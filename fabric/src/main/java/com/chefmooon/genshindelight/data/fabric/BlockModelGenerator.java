package com.chefmooon.genshindelight.data.fabric;

import net.minecraft.data.models.BlockModelGenerators;

public class BlockModelGenerator {

    private static BlockModelGenerators GENERATOR;
    public static void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        GENERATOR = blockStateModelGenerator;

    }
}
