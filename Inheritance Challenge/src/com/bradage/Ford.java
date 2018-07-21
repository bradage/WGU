package com.bradage;

public class Ford extends Car {

    private String model;

    public Ford(int speed, String vehicleType, String steering, String transmissionType, int numGears, int doors, int wheels, String model) {
        super(speed, vehicleType, steering, transmissionType, numGears, doors, wheels);
        this.model = model;
    }

    private void setModel(String model){
        this.model = model;
        System.out.println("The model is a " + model);
    }

    private String getModel(){
        return model;
    }

}
