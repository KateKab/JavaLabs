package com.epam.team8.Lesson8_9;

import com.epam.team8.Lesson8_9.collections.LineProcessor;

public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.start();
    }

    private void start() {
        processFood();
    }

    private void processFood() {
        LineProcessor processor = new LineProcessor();
        processor.processLines();
    }
}
