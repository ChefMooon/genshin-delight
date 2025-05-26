package com.chefmooon.genshindelight.common.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModShapes {

    public static final VoxelShape BASIC_PLATE = Block.box(1, 0, 1, 15, 1, 15);
    public static final VoxelShape TEA_BREAK_PANCAKE_SERVINGS_5 = Shapes.or(
            BASIC_PLATE, Block.box(2, 1, 2, 14, 6, 14)
    );
    public static final VoxelShape TEA_BREAK_PANCAKE_SERVINGS_4 = Shapes.or(
            BASIC_PLATE, Block.box(2, 1, 2, 14, 5, 14)
    );
    public static final VoxelShape TEA_BREAK_PANCAKE_SERVINGS_3 = Shapes.or(
            BASIC_PLATE, Block.box(2, 1, 2, 14, 4, 14)
    );
    public static final VoxelShape TEA_BREAK_PANCAKE_SERVINGS_2 = Shapes.or(
            BASIC_PLATE, Block.box(2, 1, 2, 14, 3, 14)
    );
    public static final VoxelShape TEA_BREAK_PANCAKE_SERVINGS_1 = Shapes.or(
            BASIC_PLATE, Block.box(2, 1, 2, 14, 2, 14)
    );
}
