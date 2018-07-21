package com.bradage;

public class Main {

    public static void main(String[] args) {
	    int numberCount = 0;
	    int numberSum = 0;

        for(int i=1; i <= 1000; i++ ){
            if((i % 3 == 0) && (i % 5 == 0)){
                numberCount++;
                numberSum+= i;

                System.out.println(numberCount + " first number is " + i + " the sum of the numbers is now " + numberSum);

                if(numberCount == 5){
                    System.out.println("exiting the loop");
                    break;
                }
            }
        }
    }
}
