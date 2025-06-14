package com.chefmooon.genshindelight.common.forge;


import com.chefmooon.genshindelight.common.FoodValues;
import com.chefmooon.genshindelight.common.util.MobEffectInfo;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import org.jetbrains.annotations.Nullable;
import vectorwing.farmersdelight.common.registry.ModEffects;

import java.util.List;

public class FoodValuesImpl {

    public static FoodProperties foodProperty(int nutrition, float saturation, boolean isMeat, boolean isFast, boolean alwaysEat, @Nullable List<MobEffectInfo> effects) {
        FoodProperties.Builder builder = new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturation);

        if (effects != null) {
            for (MobEffectInfo effectInfo : effects) {
                builder.effect(() -> new MobEffectInstance(FoodValues.nonNullEffect(effectInfo.effect()), effectInfo.duration()), effectInfo.probability());
            }
        }

        if (isMeat) {
            builder.meat();
        }

        if (isFast) {
            builder.fast();
        }

        if (alwaysEat) {
            builder.alwaysEat();
        }

        return builder.build();
    }

    public static MobEffect getComfort() {
        return ModEffects.COMFORT.get();
    }

    public static MobEffect getNourishment() {
        return ModEffects.NOURISHMENT.get();
    }
}
