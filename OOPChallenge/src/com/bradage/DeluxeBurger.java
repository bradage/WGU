package com.bradage;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Bison & Bacon", 12.50, "Wheat");
        super.addHambuergerAdd1("Chips", 2.75);
        super.addHambuergerAdd2("Drink", 1.75);
    }

    @Override
    public void addHambuergerAdd1(String name, double price) {
        System.out.println("Cannot add additional items ot the deluxe burger");;
    }

    @Override
    public void addHambuergerAdd2(String name, double price) {
        System.out.println("Cannot add additional items ot the deluxe burger");;
    }

    @Override
    public void addHambuergerAdd3(String name, double price) {
        System.out.println("Cannot add additional items ot the deluxe burger");;
    }

    @Override
    public void addHambuergerAdd4(String name, double price) {
        System.out.println("Cannot add additional items ot the deluxe burger");;
    }
}
