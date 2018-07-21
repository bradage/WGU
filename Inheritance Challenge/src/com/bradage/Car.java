package com.bradage;

public class Car extends Vehicle {

    private int numGears;
    private int doors;
    private int wheels;

    public Car(int speed, String vehicleType, String steering, String transmissionType, int numGears, int doors, int wheels) {
        super(speed, vehicleType, steering, transmissionType);
        this.numGears = numGears;
        this.doors = doors;
        this.wheels = wheels;
    }

    public int getNumGears() {
        return numGears;
    }

    public void setNumGears(int numGears) {
        this.numGears = numGears;
        System.out.println("There are " + numGears + "gears used with this vehicle");
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
        System.out.println("There are "+ doors + "on this vehicle. ");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
        System.out.println("This vehicle has " +  wheels + " wheels");
    }
}
