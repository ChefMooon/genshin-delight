package com.chefmooon.genshindelight.common.block;

import com.chefmooon.genshindelight.common.block.base.BaseFeastBlock;
import com.chefmooon.genshindelight.common.registry.ModShapes;
import com.chefmooon.genshindelight.common.util.VoxelShapeUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class MushroomPizzaBlock extends BaseFeastBlock {
    protected final ConcurrentHashMap<Integer, VoxelShape[]> SHAPES;
    public MushroomPizzaBlock(Properties properties, Supplier<Item> servingItem) {
        super(properties, servingItem);
        SHAPES = buildShapes();
    }

    private static ConcurrentHashMap<Integer, VoxelShape[]> buildShapes() {
        ConcurrentHashMap<Integer, VoxelShape[]> result = new ConcurrentHashMap<>();
        result.put(4, VoxelShapeUtil.getRotatedShapes(ModShapes.MUSHROOM_PIZZA_SERVINGS_4));
        result.put(3, VoxelShapeUtil.getRotatedShapes(ModShapes.MUSHROOM_PIZZA_SERVINGS_3));
        result.put(2, VoxelShapeUtil.getRotatedShapes(ModShapes.MUSHROOM_PIZZA_SERVINGS_2));
        result.put(1, VoxelShapeUtil.getRotatedShapes(ModShapes.MUSHROOM_PIZZA_SERVINGS_1));
        result.put(0, VoxelShapeUtil.getRotatedShapes(ModShapes.BASIC_PLATE));
        return result;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        int servings = state.getValue(getServingsProperty());
        return SHAPES.containsKey(servings) ? SHAPES.get(servings)[state.getValue(FACING).get2DDataValue()] : ModShapes.BASIC_PLATE;
    }
}
