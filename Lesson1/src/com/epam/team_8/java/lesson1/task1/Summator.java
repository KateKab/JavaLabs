package com.epam.team_8.java.lesson1.task1;

import java.util.Arrays;

public class Summator {

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

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray(){
        return array;
    }
}
