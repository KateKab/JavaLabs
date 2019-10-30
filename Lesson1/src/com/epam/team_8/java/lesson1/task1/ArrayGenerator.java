package com.epam.team_8.java.lesson1.task1;

public class ArrayGenerator {
    private static final int MIN_VALUE = 2;
    private static final int MAX_VALUE = 150;
    private static final int SIZE = 20;

    public static int[] generateArray() {
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber(MIN_VALUE, MAX_VALUE);
        }
        return array;
    }

    private static int generateNumber(int min, int max) {
        return (int) (min +(Math.random() * ((max - min) + 1)));
    }
}
