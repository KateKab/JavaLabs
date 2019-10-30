package com.epam.team_8.java.lesson2.transport.utils;

import com.epam.team_8.java.lesson2.transport.entities.passenger.Passenger;
import com.epam.team_8.java.lesson2.transport.entities.wagon.Wagon;

import java.util.Arrays;

public final class ArrayUtils {
    public static Passenger[] addAndIncrement(Passenger[] array, Passenger item) {
        Passenger[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = item;
        return result;
    }

    public static Wagon[] addAndIncrement(Wagon[] array, Wagon item) {
        Wagon[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = item;
        return result;
    }
}
