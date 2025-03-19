package com.chefmooon.genshindelight;

import com.chefmooon.genshindelight.common.registry.ModBlocks;
import com.chefmooon.genshindelight.common.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod {
    public static final String MOD_ID = "genshindelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static void init() {

        ModBlocks.register();
        ModItems.register();
    }
}
