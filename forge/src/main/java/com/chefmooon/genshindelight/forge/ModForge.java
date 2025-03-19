package com.chefmooon.genshindelight.forge;

import com.chefmooon.genshindelight.Mod;
import com.chefmooon.genshindelight.common.registry.forge.ModBlocksImpl;
import com.chefmooon.genshindelight.common.registry.forge.ModCreativeTabsImpl;
import com.chefmooon.genshindelight.common.registry.forge.ModItemsImpl;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@net.minecraftforge.fml.common.Mod(Mod.MOD_ID)
public class ModForge {
    public ModForge() {
        Mod.init();

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocksImpl.register(modEventBus);
        ModItemsImpl.register(modEventBus);
        ModCreativeTabsImpl.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
