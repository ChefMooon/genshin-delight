package com.chefmooon.genshindelight.common.block;

import com.chefmooon.genshindelight.common.block.base.BaseFeastBlock;
import com.chefmooon.genshindelight.common.registry.ModShapes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class TeaBreakPancakeBlock extends BaseFeastBlock {
    public static final int PANCAKE_MAX_SERVINGS = 5;
    public static final IntegerProperty PANCAKE_SERVINGS = IntegerProperty.create("servings", 0, PANCAKE_MAX_SERVINGS);
    protected final ConcurrentHashMap<Integer, VoxelShape> SHAPES;
    public TeaBreakPancakeBlock(Properties properties, Supplier<Item> servingItem) {
        super(properties, servingItem);
        SHAPES = buildShapes();
    }

    private static ConcurrentHashMap<Integer, VoxelShape> buildShapes() {
        ConcurrentHashMap<Integer, VoxelShape> result = new ConcurrentHashMap<>();
        result.put(5, ModShapes.TEA_BREAK_PANCAKE_SERVINGS_5);
        result.put(4, ModShapes.TEA_BREAK_PANCAKE_SERVINGS_4);
        result.put(3, ModShapes.TEA_BREAK_PANCAKE_SERVINGS_3);
        result.put(2, ModShapes.TEA_BREAK_PANCAKE_SERVINGS_2);
        result.put(1, ModShapes.TEA_BREAK_PANCAKE_SERVINGS_1);
        result.put(0, ModShapes.BASIC_PLATE);
        return result;
    }

    @Override
    public IntegerProperty getServingsProperty() {
        return PANCAKE_SERVINGS;
    }

    @Override
    public int getMaxServings() {
        return PANCAKE_MAX_SERVINGS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, PANCAKE_SERVINGS);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        int servings = state.getValue(PANCAKE_SERVINGS);
        return SHAPES.getOrDefault(servings, ModShapes.BASIC_PLATE);
    }
}
