package com.epam.team8.Lesson8_9.collections;


import com.epam.team8.Lesson8_9.collections.entities.Line;
import com.epam.team8.Lesson8_9.collections.entities.Point;
import com.epam.team8.Lesson8_9.collections.parsers.PointParser;
import com.epam.team8.Lesson8_9.collections.utils.FileHandler;
import com.epam.team8.Lesson8_9.collections.utils.LineBuilder;
import com.epam.team8.Lesson8_9.collections.utils.LineWriteUtil;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class LineProcessor {
    public static final String SOURCE_FILE_NAME = "points.data";
    public static final String TARGET_FILE_NAME = "lines.data";

    private FileHandler handler;

    public LineProcessor() {
        handler = new FileHandler();
    }

    public void processLines() {
        try {
            Set<Point> points = parsPoints(handler);
            Set<Line> lines = createLines(points);
            Map<Line, List<Point>> map = findPointsBelongToLines(points, lines);
            saveLines(map);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void saveLines(Map<Line, List<Point>> map) throws IOException {
        LineWriteUtil writeUtil = new LineWriteUtil();
        handler.write(TARGET_FILE_NAME, writeUtil.convertLinesToWriteFormat(map));
    }

    private Map<Line, List<Point>> findPointsBelongToLines(Set<Point> points, Set<Line> lines) {
        Map<Line, List<Point>> result = new HashMap<>();

        for (Line line : lines) {
            List<Point> linePoints = new LinkedList<>();
            for (Point point : points) {
                if (line.checkIfBelong(point)) {
                    linePoints.add(point);
                }
            }
            result.put(line, linePoints);
        }
        return result;
    }

    private Set<Line> createLines(Set<Point> points) {
        LineBuilder lineBuilder = new LineBuilder();
        return lineBuilder.buildLines(points);
    }

    private Set<Point> parsPoints(FileHandler handler) throws IOException {
        List<String> strings = handler.read(SOURCE_FILE_NAME);
        Collection<Point> points = new PointParser().parseAll(strings);
        return new HashSet<>(points);
    }
}
