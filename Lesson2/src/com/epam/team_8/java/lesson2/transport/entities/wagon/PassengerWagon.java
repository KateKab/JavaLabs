package com.epam.team_8.java.lesson2.transport.entities.wagon;

import com.epam.team_8.java.lesson2.transport.entities.passenger.Passenger;
import com.epam.team_8.java.lesson2.transport.exceptions.WagonOverflowException;
import com.epam.team_8.java.lesson2.transport.utils.ArrayUtils;

public class PassengerWagon extends Wagon {
    private int maxNumberOfPassengers;
    private Passenger[] passengers = {};
    private PassengerWagonClass wagonClass;

    public PassengerWagon() {
        setType(WagonType.PASSENGER);
    }

    public void addPassenger(Passenger passenger) throws WagonOverflowException {
        if (passengers.length < maxNumberOfPassengers) {
            passengers = ArrayUtils.addAndIncrement(passengers, passenger);
        } else {
            throw new WagonOverflowException();
        }

    }

    public int countPassengers() {
        return passengers.length;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public PassengerWagonClass getWagonClass() {
        return wagonClass;
    }

    public void setWagonClass(PassengerWagonClass wagonClass) {
        this.wagonClass = wagonClass;
    }

    public int countLuggage() {
        int result = 0;
        for (Passenger passenger : passengers) {
            if (passenger.isLuggage()) {
                result++;
            }
        }
        return result;
    }
}
