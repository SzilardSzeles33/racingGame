package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    String name;
    double mileage;
    String color;
    double maxSpeed;
    boolean running;
    double fuelLevel;
    double traveledDistance;
    LocalDate createdDate;

    public double acccelerate(double speed, double durationInHours) {
        if (fuelLevel > 0) {
            System.out.println("You don't have enough fuel to accelerate. Fuel level: " + fuelLevel);
            return 0;
        }
        if (speed> maxSpeed) {
            System.out.println("Requested speed is too high. Maximum allowed: " + maxSpeed);
            return 0;
        }

        //concatenation
        System.out.println(name + "is accelerating with" + speed + "km/h for" + durationInHours + "h");

        double distance = speed * durationInHours;
        System.out.println("Traveled" + distance + "km.");
        //traveledDistance = traveledDistance + distance;
        traveledDistance += distance;
        //logs
        System.out.println("Total traveled distance " + traveledDistance + "km.");
        double spentFuel = distance / 100 *mileage;
        System.out.println("Spent fuel: " + spentFuel + "l.");
        //fuelLevel = fuelLevel - spentFuel;
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel: " + fuelLevel + "l");

        return distance;
    }
}
