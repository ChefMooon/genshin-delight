package com.chefmooon.genshindelight.common.fabric;

import com.chefmooon.genshindelight.Mod;
import com.chefmooon.genshindelight.common.registry.fabric.ModBlocksImpl;
import com.chefmooon.genshindelight.common.registry.fabric.ModCreativeTabsImpl;
import com.chefmooon.genshindelight.common.registry.fabric.ModItemsImpl;
import net.fabricmc.api.ModInitializer;

public class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Mod.init();

        ModBlocksImpl.register();
        ModItemsImpl.register();
        ModCreativeTabsImpl.register();

    }
}
