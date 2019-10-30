package com.epam.team_8.java.lesson2.transport.entities.wagon;

import java.util.Comparator;

public class WagonTypeComparator implements Comparator<Wagon> {
    @Override
    public int compare(Wagon o1, Wagon o2) {
        int result = 0;
        if (o1.getType().ordinal() > o2.getType().ordinal()) {
            result = 1;
        } else if (o1.getType().ordinal() < o2.getType().ordinal()) {
            result = -1;
        }
        return result;
    }
}
