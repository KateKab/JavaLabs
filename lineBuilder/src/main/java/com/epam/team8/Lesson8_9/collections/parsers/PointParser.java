package com.epam.team8.Lesson8_9.collections.parsers;



import com.epam.team8.Lesson8_9.collections.entities.Point;
import com.epam.team8.Lesson8_9.collections.exceptions.InvalidDataException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PointParser implements Parser<Point> {

    public static final String DELIMITER = " ";
    public static final int DIMENSIONS = 2;

    @Override
    public Point parse(String string) throws InvalidDataException {
        String[] coordinates = string.split(DELIMITER);
        Point point = new Point();
        try {
            if (coordinates.length == DIMENSIONS) {
                point.setX(Integer.parseInt(coordinates[0]));
                point.setY(Integer.parseInt(coordinates[1]));
            } else {
                throw new InvalidDataException("too many arguments");
            }
        } catch (NumberFormatException ex) {
            throw new InvalidDataException(ex);
        }
        return point;
    }

    @Override
    public Collection<Point> parseAll(Collection<String> lines) {
        Set<Point> result = new HashSet<>();
        for (String line : lines) {
            try {
                result.add(parse(line));
            } catch (InvalidDataException e) {
                System.out.println(String.format("invalid coordinates: %s. %s",
                        line, e.getMessage()));
            }
        }
        return result;
    }
}
