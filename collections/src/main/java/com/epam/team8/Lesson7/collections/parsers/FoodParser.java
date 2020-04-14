package com.epam.team8.Lesson7.collections.parsers;

import com.epam.team8.Lesson7.collections.entities.Food;
import com.epam.team8.Lesson7.collections.exceptions.InvalidDataException;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class FoodParser implements Parser<Food> {
    public static final String DELIMITER = " ";
    public static final int DIMENSIONS = 2;

    @Override
    public Food parse(String string) throws InvalidDataException {
        String[] coordinates = string.split(DELIMITER);
        Food food = new Food();
        try {
            if (coordinates.length == DIMENSIONS) {
                food.setCode(Integer.parseInt(coordinates[0]));
                food.setName(coordinates[1]);
            } else {
                throw new InvalidDataException("too many arguments");
            }
        } catch (NumberFormatException ex) {
            throw new InvalidDataException(ex);
        }
        return food;
    }

    @Override
    public Collection<Food> parseAll(Collection<String> lines) {
        List<Food> result = new LinkedList<>();
        for (String line : lines) {
            try {
                result.add(parse(line));
            } catch (InvalidDataException e) {
                System.out.println(String.format("invalid product code: %s. %s",
                        line, e.getMessage()));
            }
        }
        return result;
    }
}
