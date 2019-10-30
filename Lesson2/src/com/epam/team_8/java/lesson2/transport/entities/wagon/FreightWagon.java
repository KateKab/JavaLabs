package com.epam.team_8.java.lesson2.transport.entities.wagon;

public class FreightWagon extends Wagon {
    private int maxWeight;
    private FreightWagonClass wagonClass;

    public FreightWagon() {
        setType(WagonType.FREIGHT);
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public FreightWagonClass getWagonClass() {
        return wagonClass;
    }

    public void setWagonClass(FreightWagonClass wagonClass) {
        this.wagonClass = wagonClass;
    }
}
