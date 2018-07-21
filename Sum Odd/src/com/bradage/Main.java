package com.bradage;

public class Main {

    public static void main(String[] args) {
        System.out.println("isOdd with 6 is "+ isOdd(6));
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(10,5));
    }

    public static boolean isOdd(int number){
        if((number < 0) || (number % 2 == 0)){
            return false;
        }else
            return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if((start < 0 || end < 0) || (end < start)){
            return -1;
        } else
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
    }
}

