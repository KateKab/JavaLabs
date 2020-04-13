package ru.rsreu.speedtest.testers;

import ru.rsreu.speedtest.utils.TimeCounter;

import java.util.Collection;

public class CollectionSpeedTester<T> {

    private Collection<T> collection;
    private Collection<T> data;
    private TimeCounter timeCounter;

    public CollectionSpeedTester(Collection collection, Collection data) {
        timeCounter = TimeCounter.getInstance();
        this.collection = collection;
        this.data = data;
    }

    public long countAddAverageTime() {
        long sum = 0;
        for (T t : data) {
            sum += add(t);
        }
        return sum / data.size();
    }

    public long countFindAverageTime() {
        long sum = 0;
        for (T t : data) {
            sum += find(t);
        }
        return sum / data.size();
    }

    public long countRemoveAverageTime() {
        long sum = 0;
        for (T t : data) {
            sum += remove(t);
        }
        return sum / data.size();
    }

    private long add(T value) {
        timeCounter.start();
        collection.add(value);
        return timeCounter.stop();
    }

    private long find(T value) {
        timeCounter.start();
        collection.contains(value);
        return timeCounter.stop();
    }

    private long remove(T value) {
        timeCounter.start();
        collection.remove(value);
        return timeCounter.stop();
    }
}
