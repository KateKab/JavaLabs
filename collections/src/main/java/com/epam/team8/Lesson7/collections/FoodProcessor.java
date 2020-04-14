package com.epam.team8.Lesson7.collections;

import com.epam.team8.Lesson7.collections.entities.Food;
import com.epam.team8.Lesson7.collections.parsers.FoodParser;
import com.epam.team8.Lesson7.collections.utils.FoodWriter;
import com.epam.team8.Lesson7.collections.utils.FileHandler;

import java.io.IOException;
import java.util.*;

public class FoodProcessor {
    public void processFood() {
        List<Food> foodSet = (List<Food>) readFood();
        writeFood(foodSet);
        System.out.println();
        Set<Food> compressedFoodSet = compressFood(foodSet);
        writeFood(compressedFoodSet);
    }

    private Collection<Food> readFood() {
        FileHandler handler = new FileHandler();
        Collection<Food> result = null;
        try {
            List<String> lines = handler.read("food.data");
            Collections.sort(lines);
            FoodParser parser = new FoodParser();
            result = parser.parseAll(lines);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }


    private Set<Food> compressFood(Collection<Food> foodSet) {
        return new TreeSet<>(foodSet);
    }


    private void writeFood(Collection<Food> foodSet) {
        FoodWriter writer = new FoodWriter();
        writer.writeFood(foodSet);
    }
}
