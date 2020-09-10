package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PrismOre extends OreBlock {

    public PrismOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(6.0F, 7.0F)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE));
    }
}
