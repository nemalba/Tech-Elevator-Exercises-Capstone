package com.techelevator;

import java.util.Scanner;

public class PetDayCareApplication {

    public static void main(String[] args) {
        //   to make sure my application works
        // 1. create a pet
        // 2. create a owner
        // 3.  discuss pet day care rules

        // get the user to enter their Pet information
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter owner name: ");
        String ownerName = userInput.nextLine();
        System.out.print("Enter address: ");
        String ownerAddress = userInput.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = userInput.nextLine();
        Owner owner = new Owner(ownerName, ownerAddress, phoneNumber);
        boolean isDone = false;
        while (!isDone) {  // while the owner is not done entering pets
            Pet pet = getPetInfo(userInput);
            owner.addPet(pet);
            System.out.print("Do you have more pets to enter (Y/N): ");
            String answer = userInput.nextLine();
            if (answer.equals("N")){
                isDone = true;
            }
        }

        System.out.println(owner);
    }
    // make this method static because it is in the application and main is static
    public static Pet getPetInfo(Scanner userInput){
        // get user input
        System.out.print("Enter your pet's name: ");
        String name = userInput.nextLine();
        System.out.print("Enter your pet's type (Dog, cat, alien, etc): ");
        String type = userInput.nextLine();
        System.out.print("Enter pet's gender: ");
        String gender = userInput.nextLine();
        System.out.print("Enter pet's age in years: ");
        int age = Integer.parseInt(userInput.nextLine());  // converts userInput into integer
        System.out.print("Is your pet friendly (Y/N): ");
        String answer = userInput.nextLine();
        boolean isFriendly = true;
        if (answer.toUpperCase().equals("N")){
            isFriendly = false;
        }
        System.out.println("Is your pet:");
        System.out.println("\t1. Small");
        System.out.println("\t2. Medium");
        System.out.println("\t3. Large");
        System.out.print("Enter the size: ");
        int sizeInt = Integer.parseInt(userInput.nextLine());
        String size = "Large";
        // if else chain, use a switch statement
        switch (sizeInt){
            case 1:                // if (sizeInt == 1){
                size = "Small";    //     size = "Small";
                break;
            case 2:                // } else if (sizeInt == 2){
                size = "Medium";   //    size = "Medium";
                break;                              // break means pop out of the block
            default:                // } else {
                size = "Large";     // size = "Large";
        }                          // }

        Pet pet = new Pet(name, type, gender, age, isFriendly, size);

        return pet;
    }

}
