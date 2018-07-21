package com.bradage;

class Car{

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake(){
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Honda extends Car{

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake";
    }
}

class Hyundai extends Car{

    public Hyundai(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake";
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake";
    }
}



public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Honda honda = new Honda(4, "Element");
        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.brake());

        Hyundai hyundai = new Hyundai(6, "Santa Fe");
        System.out.println(hyundai.startEngine());
        System.out.println(hyundai.accelerate());
        System.out.println(hyundai.brake());

        Ford ford = new Ford(8, "F-150");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());


    }
}
