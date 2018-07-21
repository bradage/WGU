package com.bradage;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32
        int myMinValue=-2147483648;
        int myMaxValue=2147483647;

        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);



        //short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;


        //long has a width of 64
        long myLongValue = 100L;//place a capital L to indicate a LONG

        //ASSIGNMENT
        //1. byte
        byte myByte = 127;

        //2. short
        short myShort = 1528;

        //3. int
        int myInt = 51246584;

        //4. long
        long myLong = ((50000 + 10) * (myByte + myShort + myInt));

        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println(shortTotal);




    }
}
