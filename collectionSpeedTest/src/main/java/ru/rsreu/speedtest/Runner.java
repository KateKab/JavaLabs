package ru.rsreu.speedtest;

import ru.rsreu.speedtest.testers.CollectionSpeedTester;
import ru.rsreu.speedtest.testers.MapSpeedTester;
import ru.rsreu.speedtest.utils.DataGenerator;
import ru.rsreu.speedtest.utils.ResultWriter;

import java.util.*;

public class Runner {

    public static final int QUANTITY = 100;

    public static void main(String[] args) {
        DataGenerator generator = new DataGenerator();
        String[] strings = generator.getStrings(QUANTITY);
        List<String> data = Arrays.asList(strings);
        testCollection(new ArrayList<>(), data);
        testCollection(new LinkedList<>(), data);
        testCollection(new TreeSet<>(), data);
        testCollection(new HashSet<>(), data);
        testMap(new HashMap<>(), data);
    }

    private static void testCollection(Collection<String> collection,
                                       List<String> data) {
        ResultWriter writer = new ResultWriter();
        Class aClass = collection.getClass();
        CollectionSpeedTester<String> tester =
                new CollectionSpeedTester<>(collection, data);
        writer.writeAddSpeed(aClass, tester.countAddAverageTime());
        writer.writeFindSpeed(aClass, tester.countFindAverageTime());
        writer.writeRemoveSpeed(aClass, tester.countRemoveAverageTime());
        writer.writeSeparateLine();
    }

    private static void testMap(Map<String, String> map, List<String> data) {
        ResultWriter writer = new ResultWriter();
        Class aClass = map.getClass();
        MapSpeedTester<String, String> tester = new MapSpeedTester<>(map, data);
        writer.writeAddSpeed(aClass, tester.countAddAverageTime());
        writer.writeFindSpeed(aClass, tester.countFindAverageTime());
        writer.writeRemoveSpeed(aClass, tester.countRemoveAverageTime());
    }
}
