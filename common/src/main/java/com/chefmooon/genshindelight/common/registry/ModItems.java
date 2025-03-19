package com.chefmooon.genshindelight.common.registry;


import com.chefmooon.genshindelight.common.util.TextUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static Item.Properties noStack() {
        return new Item.Properties().stacksTo(1);
    }

    public static final ResourceLocation EXAMPLE_ITEM = item("example_item");
    private static ResourceLocation item(String string) {
        return TextUtil.res(string);
    }

    public static void register() {
    }
}
