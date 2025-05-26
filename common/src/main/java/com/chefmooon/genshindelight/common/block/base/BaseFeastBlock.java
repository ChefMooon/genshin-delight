package com.chefmooon.genshindelight.common.block.base;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

public class BaseFeastBlock extends Block {
    public static final int MAX_SERVINGS = 4;
    public static final IntegerProperty SERVINGS = IntegerProperty.create("servings", 0, MAX_SERVINGS);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    protected static final VoxelShape SHAPE = Block.box(1.0d, .0d, 1.0d, 15.d, 10.d, 15.d);
    public Supplier<Item> servingItem;
    public BaseFeastBlock(Properties properties, Supplier<Item> servingItem) {
        super(properties);
        this.servingItem = servingItem;
        this.registerDefaultState(this.getStateDefinition().any().setValue(getServingsProperty(), getMaxServings()).setValue(FACING, net.minecraft.core.Direction.NORTH));
    }

    public IntegerProperty getServingsProperty() {
        return SERVINGS;
    }

    public int getMaxServings() {
        return MAX_SERVINGS;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack heldStack = player.getItemInHand(hand);

        // TODO: add mechanic to eat directly from the block

        if (level.isClientSide()) {
            if (heldStack.is(servingItem.get())) {
                return addServingFromHand(level, pos, state, player, hand);
            } else if (heldStack.isEmpty()) {
                return removeServingToHand(level, pos, state, player, hand);
            }
        }

        if (heldStack.is(servingItem.get())) {
            return addServingFromHand(level, pos, state, player, hand);
        } else if (heldStack.isEmpty()) {
            return removeServingToHand(level, pos, state, player, hand);
        }

        return InteractionResult.PASS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING, SERVINGS);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public int getAnalogOutputSignal(BlockState state, Level level, BlockPos pos) {
        return getOutputSignal((Integer)state.getValue(SERVINGS));
    }

    public static int getOutputSignal(int servings) {
        return servings * 2;
    }

    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    @Override
    public boolean isPathfindable(BlockState state, BlockGetter level, BlockPos pos, PathComputationType type) {
        return false;
    }

    public InteractionResult addServingFromHand(Level level, BlockPos pos, BlockState state, Player player, InteractionHand hand) {
        int servings = state.getValue(getServingsProperty());

        if (servings < getMaxServings()) {
            ItemStack heldStack = player.getItemInHand(hand);
            level.setBlock(pos, state.setValue(getServingsProperty(), servings + 1), 3);
            level.playSound(player, pos, SoundEvents.WOOD_PLACE, SoundSource.BLOCKS, 0.6F, 0.8F);
            if (!player.isCreative()) {
                heldStack.shrink(1);
            }
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    protected InteractionResult removeServingToHand(Level level, BlockPos pos, BlockState state, Player player, InteractionHand hand) {
        int servings = state.getValue(getServingsProperty());
        ItemStack servingItem = new ItemStack(this.servingItem.get());

        if (servings > 0) {
            level.setBlock(pos, state.setValue(getServingsProperty(), servings - 1), 3);
            level.playSound(player, pos, SoundEvents.WOOD_PLACE, SoundSource.BLOCKS, 0.6F, 0.8F);
            if (!player.isCreative()) {
                if (!player.getInventory().add(servingItem)) {
                    player.drop(servingItem, false);
                }
            }
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
