package com.epam.team8.Lesson8_9.collections.entities;

import java.util.Objects;

public class Line {
    private String formula;
    private Point onePoint;
    private Point anotherPoint;

    public Line(Point onePoint, Point anotherPoint) {
        this.onePoint = onePoint;
        this.anotherPoint = anotherPoint;
        prepareFormula();
    }

    public String getFormula() {
        return formula;
    }

    public boolean checkIfBelong(Point point) {
        //TODO Division by zero
        return ((point.getX() - onePoint.getX()))
                * (anotherPoint.getY() - onePoint.getY())
                == (point.getY() - onePoint.getY())
                * (anotherPoint.getX() - onePoint.getX());

    }

    private void prepareFormula() {
        formula = String.format("(y - %d) / (%d - %d) = (x - %d) / ((%d - %d)",
                onePoint.getY(),
                anotherPoint.getY(),
                onePoint.getY(), onePoint.getX(), anotherPoint.getX(),
                onePoint.getX());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return formula.equals(line.formula) &&
                onePoint.equals(line.onePoint) &&
                anotherPoint.equals(line.anotherPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(/*points,*/ formula, onePoint, anotherPoint);
    }
}
