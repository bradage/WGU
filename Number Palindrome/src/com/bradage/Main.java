package com.bradage;

public class Main {

    public static void main(String[] args) {
        System.out.println("checking if -1221 " + isPalindrome(-1221));
        System.out.println("checking if 707 " + isPalindrome(707));
        System.out.println("checking if 11212 " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        if(number > 0 && number < 10){
            return false;
        }
        int reverse = 0;
        int i = number;

        while(i != 0){
            int lastDigit = i % 10;
            reverse *= 10;
            reverse += lastDigit;
            i /= 10;
        }
            return reverse == number;
    }
}
