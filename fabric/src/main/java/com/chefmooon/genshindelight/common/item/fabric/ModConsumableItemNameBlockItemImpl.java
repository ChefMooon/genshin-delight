package com.chefmooon.genshindelight.common.item.fabric;

import com.chefmooon.genshindelight.common.util.TextUtil;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModConsumableItemNameBlockItemImpl extends ItemNameBlockItem {
    private final boolean hasFoodEffectTooltip;
    public ModConsumableItemNameBlockItemImpl(Block block, Properties properties) {
        super(block, properties);
        this.hasFoodEffectTooltip = false;
    }

    public ModConsumableItemNameBlockItemImpl(Block block, Properties properties, boolean hasFoodEffectTooltip) {
        super(block, properties);
        this.hasFoodEffectTooltip = hasFoodEffectTooltip;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag isAdvanced) {
        super.appendHoverText(stack, level, tooltip, isAdvanced);
        if (this.hasFoodEffectTooltip) {
            TextUtil.addFoodEffectTooltip(stack, tooltip, 1.0F);
        }
    }
}
