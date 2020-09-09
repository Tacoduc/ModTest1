package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MudBlock extends Block {

    public MudBlock() {
        super(Block.Properties.create(Material.SEA_GRASS)
                .hardnessAndResistance(5.0F, 6.0F)
                .sound(SoundType.PLANT)
                .harvestLevel(1)
                .harvestTool(ToolType.SHOVEL));
    }
}
