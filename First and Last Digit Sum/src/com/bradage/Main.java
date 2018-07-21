package com.bradage;

public class Main {

    public static void main(String[] args) {
        System.out.println("the sum for the first and last digit of 252 is " + sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }


        int lastDigit = number % 10;

        while (number > 9){
            number /= 10;
        }

        return lastDigit + number;

    }
}
