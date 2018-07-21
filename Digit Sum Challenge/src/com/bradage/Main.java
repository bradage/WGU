package com.bradage;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of the digits in the number 125 is " + sumDigits(125));
        System.out.println("Sum of the digits in the number 196 is " + sumDigits(196));
        System.out.println("Sum of the digits in the number 1240 is " + sumDigits(1240));
        System.out.println("Sum of the digits in the number 144 is " + sumDigits(144));
        System.out.println("Sum of the digits in the number 15 is " + sumDigits(15));
        System.out.println("Sum of the digits in the number 168 is " + sumDigits(168));
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        int sum = 0;
        while (number > 0){
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
            return sum;
    }
}
