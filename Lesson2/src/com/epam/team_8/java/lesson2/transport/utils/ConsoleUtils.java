package com.epam.team_8.java.lesson2.transport.utils;

import com.epam.team_8.java.lesson2.transport.entities.passenger.Passenger;
import com.epam.team_8.java.lesson2.transport.entities.train.Train;
import com.epam.team_8.java.lesson2.transport.entities.wagon.PassengerWagon;
import com.epam.team_8.java.lesson2.transport.entities.wagon.Wagon;

public class ConsoleUtils {

    public void printTrain(Train train) {
        showMessage(trainToString(train));
    }

    public void printWagon(Wagon wagon) {
        showMessage(wagonToString(wagon));
    }

    public void printPassengersNumber(Train train) {
        showMessage(String.format("Number of passengers: %d%n", train.countPassengers()));
    }

    public void printLuggageNumber(Train train) {
        showMessage(String.format("Number of luggage: %d%n", train.countLuggage()));
    }

    private String trainToString(Train train) {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Train: %s%n", train.getNumber()));
        Wagon[] wagons = train.getWagons();
        for (Wagon wagon : wagons) {
            builder.append(wagonToString(wagon));
        }
        return builder.toString();
    }

    private String wagonToString(Wagon wagon) {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("\tWagon №: %s, type: %s%n",wagon.getNumber(), wagon.getType()));
        if (wagon instanceof PassengerWagon) {
            Passenger[] passengers = ((PassengerWagon) wagon).getPassengers();
            for (Passenger passenger : passengers) {
                builder.append(passengerToString(passenger));
            }
        }
        return builder.toString();
    }

    private String passengerToString(Passenger passenger) {
        return String.format("\t\t%s %s, Seat: %d, Luggage: %b%n",
                passenger.getName(),
                passenger.getSurname(),
                passenger.getSeat(),
                passenger.isLuggage());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
