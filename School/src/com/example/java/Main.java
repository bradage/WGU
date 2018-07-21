package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("the 2nd value is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("the 2nd value is " + intValue1);

        short shortValue1 = (short) intValue1;


        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1;

        float f = 1f;
        double d = 1d;

        System.out.println("Byte: " + b);
        System.out.println("Byte: " + sh);
        System.out.println("Byte: " + i);
        System.out.println("Byte: " + l);
        System.out.println("Byte: " + f);
        System.out.println("Byte: " + d);

    }

}
