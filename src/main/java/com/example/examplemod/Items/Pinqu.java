package com.example.examplemod.Items;

import com.example.examplemod.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pinqu extends Item {
    public Pinqu() {
        super(new Properties()
                .group(Tutorial.TAB)
                .food(new Food.Builder()
                    .hunger(4)
                    .setAlwaysEdible()
                    .build())





        );
    }
}
