package com.techelevator.farm;

import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
	public static void main(String[] args) {

		Singable[] singables =
				new Singable[] {new Cow(), new Chicken(), new Pig(), new Tractor()};

		// we cannot put any singables to sleep because the sleep method
		// is NOT part of Singable interface!

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}


		// we CAN have a data structure at the parent level
		List<FarmAnimal> animals = new ArrayList<>();

		// randomly add new animals to our animals ArralList
		for (int i = 0; i < 5; i++){
			// Math.random() returns a number between 0 and 1
			int random = (int)(Math.random()  * 4);
			switch (random) {
				case 0:
					animals.add(new Chicken()); // this is an anonymous chicken object
					animals.get(i).sleep();  // this will put the chicken to sleep
					break;  // takes us to the end of the switch block
				case 1:
					Cow cow = new Cow(); // this is a named object holding my cow
					cow.sleep();
					animals.add(cow);
					break;
				case 2:
					animals.add(new Cat());
					animals.get(i).sleep();
					break;
				default:  // for 2
					animals.add(new Pig());
					animals.get(i).sleep();  // this puts the pigs to sleep
			}
		}

		for (FarmAnimal animal : animals) {
			String name = animal.getName();
			String sound = animal.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}


		//Singable sing = new Singable(); //cannot create
		// a concrete object of an interface

		//FarmAnimal animal = new FarmAnimal("farm animal", "Hi");
		// What exactly IS a FarmAnimal?  It is either a cow, or chicken, etc
		// so we don't want you to be able to create a generic farm animal object
	}
}