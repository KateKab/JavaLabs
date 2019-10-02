package com.epam.team_8.java.lesson1.task1;

import java.util.Arrays;

public class Summator {

    private static final int SIZE = 20;
    private static final int LENGTH = 10;
    private static final int DIVIDER = 2;

    private int[] array;

    public Summator() {
    }

    public int sumElementsInEvenPosition() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % DIVIDER == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    public int[] generateArray() {
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * SIZE) - LENGTH);
        }
        return array;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray(){
        return array;
    }
}
