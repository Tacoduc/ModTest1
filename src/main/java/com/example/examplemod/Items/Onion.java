package com.example.examplemod.Items;

import com.example.examplemod.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Onion extends Item {
    public Onion() {
        super(new Properties()
                .group(Tutorial.TAB)
                .food(new Food.Builder()
                    .hunger(1)
                    .setAlwaysEdible()
                    .build())





        );
    }
}
