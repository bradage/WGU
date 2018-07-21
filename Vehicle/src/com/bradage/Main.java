package com.bradage;

public class Main {

    public static void main(String[] args) {
        Outback outback = new Outback(36);
        outback.steer(45);
        outback.accelerate(30);
        outback.accelerate(20);
        outback.accelerate(-42);
    }
}
