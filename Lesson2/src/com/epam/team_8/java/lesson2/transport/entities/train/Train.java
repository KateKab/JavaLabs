package com.epam.team_8.java.lesson2.transport.entities.train;

import com.epam.team_8.java.lesson2.transport.entities.wagon.PassengerWagon;
import com.epam.team_8.java.lesson2.transport.entities.wagon.Wagon;
import com.epam.team_8.java.lesson2.transport.entities.wagon.WagonTypeComparator;
import com.epam.team_8.java.lesson2.transport.utils.ArrayUtils;

import java.util.Arrays;

public class Train {
    private Wagon[] wagons = {};
    private int number;

    public Wagon[] getWagons() {
        return wagons;
    }

    public void setWagons(Wagon[] wagons) {
        this.wagons = wagons;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int countPassengers() {
        int result = 0;
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassengerWagon){
                result +=((PassengerWagon) wagon).countPassengers();
            }
        }
        return result;
    }

    public int countLuggage() {
        int result = 0;
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassengerWagon){
                result +=((PassengerWagon) wagon).countLuggage();
            }
        }
        return result;
    }

    public void addWagon(Wagon wagon) {
        wagons = ArrayUtils.addAndIncrement(wagons, wagon);
    }

    public void sortByWagonType() {
        Arrays.sort(wagons, new WagonTypeComparator());
    }

    public Wagon[] findWagonByNumberOfPassengers(int minNumber, int maxNumber) {
        Wagon[] result = {};
        for (Wagon wagon : wagons) {
            if (wagon instanceof PassengerWagon) {
                int numberOfPassengers = ((PassengerWagon) wagon).countPassengers();
                if (numberOfPassengers >= minNumber && numberOfPassengers <= maxNumber) {
                    result = ArrayUtils.addAndIncrement(result, wagon);
                }
            }
        }
        return result;
    }
}
