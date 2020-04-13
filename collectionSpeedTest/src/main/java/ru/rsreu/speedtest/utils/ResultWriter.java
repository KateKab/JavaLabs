package ru.rsreu.speedtest.utils;

import java.util.Formatter;

public class ResultWriter {
    private static final String FORMAT_STRING =
            "%-10s collection %-7s operation average execution time = %5d";
    private static final String REMOVE = "REMOVE";
    private static final String FIND = "FIND";
    private static final String ADD = "ADD";
    private Formatter formatter;
    private StringBuilder builder;

    public ResultWriter() {
        builder = new StringBuilder();
        formatter = new Formatter(builder);
    }

    public void writeAddSpeed(Class aClass, long time) {
        resetBuilder();
        printMessage(prepareString(aClass, ADD, time));
    }

    public void writeRemoveSpeed(Class aClass, long time) {
        resetBuilder();
        printMessage(prepareString(aClass, REMOVE, time));
    }

    public void writeFindSpeed(Class aClass, long time) {
        resetBuilder();
        printMessage(prepareString(aClass, FIND, time));
    }

    public void writeSeparateLine() {
        resetBuilder();
        printMessage("");
    }

    private void resetBuilder() {
        builder.setLength(0);
    }

    private String prepareString(Class aClass, String methodName, long time) {
        return formatter.format(FORMAT_STRING,
                aClass.getSimpleName(),
                methodName,
                time).toString();
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
