package com.epam.team_8.java.lesson2.transport.entities.wagon;

public abstract class Wagon {
    private int number;
    private WagonType type;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public WagonType getType() {
        return type;
    }

    protected void setType(WagonType type) {
        this.type = type;
    }
}
