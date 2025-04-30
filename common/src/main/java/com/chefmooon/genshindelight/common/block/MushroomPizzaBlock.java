package com.chefmooon.genshindelight.common.block;

import com.chefmooon.genshindelight.common.block.base.BaseFeastBlock;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class MushroomPizzaBlock extends BaseFeastBlock {

    // TODO: add custom hitbox
    public MushroomPizzaBlock(Properties properties, Supplier<Item> servingItem) {
        super(properties, servingItem);
    }
}
