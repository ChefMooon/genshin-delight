package com.chefmooon.genshindelight.common.registry.fabric;

import com.chefmooon.genshindelight.common.registry.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

import static com.chefmooon.genshindelight.common.registry.ModItems.basicItem;

public class ModItemsImpl {

    public static final Supplier<Item> EXAMPLE_ITEM = registerItemWithTab(ModItems.EXAMPLE_ITEM, () -> new Item(basicItem()));

    public static Supplier<Item> registerItemWithTab(final ResourceLocation location, final Supplier<Item> supplier) {
        Item item = supplier.get();
        Registry.register(BuiltInRegistries.ITEM, location, item);
        ItemGroupEvents.modifyEntriesEvent(ModCreativeTabsImpl.ITEM_GROUP).register(entries -> entries.accept(item));
        return supplier;
    }

    public static Supplier<Item> registerItem(final ResourceLocation location, final Supplier<Item> supplier) {
        Registry.register(BuiltInRegistries.ITEM, location, supplier.get());
        return supplier;
    }

    public static void register() {
    }
}
