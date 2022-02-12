package com.techelevator;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ZillowApplication {

    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);

        // create a parent object to hold either of our children
        //  PROBLEM!!!  when we do this, you can ONLY access
        // methods that are in the parent class!
//        Person person = getPersonInfo(userInput);
        System.out.print("Enter name: ");
        String name = userInput.nextLine();
        System.out.print("Enter email: ");
        String email = userInput.nextLine();

        Owner owner = new Owner(name, email);

        boolean isDone = false;
        do {
            System.out.println("Which property do you wish to add?");
            System.out.println("1. House");
            System.out.println("2. Condo");
            System.out.println("3. Apartment");
            System.out.println();
            System.out.print("Enter choice: ");
            int answer = Integer.parseInt(userInput.nextLine());
            Dwelling dwelling=null;
            switch (answer){
                case 1:
                    dwelling = getDwellingInfo(userInput, 1);
                    break;
                case 2:
                    dwelling = getDwellingInfo(userInput, 2);
                    break;
                case 3:
                    dwelling = getDwellingInfo(userInput, 3);
            }
            owner.addProperty(dwelling); // added a property to the list associated with the owner
            System.out.print("Done entering properties? ");
            if (userInput.nextLine().toLowerCase().startsWith("y")){
                isDone = true;
            }
        } while (!isDone);

        System.out.println("Printing properties for: " + owner.getName()); // debugging purposes  person.toString()
        for (Dwelling property : owner.getProperties()){
            System.out.println("Address: " +property.getAddress());
            System.out.println("\tSquare footage: " + property.getSquareFootage());
            System.out.println("\tNumber of bedrooms: " + property.getNumberOfBedrooms());
            System.out.println("\tNumber of baths: " + property.getNumberOfBathrooms());
            System.out.println("\tMonthly Price: " + property.getMonthlyPrice());
            System.out.println("\tDeposit: " + property.getDeposit());
        }
//        for (int i = 0; i < owner.getProperties().size(); i++){
//            System.out.println(owner.getProperties().get(i).getAddress());
//        }



//        Dwelling dwelling = new Dwelling();  Dwelling is abstract -- cannot be instantiated
    }

/*    public static Person getPersonInfo(Scanner userInput){
        System.out.print("Enter name: ");
        String name = userInput.nextLine();
        System.out.print("Enter email: ");
        String email = userInput.nextLine();

        System.out.print("Are you a renter? ");
        if (userInput.nextLine().toLowerCase().startsWith("y")){
            return new Renter(name, email);
        }
        return new Owner(name, email); // pass back the object anonymously
    }*/


    public static Dwelling getDwellingInfo(Scanner userInput, int num){
        System.out.print("Enter address: ");
        String address = userInput.nextLine();
        System.out.print("Enter square footage of place: ");
        int squareFootage = Integer.parseInt(userInput.nextLine());
        System.out.print("Enter number of bedrooms: ");
        int numberOfBedrooms = Integer.parseInt(userInput.nextLine());
        System.out.print("Enter number of baths (half baths are 0.5): ");
        double numberOfBaths = Double.parseDouble(userInput.nextLine());
        System.out.print("Enter the monthly price: ");
        BigDecimal monthlyPrice = new BigDecimal(userInput.nextLine());
        System.out.print("Enter the deposit: ");
        BigDecimal deposit = new BigDecimal(userInput.nextLine());
        if (num == 1) {
            return new House(address, squareFootage, numberOfBedrooms, numberOfBaths,
                    monthlyPrice, deposit);
        } else if (num == 2){
            return  new Condo(address, squareFootage, numberOfBedrooms, numberOfBaths, monthlyPrice, deposit);
        } else {
            return new Apartment(address, squareFootage, numberOfBedrooms, numberOfBaths, monthlyPrice, deposit);
        }
    }
}
