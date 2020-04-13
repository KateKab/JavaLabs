package ru.rsreu.speedtest.utils;

import org.apache.commons.lang3.time.StopWatch;

public class TimeCounter {
    private static StopWatch watch;
    private static TimeCounter instance;

    private TimeCounter() {
    }

    public static TimeCounter getInstance() {
        if (watch == null) {
            watch = new StopWatch();
        }
        if (instance == null) {
            instance = new TimeCounter();
        }
        return instance;
    }

    public void start() {
        watch.reset();
        watch.start();
    }

    public long stop() {
        watch.stop();
        return watch.getNanoTime();
    }
}
