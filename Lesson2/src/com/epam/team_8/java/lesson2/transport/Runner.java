package com.epam.team_8.java.lesson2.transport;

import com.epam.team_8.java.lesson2.transport.entities.train.Train;
import com.epam.team_8.java.lesson2.transport.entities.train.TrainInitializer;
import com.epam.team_8.java.lesson2.transport.entities.wagon.Wagon;
import com.epam.team_8.java.lesson2.transport.utils.ConsoleUtils;

public class Runner {

    private static final int MIN_PASSENGER_NUMBER = 2;
    private static final int MAX_PASSENGER_NUMBER = 5;

    public static void main(String[] args) {
        Train train = (new TrainInitializer()).initialize();
        ConsoleUtils consoleUtils = new ConsoleUtils();
        // Print source train
        consoleUtils.showMessage("Source train");
        consoleUtils.printTrain(train);
        // Print number of passengers
        consoleUtils.printPassengersNumber(train);
        // Print number of luggage
        consoleUtils.printLuggageNumber(train);
        // Print sorted train
        consoleUtils.showMessage("Sorted train");
        train.sortByWagonType();
        consoleUtils.printTrain(train);
        // Print wagons with numbers of passengers from range
        Wagon[] wagonsWithPassengers = train.findWagonByNumberOfPassengers(MIN_PASSENGER_NUMBER,
                MAX_PASSENGER_NUMBER);
        consoleUtils.showMessage(String.format("Wagons with numbers of passengers from %d to %d", MIN_PASSENGER_NUMBER, MAX_PASSENGER_NUMBER));
        for (Wagon wagonsWithPassenger : wagonsWithPassengers) {
            consoleUtils.printWagon(wagonsWithPassenger);
        }
    }
}
