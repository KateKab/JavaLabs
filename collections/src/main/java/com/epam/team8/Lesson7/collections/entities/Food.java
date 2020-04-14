package com.epam.team8.Lesson7.collections.entities;

import java.util.Objects;

public class Food implements Comparable<Food> {
    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food that = (Food) o;
        return code == that.code &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Food o) {
        return code - o.code;
    }
}
