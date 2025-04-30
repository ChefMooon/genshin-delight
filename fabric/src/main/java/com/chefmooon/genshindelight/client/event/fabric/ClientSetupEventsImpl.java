package com.chefmooon.genshindelight.client.event.fabric;

import com.chefmooon.genshindelight.common.registry.fabric.ModBlocksImpl;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class ClientSetupEventsImpl {
    public static void onRegisterBlockRenderLayerMap() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                ModBlocksImpl.BERRY.get(),
                ModBlocksImpl.WILD_BERRY.get(),
                ModBlocksImpl.CALLA_LILY.get(),
                ModBlocksImpl.MATASUKE.get(),
                ModBlocksImpl.MINT.get(),
                ModBlocksImpl.RADISH.get(),
                ModBlocksImpl.SMALL_LAMP_GRASS.get(),
                ModBlocksImpl.WILD_LAMP_GRASS.get(),
                ModBlocksImpl.SNAPDRAGON.get(),
                ModBlocksImpl.SWEET_FLOWER.get(),
                ModBlocksImpl.MUSHROOM_PIZZA_BLOCK.get(),
                ModBlocksImpl.STICKY_HONEY_ROAST_BLOCK.get(),
                ModBlocksImpl.TEA_BREAK_PANCAKE_BLOCK.get()
        );
    }
}
