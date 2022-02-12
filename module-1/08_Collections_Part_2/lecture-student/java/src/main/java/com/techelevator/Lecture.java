package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, Integer> animalNumberLegs = new HashMap<String, Integer>();

		animalNumberLegs.put("Dog", 4);

		animalNumberLegs.put("Fish", 0);

		animalNumberLegs.put("Bear", 2);

		animalNumberLegs.put("Bear", 4);
	}

}
