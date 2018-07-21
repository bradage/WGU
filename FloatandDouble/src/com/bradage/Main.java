package com.bradage;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4bytes)
        int myIntValue = 5/2;

        //width of float = 32 (4 bytes)
        float myFloatValue = 5f/3;

        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d/3;
/*
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println( "myDoubleValue = " + myDoubleValue);
*/
        int myPounds = 10;
        double myKils = myPounds*0.4359237;

        System.out.println("myKils = " + myKils);
    }
}
