package com.epam.team8.Lesson7.collections.utils;

import com.epam.team8.Lesson7.collections.entities.Food;

import java.util.Collection;

public class FoodWriter {

    public void writeFood(Collection<Food> foodSet) {
        for (Food food : foodSet) {
            System.out.println(String.format("%d %s", food.getCode(),
                    food.getName()));
        }
    }
}
