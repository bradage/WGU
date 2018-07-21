package com.bradage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    //    private static Scanner s = new Scanner(System.in);
//
//    private static int[] baseData = new int[10];


    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                case 6:
                    processArrayLsist();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

//        System.out.println("Enter 10 integers: ");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 integers: ");
//        getInput();
//        printArray(baseData);

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\n 0 - To print choice options.");
        System.out.println("\n 1 - To print the list of grocery items.");
        System.out.println("\n 2 - To add an item to the list.");
        System.out.println("\n 3 - To modify an item in the list.");
        System.out.println("\n 4 - To remove an item from the list.");
        System.out.println("\n 5 - To search for an item in the list.");
        System.out.println("\n 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }

    public static void processArrayLsist{

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

//        String[] myArry = new String[groceryList.getGroceryList().size()];
//        myArry = groceryList.getGroceryList().toArray(myArry);
    }
}

//    private static void getInput(){
//        for(int i =0; i < baseData.length; i++){
//            baseData[i] = s.nextInt();
//        }
//    }
//
//    private static void printArray(int[] arr){
//        for(int i = 0 ; i < arr.length; i++)
//            System.out.print(arr[i] + " ");
//            System.out.println();
//
//    }
//
//    private  static void resizeArray(){
//        int[] original = baseData;
//
//        baseData = new int[12];
//        for(int i = 0; i < original.length; i++)
//            baseData[i]  = original[i];
//    }
