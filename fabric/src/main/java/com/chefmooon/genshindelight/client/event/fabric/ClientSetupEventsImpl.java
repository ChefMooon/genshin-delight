package com.chefmooon.genshindelight.client.event.fabric;

import com.chefmooon.genshindelight.common.registry.fabric.ModBlocksImpl;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class ClientSetupEventsImpl {
    public static void onRegisterBlockRenderLayerMap() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                ModBlocksImpl.MUSHROOM_PIZZA_BLOCK.get(),
                ModBlocksImpl.STICKY_HONEY_ROAST_BLOCK.get(),
                ModBlocksImpl.TEA_BREAK_PANCAKE_BLOCK.get()
        );
    }
}
