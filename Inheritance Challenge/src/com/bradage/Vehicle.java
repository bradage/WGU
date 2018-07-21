package com.bradage;

public class Vehicle {

    private int speed;
    private String vehicleType;
    private String steering;
    private String transmissionType;

    public Vehicle(int speed, String vehicleType, String steering, String transmissionType) {
        this.speed = speed;
        this.vehicleType = vehicleType;
        this.steering = steering;
        this.transmissionType = transmissionType;
    }

    private void setTranType(String transmissionType){
        this.transmissionType = transmissionType;
        System.out.println("  The Transmission is " + transmissionType);
    }

    private String getTrnType(){
        return transmissionType;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("  The Max speed is " + speed);
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        System.out.println("The vehicle type is " + vehicleType);
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
        System.out.println("The steering type is " + steering);
    }
}
