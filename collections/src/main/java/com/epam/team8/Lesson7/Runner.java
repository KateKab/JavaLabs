package com.epam.team8.Lesson7;

import com.epam.team8.Lesson7.collections.FoodProcessor;

/**
 * Hello world!
 */
public class Runner {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.start();
    }

    private void start() {
        processFood();
    }

    private void processFood() {
        FoodProcessor processor = new FoodProcessor();
        processor.processFood();
    }
}
