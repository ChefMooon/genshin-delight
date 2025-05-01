package com.chefmooon.genshindelight.data.fabric;

import com.chefmooon.genshindelight.common.block.RadishCropBlock;
import com.chefmooon.genshindelight.common.registry.fabric.ModBlocksImpl;
import com.chefmooon.genshindelight.common.registry.fabric.ModItemsImpl;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolSingletonContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    protected LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocksImpl.CALLA_LILY.get());
        dropSelf(ModBlocksImpl.SMALL_LAMP_GRASS.get());
        dropSelf(ModBlocksImpl.WILD_LAMP_GRASS.get());
        dropSelf(ModBlocksImpl.SNAPDRAGON.get());
        dropSelf(ModBlocksImpl.SWEET_FLOWER.get());

        // TODO: Add loot tables for other blocks

        add(ModBlocksImpl.RADISH.get(),
                createCropDrops(ModBlocksImpl.RADISH.get(), ModItemsImpl.RADISH, ModItemsImpl.RADISH,
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocksImpl.RADISH.get()).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(RadishCropBlock.AGE, 7))));

    }
}
