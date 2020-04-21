package com.epam.team8.Lesson8_9.collections.utils;



import com.epam.team8.Lesson8_9.collections.entities.Line;
import com.epam.team8.Lesson8_9.collections.entities.Point;

import java.util.*;

public class LineBuilder {

    public Set<Line> buildLines(Set<Point> points) {
        Set<Line> lines = new HashSet<>();
        Set<Point> temp = new HashSet<>(points);
        Iterator<Point> iterator = temp.iterator();
        while (iterator.hasNext()) {
            Point nextPoint = iterator.next();
            for (Point point : temp) {
                if (!nextPoint.equals(point)) {
                    lines.add(new Line(nextPoint, point));
                }
            }
            iterator.remove();
        }
        return lines;
    }
}