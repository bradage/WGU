package com.bradage;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            switch (digit) {
                case 0:
                    return "Zero";
                    break;
                case 1:
                    return "One";
                    break;
                case 2:
                    return "Two";
                    break;
                case 3:
                    return "Three";
                    break;
                case 4:
                    return "Four";
                    break;
                case 5:
                    return "Five";
                    break;
                case 6:
                    return "Six";
                    break;
                case 7:
                    return "Seven";
                    break;
                case 8:
                    return "Eight";
                    break;
                case 9:
                    return "Nine";
                    break;
                default:
                    return "Invalid Value";
                    break;
            }
        }
        return "test";
    }
}
