package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow cow = new Cow();  // new Cow() <= for a special method called a constructor
		System.out.println(cow.getSound());

		FarmAnimal farmAnimal = new Chicken();  // because chicken "is-a" type of FarmAnimal
		// we can assign the farmAnimal to hold a chicken object
		// and then we can re-assign farmAnimal to hold a cow object
		// this is part of inheritance.
		farmAnimal = new Cow();

		/*
		Create a data structure (an array in this situation) that holds the
		parent class but we can assign it to hold the child class objects in it.
		 */
		FarmAnimal[] farmAnimals = new FarmAnimal[] { new Cow(), new Chicken(), new Goat(),
		 new Sheep()};

		// polymorphism allows us to print out animals because they are all children of FarmAnimal
		for (FarmAnimal animal : farmAnimals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}


		System.out.println("Let's learn how to sing about a tractor and all the farmanimals!");
		System.out.println("****************************************************************");

		/*
		I can't force a tractor object to be a FarmAnimal, but I CAN create
		a data structure holding all my Singable objects
		 */
		//                                 Arrays.asList allows me to add as many objects as I want all at once.
		List<Singable> singables = new ArrayList<>(Arrays.asList(new Chicken(), new Tractor(),
				new Goat(), new Cow()));


		for (int i = 0; i < singables.size(); i++){
			String name = singables.get(i).getName();
			String sound = singables.get(i).getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
		}


		Scanner userInput = new Scanner(System.in);
		// Sellable itemForSale = new Sellable() - is not valid!  Because wheres the code for
		// the getPrice() method???  (In the classes that implement this interface)
		// an interface cannot be an object on its' own
		Sellable itemForSale;  // there is memory in the stack for this var
		System.out.println("What would you like to buy today?");
		System.out.print("a Chicken or some apples? ");
		String answer = userInput.nextLine();
		if (answer.toLowerCase().startsWith("chi")){
			itemForSale = new Chicken();  // given memory in the heap for my chicken
			System.out.println("Each chicken costs " + itemForSale.getPrice());
		} else if (answer.toLowerCase().startsWith("app")){
			itemForSale = new Apple();
			System.out.println("Each apple costs " + itemForSale.getPrice());
		} else {
			System.out.println("Invalid entry!");
		}
	}
}