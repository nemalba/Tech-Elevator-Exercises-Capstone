package com.techelevator;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		//Declare and instantiate a List
		// List on the left side == interface
		// ArrayList on the right side == class
		//List<T> objectName = new ArrayList<> ();
		List<String> names = new ArrayList<>();

		names.add("Frodo");
		names.add("Sam");
		names.add("Pippin");
		names.add("Gandalf");

		System.out.println("Size of List: " + names.size());

//		names.add(50, "Bilbo");  you cannot just grab any index, it must be an index already with an element in it

		// why use this version of the add instead of just using the add("string");
//		names.add(4, "Bilbo");

		names.add(0, "Bilbo");  // added Bilbo to the front of the list

		System.out.println("Size of List: " + names.size());

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Pippin");

		System.out.println(names); // this actually defaults to calling names.toString() method

		// Margaret's Rule of Thumb -- if you copy and paste code, ask yourself -- is there a better way????
		printList(names);  // let's write a method!!

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(3, "Merry");
		printList(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		System.out.println("Let's remove Pippin from position 4");
		names.remove(4);
		printList(names);

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by object (in this case a String)");
		System.out.println("####################");

		names.remove("Frodo");  // it will remove Frodo if it finds the String
		printList(names);

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		if (names.contains("Bilbo")){
			System.out.println("Bilbo is in the list!");
		} else {
			System.out.println("No one can find Bilbo");
		}

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int index = names.indexOf("Gandalf");
		// if the object is not found, it will return -1
		System.out.println("Gandalf is in index: " + index);

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String[] namesArray = new String[names.size()];  // creates an empty array
		for (int i = 0; i < names.size(); i++){
			namesArray[i] = names.get(i); // copy each element one at a time into the new array
		}

		String[] namesArray2 = names.toArray(new String[0]);  //toArray method needs to know what type
		// of array to create, so we send in new String[0]

		System.out.println("print our array:");
		for (int i = 0 ; i < namesArray2.length; i++){
			System.out.println(namesArray2[i]);
		}

		System.out.println("####################");
		System.out.println("Arrays can be turned into a List");
		System.out.println("####################");

		List<String> nameList = new ArrayList<>(Arrays.asList(namesArray));


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(names);  // this is an in-memory sort -- alpha ascending
		printList(names);


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(names);   // in memory sort -- meaning the order has been changed
		printList(names);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// for each String in names list, each element is a String and can be referenced using the var name
		for(String name: names){  // for each loop is used when you need to visit each element in the list
			System.out.println(name);
		}

	}  // end of main

	public static void printList(List<String> list){
		for (int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}


	}
}
