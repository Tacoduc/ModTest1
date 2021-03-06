package com.example.examplemod;

import com.example.examplemod.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    MUD(1, 107, 3.0F, 2.0F, 10, () ->{
        return Ingredient.fromItems(RegistryHandler.MUD_SWORD.get());
    }),

    PRISM(3, 2000, 5.0F, 3.0F, 13, () ->{
        return Ingredient.fromItems(RegistryHandler.PRISM_SWORD.get());
    }),


    PAPER(1, 800, 5.0F, 3.0F, 6, () ->{
        return Ingredient.fromItems(RegistryHandler.PAPER_SWORD.get());
    }),

    PLASTIC(1, 500, 6.0F, 2.0F, 15, () ->{
        return Ingredient.fromItems(RegistryHandler.PLASTIC_SWORD.get());
    }),

    LAVA(1, 2000, 6.0F, 260F, 5, () ->{
        return Ingredient.fromItems(RegistryHandler.LAVA_SWORD.get());
    });


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency =efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this. repairMaterial = repairMaterial;
    }



    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
