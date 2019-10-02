package com.epam.team_8.java.lesson1.task2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        StringHandler handler = new StringHandler();
        try {
            System.out.println("Input number of strings: ");
            String[] strings = handler.inputStrings(handler.getNumber());

            System.out.println("Average string length " + handler.countAverageLength(strings));
            List<String> stringsLongerThanAverage = handler.getStringsLongerThanAverage(strings);
            handler.printStrings(stringsLongerThanAverage);
        } finally {
            handler.closeScanner();
        }
    }
}
