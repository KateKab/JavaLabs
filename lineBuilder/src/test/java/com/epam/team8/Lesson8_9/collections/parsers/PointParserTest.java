package com.epam.team8.Lesson8_9.collections.parsers;

import com.epam.team8.Lesson8_9.collections.entities.Point;
import com.epam.team8.Lesson8_9.collections.exceptions.InvalidDataException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class PointParserTest {
    private PointParser parser;

    @Before
    public void initialize() {
        parser = new PointParser();
    }

    @Test
    public void parseMethodValidDataTest() {
        String data = "1 2";
        try {
            Point point = parser.parse(data);
            assertEquals(1, point.getX());
            assertEquals(2, point.getY());
        } catch (InvalidDataException e) {
            System.out.println("error" + e.getMessage());
        }
    }

    @Test
    public void parseAllTest() {
        List<String> data = new ArrayList<>(Arrays.asList("1 2", "3 4", "5 6"));
        Collection<Point> pointCollection = parser.parseAll(data);
        Point[] points = new Point[pointCollection.size()];
        pointCollection.toArray(points);

        assertEquals(1, points[0].getX());
        assertEquals(2, points[0].getY());
        assertEquals(3, points[1].getX());
        assertEquals(4, points[1].getY());
        assertEquals(5, points[2].getX());
        assertEquals(6, points[2].getY());
    }

    @Test(expected = InvalidDataException.class)
    public void parseMethodInvalidDataTest() throws InvalidDataException {
        String data = "1 sd";
            parser.parse(data);

    }
}