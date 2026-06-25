package com.jboymercs.endexpansion.blocks;

import com.jboymercs.endexpansion.util.ModReference;
import com.jboymercs.endexpansion.Main;
import com.jboymercs.endexpansion.init.ModBlocks;
import com.jboymercs.endexpansion.init.ModItems;
import com.jboymercs.endexpansion.util.IHasModel;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockCoriumOre extends BlockOre implements IHasModel {

    public BlockCoriumOre(String name) {
        super();
        setTranslationKey(ModReference.MOD_ID + "." + name);
        setRegistryName(name);
        // Add both an item as a block and the block itself
        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockCoriumOre(String name, float hardness, float resistance, SoundType soundType) {
        this(name);
        setHardness(hardness);
        setResistance(resistance);
        this.setSoundType(soundType);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
