package com.chefmooon.genshindelight.client.fabric;

import com.chefmooon.genshindelight.client.event.fabric.ClientSetupEventsImpl;
import net.fabricmc.api.ClientModInitializer;

public class ModClientImpl implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientSetupEventsImpl.onRegisterBlockRenderLayerMap();
    }
}
