package com.example.examplemod.Items;

import com.example.examplemod.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Cherry extends Item {
    public Cherry() {
        super(new Item.Properties()
                .group(Tutorial.TAB)
                .food(new Food.Builder()
                    .hunger(4)
                    .setAlwaysEdible()
                    .build())





        );
    }
}
