package com.chefmooon.genshindelight.common.util;

import com.chefmooon.genshindelight.Mod;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;

public class TextUtil {

    public static MutableComponent getTranslatable(String string, Object... args) {
        return Component.translatable(Mod.MOD_ID + "." + string, args);
    }

    public static ResourceLocation res(String string) {
        return new ResourceLocation(Mod.MOD_ID, string);
    }
}
