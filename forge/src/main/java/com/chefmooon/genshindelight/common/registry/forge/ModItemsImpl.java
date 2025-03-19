package com.chefmooon.genshindelight.common.registry.forge;

import com.chefmooon.genshindelight.Mod;
import com.chefmooon.genshindelight.common.registry.ModItems;
import com.google.common.collect.Sets;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

import static com.chefmooon.genshindelight.common.registry.ModItems.basicItem;

public class ModItemsImpl {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Mod.MOD_ID);
    public static LinkedHashSet<Supplier<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static final RegistryObject<Item> EXAMPLE_ITEM = registerItemWithTab(ModItems.EXAMPLE_ITEM, () -> new Item(basicItem()));

    public static RegistryObject<Item> registerItemWithTab(final ResourceLocation location, final Supplier<Item> supplier) {
        RegistryObject<Item> item = ITEMS.register(location.getPath(), supplier);
        CREATIVE_TAB_ITEMS.add(item);
        return item;
    }

    public static RegistryObject<Item> registerItem(final ResourceLocation location, final Supplier<Item> supplier) {
        return ITEMS.register(location.getPath(), supplier);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
