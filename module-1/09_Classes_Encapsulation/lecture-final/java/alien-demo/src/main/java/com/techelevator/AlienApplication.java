package com.techelevator;

public class AlienApplication {

    // an application is a class that I can run
    // what method do I need to be able to run the code?
    public static void main(String[] args) {


        // I want to create an Alien object
        // this object is created using the default constructor
        Alien mork = new Alien();  // nameOfClass  nameOfObject = new nameOfClass ();

        mork.setColor("Flesh colored");
        mork.setPlanetOfOrigin("Ork");
        mork.setAntennaeCount(0);
        mork.setFavoriteFood("Spaghetti and Meatballs");
        mork.setFriendly(true);

        mork.setFavoriteFood("French Fries");  // replaced the old favorite food

        System.out.println("Mork's color: " + mork.getColor());
        System.out.println("Mork's planet of Origin: " + mork.getPlanetOfOrigin());
        System.out.println("Mork's number of Antennae: " + mork.getAntennaeCount());
        System.out.println("Mork's favorite food: " + mork.getFavoriteFood());
        System.out.println("Is Mork friendly? " + mork.isFriendly());

        System.out.println("******************************************");
        // this object is using the constructor that asks for 5 arguments
        Alien alf = new Alien("brown", "Melmak",
                0, "cats", false);

        System.out.println("Alf's color: " + alf.getColor());
        System.out.println("Alf's planet of Origin: " + alf.getPlanetOfOrigin());
        System.out.println("Alf's number of Antennae: " + alf.getAntennaeCount());
        System.out.println("Alf's favorite food: " + alf.getFavoriteFood());
        System.out.println("Is Alf friendly? " + alf.isFriendly());
    }
}
