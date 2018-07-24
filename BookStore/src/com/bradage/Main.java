package com.bradage;

public class Main {

    public static void main(String[] args) {
        //Add Book Data
        Store.add("978-0471791911", "Java for Everyone", 10, 68.00, 65.10);
        Store.add("978-0596009205", "Head First Java", 2, 50.00, 55.50);
        Store.add("978-0321996329", "Core Java for the Impatient", 0,101.70,123.20);

        //Print out all book data
        Store.printAllBooks();

        //Print the average prices
        Store.printAveragePrices();

        //find a book by ISBN
        Store.findBook("978-0596009205");
        Store.findBook("542154");
    }
}
