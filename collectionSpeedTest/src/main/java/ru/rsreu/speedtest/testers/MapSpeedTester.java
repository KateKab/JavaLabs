package ru.rsreu.speedtest.testers;

import ru.rsreu.speedtest.utils.TimeCounter;

import java.util.Collection;
import java.util.Map;

public class MapSpeedTester<K, V> {

    private Map<K, V> map;
    private Collection<K> data;
    private TimeCounter timeCounter;

    public MapSpeedTester(Map<K, V> map, Collection<K> data) {
        timeCounter = TimeCounter.getInstance();
        this.map = map;
        this.data = data;
    }

    public long countAddAverageTime() {
        long sum = 0;
        for (K t : data) {
            sum += add(t, (V) t);
        }
        return sum / data.size();
    }

    public long countFindAverageTime() {
        long sum = 0;
        for (K t : data) {
            sum += find(t);
        }
        return sum / data.size();
    }

    public long countRemoveAverageTime() {
        long sum = 0;
        for (K t : data) {
            sum += remove(t);
        }
        return sum / data.size();
    }

    private long add(K key, V value) {
        timeCounter.start();
        map.put(key, value);
        return timeCounter.stop();
    }

    private long find(K key) {
        timeCounter.start();
        map.containsKey(key);
        return timeCounter.stop();
    }

    private long remove(K key) {
        timeCounter.start();
        map.remove(key);
        return timeCounter.stop();
    }
}
