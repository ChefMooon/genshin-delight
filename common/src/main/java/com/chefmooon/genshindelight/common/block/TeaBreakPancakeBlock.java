package com.chefmooon.genshindelight.common.block;

import com.chefmooon.genshindelight.common.block.base.BaseFeastBlock;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.function.Supplier;

public class TeaBreakPancakeBlock extends BaseFeastBlock {
    public static final int PANCAKE_MAX_SERVINGS = 5;
    public static final IntegerProperty PANCAKE_SERVINGS = IntegerProperty.create("servings", 0, PANCAKE_MAX_SERVINGS);
    // TODO: add custom hitbox
    public TeaBreakPancakeBlock(Properties properties, Supplier<Item> servingItem) {
        super(properties, servingItem);
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
}
