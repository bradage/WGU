package com.bradage;

//similar to student

public class Book {
    private String isbn;
    private String title;
    private int quantity;
    private double[] prices;

    //Constructor
    public Book(String isbn, String title, int quantity, double[] prices){
        setISBN(isbn);
        setTitle(title);
        setQuantity(quantity);
        setPrices(prices);
    }

    //Getters
    public String getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public double[] getPrices() {
        return prices;
    }

    //Setters

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    //Methods
    public void print(){
        System.out.println("ISBN:\t" + getISBN()+
                            "\tTitle:\t" + getTitle()+
                            "\tQty:\t" + getQuantity()+
                            "\tPrice 1:\t" + getPrices()[0]+
                            "\tPrice 2:\t" + getPrices()[1]);
    }
}
