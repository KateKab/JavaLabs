package com.epam.team_8.java.lesson3_5.texthandler;

import java.util.List;

public class TableConstructor {
    private static final int FIRST_COLUMN_LENGTH = 5;
    private static final int LAST_COLUMN_LENGTH = 14;
    private static final int CENTER_COLUMN_LENGTH = 80;
    private static final String VERTICAL_BAR = "|";
    private static final String EQUALS_SIGN = "=";
    public static final String SPACE = " ";
    public static final String LINE_BREAK = System.lineSeparator();
    public static final String PLUS = "+";
    public static final String MINUS = "-";


    private String buildBorder() {
        StringBuilder builder = new StringBuilder();
        builder.append(VERTICAL_BAR);
        int length = FIRST_COLUMN_LENGTH + LAST_COLUMN_LENGTH + CENTER_COLUMN_LENGTH + 2;
        for (int i = 0; i < length; i++) {
            builder.append(EQUALS_SIGN);
        }
        builder.append(VERTICAL_BAR);
        builder.append(LINE_BREAK);
        return builder.toString();
    }

    private String buildHeader() {
        StringBuilder builder = new StringBuilder();
        builder.append(VERTICAL_BAR + "  №  " + VERTICAL_BAR);
        String centerTitle = "Sentence";
        int spaceCount = (CENTER_COLUMN_LENGTH - centerTitle.length()) / 2;
        builder.append(getSpaces(spaceCount));
        builder.append(centerTitle);
        spaceCount = CENTER_COLUMN_LENGTH - spaceCount - centerTitle.length();
        builder.append(getSpaces(spaceCount));
        builder.append(VERTICAL_BAR + " Word's Count " + VERTICAL_BAR);
        builder.append(LINE_BREAK);
        builder.append(sepLine(EQUALS_SIGN));
        return builder.toString();

    }

    private String buildRow(int number, Sentence sentence) {
        StringBuilder builder = new StringBuilder();
        builder.append(VERTICAL_BAR);
        builder.append(String.format("%-" + FIRST_COLUMN_LENGTH + "s", number));
        builder.append(VERTICAL_BAR);


        String string = collectString(sentence.getWords());
        int spaceCount = (CENTER_COLUMN_LENGTH - string.length()) / 2;
        builder.append(getSpaces(spaceCount));
        builder.append(string);
        spaceCount = CENTER_COLUMN_LENGTH - string.length() - spaceCount;
        builder.append(getSpaces(spaceCount));

        builder.append(VERTICAL_BAR);
        builder.append(String.format("%" + LAST_COLUMN_LENGTH + "s", sentence.countNumOfWords()));
        builder.append(VERTICAL_BAR);
        builder.append(LINE_BREAK);
        return builder.toString();
    }

    private String collectString(List<Word> words) {
        StringBuilder builder = new StringBuilder();
        for (Word word : words) {
            if (builder.length() + word.getWord().length() < CENTER_COLUMN_LENGTH) {
                builder.append(String.format("%s ", word.getWord()));
            } else {
                break;
            }
        }
        return builder.toString();
    }

    private String getSpaces(int spaceCount) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < spaceCount; i++) {
            builder.append(SPACE);
        }
        return builder.toString();
    }

    private String sepLine(String fillCharacter) {
        StringBuilder builder = new StringBuilder();
        builder.append(VERTICAL_BAR);
        for (int i = 0; i < FIRST_COLUMN_LENGTH; i++) {
            builder.append(fillCharacter);
        }
        builder.append(PLUS);

        for (int i = 0; i < CENTER_COLUMN_LENGTH; i++) {
            builder.append(fillCharacter);
        }
        builder.append(PLUS);

        for (int i = 0; i < LAST_COLUMN_LENGTH; i++) {
            builder.append(fillCharacter);
        }
        builder.append(VERTICAL_BAR);
        builder.append(LINE_BREAK);
        return builder.toString();

    }

    public String create(List<Sentence> sentences) {
        StringBuilder builder = new StringBuilder();
        builder.append(buildBorder()).append(buildHeader());
        int number = 1;
        for (Sentence sentence : sentences) {
            builder.append(buildRow(number, sentence));
            if (number < sentences.size()) {
                builder.append(sepLine(MINUS));
            }
            number++;
        }
        builder.append(buildBorder());
        return builder.toString();
    }
}
