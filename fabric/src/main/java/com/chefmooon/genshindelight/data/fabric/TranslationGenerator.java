package com.chefmooon.genshindelight.data.fabric;

import com.chefmooon.genshindelight.Mod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class TranslationGenerator extends FabricLanguageProvider {
    public TranslationGenerator(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        String MOD_ID = Mod.MOD_ID;

        translationBuilder.add("itemGroup." + MOD_ID, "Genshin Delight");
    }
}
