package com.bradage;

public class Main {

    public static void main(String[] args) {
	int topScore = 100;
	int secondScore = 81;

	if((topScore > secondScore) && (topScore < 100))
        System.out.println("Greater than second top score and less than 100");

	if((topScore > 90) || (secondScore <=90))
        System.out.println("one of these test is true.");

	int newValue = 50;
	if(newValue == 50)
        System.out.println("This is true");

	boolean isCar = true;
	if(isCar)
        System.out.println("isCar is true");

	boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");
    //Challenge
        System.out.println("Starts Challenge Here");

    double myDub = 20d;
    double mySecDub = 80d;
    double myEq = (myDub + mySecDub) * 25d;
    double myRemain = (myEq % 40);

    if(myRemain <= 20)
        System.out.println("Total was over the limit");




    }
}
