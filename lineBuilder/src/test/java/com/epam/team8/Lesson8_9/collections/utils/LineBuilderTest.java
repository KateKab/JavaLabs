package com.epam.team8.Lesson8_9.collections.utils;

import com.epam.team8.Lesson8_9.collections.entities.Line;
import com.epam.team8.Lesson8_9.collections.entities.Point;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class LineBuilderTest {

    @Test
    public void buildLinesTest() {
        LineBuilder builder = new LineBuilder();
        Point point1 = new Point();
        point1.setX(0);
        point1.setY(0);
        Point point2 = new Point();
        point2.setX(1);
        point2.setY(0);
        Point point3 = new Point();
        point3.setX(0);
        point3.setY(1);

        Set<Line> lines = builder.buildLines(
                new HashSet<>(Arrays.asList(point1, point2, point3)));
        assertEquals(lines.size(), 3);
    }
}