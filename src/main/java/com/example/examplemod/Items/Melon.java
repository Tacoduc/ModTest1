package com.example.examplemod.Items;

import com.example.examplemod.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Melon extends Item {
    public Melon() {
        super(new Properties()
                .group(Tutorial.TAB)
                .food(new Food.Builder()
                    .hunger(3)
                    .setAlwaysEdible()
                    .build())





        );
    }
}
