package com.bradage;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value ==1){
            System.out.println("value was 1");
        }else if(value ==2){
            System.out.println("value was 2");
        }else if(value ==3){
            System.out.println("value was 3");
        }

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a " + switchValue);
                break;
            default:
                System.out.println("value was not 1 or 2");
                break;

        }

        char letter = 'G';

        switch (letter){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("your letter was " + letter);
                break;
            default:
                System.out.println("no letter found");
        }

        String month = "January";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
        }
    }
}
