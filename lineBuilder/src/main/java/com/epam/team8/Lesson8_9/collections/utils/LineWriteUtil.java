package com.epam.team8.Lesson8_9.collections.utils;

import com.epam.team8.Lesson8_9.collections.entities.Line;
import com.epam.team8.Lesson8_9.collections.entities.Point;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LineWriteUtil {
    public List<String> convertLinesToWriteFormat(Map<Line,
                List<Point>> linesMap) {
        StringBuilder builder = new StringBuilder();
        String formatLine = "%s. %d points: ";
        String formatPoint = "(%d; %d), ";
        List<String> result = new LinkedList<>();

        for (Line line : linesMap.keySet()) {
            List<Point> points = linesMap.get(line);
            builder.append(String.format(formatLine, line.getFormula(),
                    points.size()));
            for (Point point : points) {
                builder.append(String.format(formatPoint, point.getX(),
                        point.getY()));
            }
            builder.replace(builder.lastIndexOf(","), builder.length(), ".");
            result.add(builder.toString());
            builder.setLength(0);
        }
        return result;
    }
}
