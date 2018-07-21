package com.bradage;

public class Main {
//this is a poor example of coding and a reason why we use encapsulation
    public static void main(String[] args) {

        //Poor coding practice and why we use encapsulation
//        Player player = new Player();
//
//        player.fullName = "Bilbo";
//        player.health = 150;
//        player.weapon = "Short Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 150;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

    EnhancedPlayer player = new EnhancedPlayer("Goku", 500, "Fist");

    System.out.println("Initial health is " + player.getHealth());


    }
}
