package ru.rsreu.speedtest.utils;

public class DataGenerator {

    public static final String WORD = "a";

    public String[] getStrings(int quantity) {
        String[] result = new String[quantity];
        String temp = WORD;
        for (int i = 0; i < quantity; i++) {
            result[i] = temp;
            temp += WORD;
        }
        return result;
    }
}
