package com.epam.team_8.java.lesson2.transport.entities.train;

import com.epam.team_8.java.lesson2.transport.entities.passenger.Passenger;
import com.epam.team_8.java.lesson2.transport.entities.wagon.*;
import com.epam.team_8.java.lesson2.transport.exceptions.WagonOverflowException;

public class TrainInitializer {
    public Train initialize() {
        Train result = new Train();
        try {
            FreightWagon post = new FreightWagon();
            post.setMaxWeight(300);
            post.setWagonClass(FreightWagonClass.POST);
            post.setNumber(7);

            result.addWagon(post);

            PassengerWagon passengerWagon = new PassengerWagon();
            passengerWagon.setWagonClass(PassengerWagonClass.SEATING);
            passengerWagon.setMaxNumberOfPassengers(5);
            passengerWagon.setNumber(1);

            Passenger passenger = new Passenger();
            passenger.setName("Ivan");
            passenger.setSurname("Belov");
            passenger.setLuggage(true);
            passenger.setSeat(5);
            passengerWagon.addPassenger(passenger);

            Passenger passenger1 = new Passenger();
            passenger1.setName("Mikhail");
            passenger1.setSurname("Belov");
            passenger1.setLuggage(false);
            passenger1.setSeat(4);
            passengerWagon.addPassenger(passenger1);

            result.addWagon(passengerWagon);

            PassengerWagon passengerWagon1 = new PassengerWagon();
            passengerWagon1.setWagonClass(PassengerWagonClass.SEATING);
            passengerWagon1.setMaxNumberOfPassengers(5);
            passengerWagon1.setNumber(3);

            Passenger passenger2 = new Passenger();
            passenger2.setName("Ann");
            passenger2.setSurname("Ivanova");
            passenger2.setLuggage(true);
            passenger2.setSeat(1);
            passengerWagon1.addPassenger(passenger2);

            Passenger passenger3 = new Passenger();
            passenger3.setName("Kate");
            passenger3.setSurname("Kabanova");
            passenger3.setLuggage(false);
            passenger3.setSeat(2);
            passengerWagon1.addPassenger(passenger3);

            result.addWagon(passengerWagon1);

            PassengerWagon passengerWagon2 = new PassengerWagon();
            passengerWagon2.setWagonClass(PassengerWagonClass.SEATING);
            passengerWagon2.setMaxNumberOfPassengers(5);
            passengerWagon2.setNumber(2);

            Passenger passenger4 = new Passenger();
            passenger4.setName("Alina");
            passenger4.setSurname("Borts");
            passenger4.setLuggage(false);
            passenger4.setSeat(4);
            passengerWagon2.addPassenger(passenger4);

            result.addWagon(passengerWagon2);

            FreightWagon wagon = new FreightWagon();
            wagon.setMaxWeight(1000);
            wagon.setWagonClass(FreightWagonClass.LUGGAGE);
            wagon.setNumber(5);

            result.addWagon(wagon);



        } catch (WagonOverflowException woe) {
            System.out.println(woe.getMessage());
        }
        return result;
    }
}
