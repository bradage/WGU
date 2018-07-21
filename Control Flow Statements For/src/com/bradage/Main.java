package com.bradage;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.00, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.00, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.00, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.00, 5.0));
//        System.out.println("10,000 at 6% interest = " + calculateInterest(10000.00, 6.0));
//        System.out.println("10,000 at 7% interest = " + calculateInterest(10000.00, 7.0));

        for (int i = 2; i < 9; i++) {
            System.out.println("10,0000 at " + i + " % interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("10,0000 at " + i + " % interest = $" + String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;

        for(int i = 2; i < 50; i++){
            if(isPrime(i)) {
                count++;
                System.out.println(i + " is a Prime Number");
                if(count == 10){
                    System.out.println("Exiting for Loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (
                int i = 2;
                i <= n/2;
                i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }


}
