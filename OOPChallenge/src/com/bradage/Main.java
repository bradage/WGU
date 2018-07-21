package com.bradage;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "beef", 3.75, "White");

                double price = hamburger.itemizeHamburger();
                hamburger.addHambuergerAdd1("Tomato", 0.25);
                hamburger.addHambuergerAdd2("Lettuce", 0.50);
                hamburger.addHambuergerAdd3("Cheese", .75);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.75);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Lenitls", 3.41);
        System.out.println("total healthy burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        db.addHambuergerAdd3("Shouldn't be able to ", 75.00);
        db.itemizeHamburger();

    }
}
