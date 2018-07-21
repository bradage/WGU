package com.bradage;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        while (count != 5) {
            System.out.println("count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;

        do {
            System.out.println("coutn value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);


        System.out.println("********** CHALLENGE TIME **********");

        int i = 0;

        while(i < 100){
            i++;
            if(isEvenNumber(i)) {
                System.out.println("the number " + i + " is Even");
            }
            }


            //Alternate solution
        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("even number " + number);
        }

        //NEXT CHALLENGE
        System.out.println("*************************The next big thing*************************");
        number = 4;
        finishNumber = 20;
        int sumCount = 0;
        int sum = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            sumCount ++;
            System.out.println("even number " + number);
            sum += number;
            if(sumCount == 5){
                break;
            }
        }
        System.out.println("the sum is " + sum);

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 != 0) {
            return false;
        } else
            return true;
    }
}
