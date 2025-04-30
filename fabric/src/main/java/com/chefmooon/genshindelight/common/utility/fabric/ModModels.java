package com.chefmooon.genshindelight.common.utility.fabric;

import com.chefmooon.genshindelight.common.util.TextUtil;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.TextureSlot;

import java.util.Optional;

public class ModModels {

    public static final ModelTemplate TEMPLATE_CROP_CROSS = block("template_crop_cross", TextureSlot.CROSS);

    private static ModelTemplate block(String parent, TextureSlot... textureSlots) {
        return new ModelTemplate(Optional.of(TextUtil.res("block/" + parent)), Optional.empty(), textureSlots);
    }
}
