package com.bradage;

import java.util.ArrayList;
//similar to Roster

public class Store {

    static ArrayList<Book> myStore = new ArrayList<>();

    public static void add(String isbn, String title, int quantity, double price1, double price2){

            double[] prices = {price1, price2};
            Book newBook = new Book(isbn, title, quantity, prices);//We have created a new book
            myStore.add(newBook);

    }

    public static void printAllBooks(){
            //loop through the arraylist called myStore
        for(int i =0; i < myStore.size();i++){
            //Get each book and call the print method
            myStore.get(i).print();
        }

    }

    public static void printAveragePrices(){
        //loop through the ArrayList called myStore enhanced for loop
        for(Book b : myStore){
            //calculate the average
            double average = (b.getPrices()[0] + b.getPrices()[1]) / 2.0;
            System.out.println("ISBN:\t" + b.getISBN() + "\tAvg Price:\t" + average);
        }

    }

    public static void findBook(String isbn) {
        //Loop through myStore
        for(Book b: myStore){
            if(b.getISBN().equals(isbn)){
                //we have the book in the list
                if(b.getQuantity() > 0){
                    System.out.println(isbn + " is in stock.");
                    return;
                }else{
                    System.out.println(isbn + " will have to be ordered");
                    return;
                }

            }
        }//ends for loop
        //if we get here, we do not sell the book
        System.out.println("We do not sell " + isbn);

    }



}
