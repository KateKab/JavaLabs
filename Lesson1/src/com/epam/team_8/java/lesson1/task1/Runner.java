package com.epam.team_8.java.lesson1.task1;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Summator summator = new Summator();

        summator.setArray(ArrayGenerator.generateArray());
        System.out.println(Arrays.toString(summator.getArray()));
        int sumElementsInEvenPosition = summator.sumElementsInEvenPosition();
        System.out.println("Sum of elements in even positions " + sumElementsInEvenPosition);
    }
}
