package com.bridgelabz;

public class Car {
    int speed;
    int fuel;
    int distance;

    public Car(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
        this.distance = 0;
    }

    public void drive(int hours) {
        int possibleHours = Math.min(hours, fuel);
        distance += speed * possibleHours;
        fuel -= possibleHours;
        System.out.println("Distance: " + distance + ", Fuel Left: " + fuel);
    }
}

class ElectricCar extends Car {
    public ElectricCar(int speed, int battery) {
        super(speed, battery); // fuel acts as battery percentage
    }

    @Override
    public void drive(int hours) {
        int possibleHours = Math.min(hours, fuel / 10);
        distance += speed * possibleHours;
        fuel -= possibleHours * 10;
        System.out.println("Distance: " + distance + ", Battery Left: " + fuel + "%");
    }
}

 class CarTest {
    public static void main(String[] args) {
        Car petrolCar = new Car(60, 5);
        petrolCar.drive(4);

        ElectricCar ev = new ElectricCar(50, 80); // battery = 80%
        ev.drive(5);
    }
}

