package com.bradage;

public class Hamburger {

    //main constructor fields
    private String name;
    private String meat;
    private double price;
    private String breadType;

    //additional items fields (1-4)
    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

    //Constructor for Hamburger
    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    //methods to add additional items for items 1-4
    public void addHambuergerAdd1(String name, double price){
        this.add1Name = name;
        this.add1Price = price;
    }
    public void addHambuergerAdd2(String name, double price){
        this.add2Name = name;
        this.add2Price = price;
    }
    public void addHambuergerAdd3(String name, double price){
        this.add3Name = name;
        this.add3Price = price;
    }
    public void addHambuergerAdd4(String name, double price){
        this.add4Name = name;
        this.add4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.breadType + " bun is priced at " + this.price);

        if(this.add1Name != null) {
            hamburgerPrice += this.add1Price;
            System.out.println("Added " + this.add1Name + " for an extra $" + this.add1Price);
        }
        if(this.add2Name != null) {
            hamburgerPrice += this.add2Price;
            System.out.println("Added " + this.add2Name + " for an extra $" + this.add2Price);
        }
        if(this.add3Name != null) {
            hamburgerPrice += this.add3Price;
            System.out.println("Added " + this.add3Name + " for an extra $" + this.add3Price);
        }
        if(this.add4Name != null) {
            hamburgerPrice += this.add4Price;
            System.out.println("Added " + this.add4Name + " for an extra $" + this.add4Price);
        }

        return hamburgerPrice;
    }


}
