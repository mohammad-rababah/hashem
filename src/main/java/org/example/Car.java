package org.example;

public class Car {
    String color;
    int year;

    int numberOfCylinders;
    String fuelType;
    int numberOfCycles;

    Engine engine; // this is composition example

    void changeEngin(Engine engine) {
        this.engine = engine;

    }

    void changeEngin(int numberOfCylinders, String fuelType, int numberOfCycles) {
        this.numberOfCylinders = numberOfCylinders;
        this.fuelType = fuelType;
        this.numberOfCycles = numberOfCycles;

    }


}
