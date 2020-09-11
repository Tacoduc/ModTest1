package com.example.examplemod.world.gen;

import com.example.examplemod.Tutorial;
import com.example.examplemod.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Tutorial.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen {

    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE",
            "end_stone", new BlockMatcher(Blocks.END_STONE));

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event){

        for(Biome biome : ForgeRegistries.BIOMES) {
            //Nether Generation
            if (biome.getCategory() == Biome.Category.NETHER) {
                genOre(biome, 10, 5, 5, 80, OreFeatureConfig.FillerBlockType.NETHERRACK, RegistryHandler.PRISM_ORE.get().getDefaultState(), 8);


            //End Generation
            } else if (biome.getCategory() == Biome.Category.THEEND) {
                genOre(biome, 10, 3, 5, 80, END_STONE, RegistryHandler.PRISM_ORE.get().getDefaultState(), 12);



                //World Generation
            } else {
                genOre(biome, 8, 1, 5, 25, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.PRISM_ORE.get().getDefaultState(), 6);

              }
            }
        }

        private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max,
                                   OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockState, int size){
            CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
            OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockState, size);
            ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
        }
}
