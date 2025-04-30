package com.chefmooon.genshindelight.common.registry.forge;

import com.chefmooon.genshindelight.Mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabsImpl {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mod.MOD_ID);
    public static final Supplier<CreativeModeTab> MOD_CREATIVE_MODE_TAB = CREATIVE_MODE_TAB.register(Mod.MOD_ID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + Mod.MOD_ID))
                    .icon(() -> new ItemStack(ModItemsImpl.ADVENTURERS_BREAKFAST_SANDWICH.get()))
                    .displayItems((parameters, output) -> ModItemsImpl.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(item.get())))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
