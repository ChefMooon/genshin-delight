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

    private static final VoxelShape MUSHROOM_PIZZA_1 = Block.box(8, 1, 2, 14, 3, 8);
    private static final VoxelShape MUSHROOM_PIZZA_2 = Block.box(2, 1, 2, 8, 3, 8);
    private static final VoxelShape MUSHROOM_PIZZA_3 = Block.box(2, 1, 8, 8, 3, 14);
    private static final VoxelShape MUSHROOM_PIZZA_4 = Block.box(8, 1, 8, 14, 3, 14);
    public static final VoxelShape MUSHROOM_PIZZA_SERVINGS_4 = Shapes.or(
            BASIC_PLATE, MUSHROOM_PIZZA_1, MUSHROOM_PIZZA_2, MUSHROOM_PIZZA_3, MUSHROOM_PIZZA_4
    );
    public static final VoxelShape MUSHROOM_PIZZA_SERVINGS_3 = Shapes.or(
            BASIC_PLATE, MUSHROOM_PIZZA_1, MUSHROOM_PIZZA_2, MUSHROOM_PIZZA_3
    );
    public static final VoxelShape MUSHROOM_PIZZA_SERVINGS_2 = Shapes.or(
            BASIC_PLATE, MUSHROOM_PIZZA_1, MUSHROOM_PIZZA_2
    );
    public static final VoxelShape MUSHROOM_PIZZA_SERVINGS_1 = Shapes.or(
            BASIC_PLATE, MUSHROOM_PIZZA_1
    );
}
