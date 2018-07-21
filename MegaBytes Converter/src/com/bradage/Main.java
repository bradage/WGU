package com.bradage;

public class Main {

    public static void main(String[] args) {
       isLeapYear(-1600);
       isLeapYear(1600);
       isLeapYear(2017);
       isLeapYear(2000);
       int test = 1600 % 4;
        System.out.println(test);
    }
    public static boolean isLeapYear(int year){
            if(year < 1 || year > 9999) {
                return false;
            } else if(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)){
                return true;
            } else
                return false;
    }
    }


