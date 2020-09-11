package com.example.examplemod.Items;

import com.example.examplemod.Tutorial;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
public class Cupcake extends Item {
    public Cupcake() {
        super(new Item.Properties()
                .group(Tutorial.TAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .setAlwaysEdible()
                        .build())
        );
    }

}
