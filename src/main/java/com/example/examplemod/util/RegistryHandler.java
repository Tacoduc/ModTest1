package com.example.examplemod.util;

import com.example.examplemod.ModItemTier;
import com.example.examplemod.armor.ModArmorMaterial;
import com.example.examplemod.blocks.BlockItemBase;
import com.example.examplemod.blocks.MudBlock;
import com.example.examplemod.Items.ItemBase;
import com.example.examplemod.Tutorial;
import com.example.examplemod.blocks.PrismOre;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Tutorial.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> MUD = ITEMS.register("mud", ItemBase::new);
    public static final RegistryObject<Item> PRISM = ITEMS.register("prism", ItemBase::new);
    public static final RegistryObject<Item> LEAF = ITEMS.register("leaf", ItemBase::new);
    public static final RegistryObject<Item> CUPCAKE = ITEMS.register("cupcake", ItemBase::new);

    //Mud Tools
    public static final RegistryObject<SwordItem> MUD_SWORD = ITEMS.register("mud_sword", () ->
            new SwordItem(ModItemTier.MUD, 2, -2.4F, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<PickaxeItem> MUD_PICKAXE = ITEMS.register("mud_pickaxe", () ->
            new PickaxeItem(ModItemTier.MUD, 0, -2.2F, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<ShovelItem> MUD_SHOVEL = ITEMS.register("mud_shovel", () ->
            new ShovelItem(ModItemTier.MUD, 0, -2.2F, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<AxeItem> MUD_AXE = ITEMS.register("mud_axe", () ->
            new AxeItem(ModItemTier.MUD, 3, -2.2F, new Item.Properties().group(Tutorial.TAB)));

    public static final RegistryObject<HoeItem> MUD_HOE = ITEMS.register("mud_hoe", () ->
            new HoeItem(ModItemTier.MUD,-1.0F, new Item.Properties().group(Tutorial.TAB)));

    //Prism Stuff
    public static final RegistryObject<SwordItem>PRISM_SWORD = ITEMS.register("prism_sword", () -> new SwordItem(ModItemTier.MUD,
            5, -1.4F, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<OreBlock> PRISM_ORE = BLOCKS.register("prism_ore", PrismOre::new);



    //Paper Stuff
    public static final RegistryObject<SwordItem>PAPER_SWORD = ITEMS.register("paper_sword", () -> new SwordItem(ModItemTier.MUD,
            3, -1.0F, new Item.Properties().group(Tutorial.TAB)));



    //Mud Armor
    public static final RegistryObject<ArmorItem>

            MUD_HELMET = ITEMS.register("mud_helmet", () -> new ArmorItem(ModArmorMaterial.MUD, EquipmentSlotType.HEAD, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem>

            MUD_CHESTPLATE = ITEMS.register("mud_chestplate", () -> new ArmorItem(ModArmorMaterial.MUD, EquipmentSlotType.CHEST, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem>

            MUD_LEGGINGS = ITEMS.register("mud_leggings", () -> new ArmorItem(ModArmorMaterial.MUD, EquipmentSlotType.LEGS, new Item.Properties().group(Tutorial.TAB)));
    public static final RegistryObject<ArmorItem>

            MUD_BOOTS = ITEMS.register("mud_boots", () -> new ArmorItem(ModArmorMaterial.MUD, EquipmentSlotType.FEET, new Item.Properties().group(Tutorial.TAB)));


    //Blocks
    public static final RegistryObject<Block> MUD_BLOCK = BLOCKS.register("mud_block", MudBlock::new);


    //Block Items
    public static final RegistryObject<Item> MUD_BLOCK_ITEM = ITEMS.register("mud_block", () -> new BlockItemBase(MUD_BLOCK.get()));

}