package com.techelevator;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// create a map with key of name and value of zipcode
		Map<String, String> nameToZipCode = new HashMap<>();

		// add some elements to our map
		nameToZipCode.put("Bob", "23432");
		nameToZipCode.put("Sue", "48232");
		nameToZipCode.put("Jim", "56565");
		nameToZipCode.put("Tim", "78787");
		nameToZipCode.put("Ann", "32121");

		// if I know the key, it is very easy to get the value
		System.out.println("Ann lives at " + nameToZipCode.get("Ann"));

		//keys must be unique
		System.out.println("Jim lives at " + nameToZipCode.get("Jim"));
		nameToZipCode.put("Jim", "67878");  // this does error, but overwrites
		System.out.println("Jim now lives at " + nameToZipCode.get("Jim"));

		// lets ask the user to give us a key"
		Scanner userInput = new Scanner(System.in);  // give us access to the keyboard
		System.out.print("Enter a name to search for: ");
		String name = userInput.nextLine();

		System.out.println(name + " lives at " + nameToZipCode.get(name));

		nameToZipCode.put("JIM", "77777");

		System.out.println(nameToZipCode);  // this defaults to calling nameToZipCode.toString()
		// this is unordered -- comes back in whatever order java grabs them in
		// we set up a HashMap -- which uses wonky hashing algorithm

		System.out.println("****************  Print out all values using a key set ********************");

		Set<String> keys = nameToZipCode.keySet();  // this creates a set of all the keys
		// there is no index -- have to use the foreach loop to visit each element in the set

		for (String keyName: keys){
			System.out.println(keyName + " lives at " + nameToZipCode.get(keyName));
		}

		System.out.println("************************** Print all values using an entry set ****************");

		Set<Map.Entry<String, String>> mapSet = nameToZipCode.entrySet();

		for (Map.Entry<String, String> nameZip : mapSet){
			System.out.println(nameZip.getKey() + " lives at " + nameZip.getValue());
		}

		// create the for loop without creating a separate variable to hold the entry set
//		for(Map.Entry<String, String> nameZip: nameToZipCode.entrySet()){
//
//		}
		System.out.println("******************  Check to see if Jim is there using containsKey ***************");
		if (nameToZipCode.containsKey("Jim")) {
			System.out.println("Jim lives at " + nameToZipCode.get("Jim"));
		}

		System.out.println("***********  Remove all occurrences of Jim ***************");
		nameToZipCode.remove("Jim");
		nameToZipCode.remove("JIM");

		for (String keyName: nameToZipCode.keySet()) {
			System.out.println(keyName + " lives at " + nameToZipCode.get(keyName));
		}


	}

}
