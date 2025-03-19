package com.chefmooon.genshindelight.common;

import com.chefmooon.genshindelight.common.util.MobEffectInfo;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FoodValues {

    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes

    private static final MobEffect COMFORT = getComfort();
    private static final MobEffect NOURISHMENT = getNourishment();

    public static final FoodProperties BASIC = foodProperty(10, 1.0F);
    public static final FoodProperties BASIC_DRINK = foodProperty(5, 0.5F);

    public static FoodProperties foodProperty(int nutrition, float saturation) {
        return foodProperty(nutrition, saturation, false, false, false, null);
    }
    public static FoodProperties foodProperty(int nutrition, float saturation, List<MobEffectInfo> effects) {
        return foodProperty(nutrition, saturation, false, false, false, effects);
    }
    @ExpectPlatform
    public static FoodProperties foodProperty(int nutrition, float saturation, boolean isMeat, boolean isFast, boolean alwaysEat, @Nullable List<MobEffectInfo> effects) {
        throw new AssertionError();
    }

    public static MobEffect nonNullEffect(MobEffect effect) {
        return effect != null ? effect : MobEffects.HEAL;
    }

    @ExpectPlatform
    public static MobEffect getComfort() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static MobEffect getNourishment() {
        throw new AssertionError();
    }
}
