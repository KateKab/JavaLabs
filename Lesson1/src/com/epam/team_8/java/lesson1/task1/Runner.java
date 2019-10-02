package com.epam.team_8.java.lesson1.task1;

public class Runner {

    public static void main(String[] args) {

        Summator summator = new Summator();

        summator.setArray(summator.generateArray());
        summator.printArray();
        int sumElementsInEvenPosition = summator.sumElementsInEvenPosition();
        System.out.println("Sum of elements in even positions " + sumElementsInEvenPosition);
    }
}
