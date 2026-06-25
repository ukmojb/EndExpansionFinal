package com.jboymercs.endexpansion.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(ModBlocks.AMBER_ORE, new ItemStack(ModItems.AMBER_INGOT), 3);
        GameRegistry.addSmelting(ModBlocks.STAR_SHARD_ORE, new ItemStack(ModItems.STAR_SHARD), 0);
    }
}
