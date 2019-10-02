package com.epam.team_8.java.lesson1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringHandler {
    private Scanner scanner = new Scanner(System.in);

    public void closeScanner() {
        scanner.close();
    }

    public int getNumber() {
        return Integer.parseInt(scanner.nextLine());
    }

    public String[] inputStrings(int n) {
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input string № " + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }
        return strings;
    }

    private int countSumLength(String[] strings) {
        int sum = 0;
        for (String item : strings) {
            sum += item.length();
        }
        return sum;
    }

    public double countAverageLength(String[] strings) {
        return countSumLength(strings) * 1.0 / strings.length;
    }

    public List<String> getStringsLongerThanAverage(String[] strings) {
        double averageLength = countAverageLength(strings);
        List<String> resultStrings = new ArrayList<>();
        for (String string : strings) {
            if (string.length() > averageLength) {
                resultStrings.add(string);
            }
        }
        return resultStrings;
    }

    public void printStrings(List<String> strings) {
        for (String string : strings) {
            System.out.println("string: " + string + " length: " + string.length());
        }

    }
}

