package com.techelevator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lecture {

	public static void main(String[] args) {


		System.out.println(areEqual);
		// code for how to add to the front of a string
		String remainder = "";
		for (int i = 0; i < 10 ; i++){
			remainder = i + remainder;  // 0    10    210
		}
		System.out.println(remainder);

		int[] myArray = new int[10];  // create an array that holds 10 integers
		// new means set aside the computer memory or instantiate

		System.out.println(Arrays.toString(myArray));  //prints all the values in the array without needing a loop!

		Arrays.fill(myArray, 42);  // set each value in the array to 42
		// don't type the word var -- IntelliJ is providing

		System.out.println(myArray);  // what prints if I don't use the toString???

		System.out.println(Arrays.toString(myArray));

		int[] newArray = Arrays.copyOf(myArray, 5);  // newArray will be of length 5 and will hold the first 5 values from myArray
		System.out.println(Arrays.toString(newArray));

		newArray[1] = 13;  // this replaces the value in index 1 in newArray with 13
		newArray[3] = 29;
		newArray[4] = 1;
		System.out.println("newArray now holds: " + Arrays.toString(newArray));

		//Arrays.sort is an in-memory  modifier
		Arrays.sort(newArray);  // in memory sort in ascending order

		System.out.println("After sorting new array holds: " + Arrays.toString(newArray));

		if (Arrays.equals(myArray, newArray)){
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		String greeting = "Hello World";  // do not have to declare using the new keyword

		String newGreeting = new String("Goodbye World");  // can declare but don't have to

		System.out.println(greeting);
		System.out.println(newGreeting);
		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		char first = greeting.charAt(0);  // first will hold the value 'H'
		char fifth = greeting.charAt(4);  // fifth will hold the value 'o'

		System.out.println("first holds: " + first + " and fifth holds: " + fifth);
		System.out.println(first + " " + fifth);  // puts a space in between the values

		// write a loop that will count how many o's are in newGreeting
		int count = 0;
		for (int i =0; i < newGreeting.length(); i++){
			if (newGreeting.charAt(i) == 'o'){  // primitive types so can use ==
				count++;
			}
		}
		System.out.println("There are " + count + " \"o's\" in " + newGreeting);  // \ is escape key allows you to print "

		// the contains method checks to see if string contains
		boolean containsWorld = newGreeting.contains("World");
		System.out.println("Contains the word 'World': " + containsWorld);

		containsWorld = newGreeting.toLowerCase().contains("world");  // convert newGreeting to lower case and then checking
		// to see if it contains the word
		System.out.println("Contains the word 'world': " + containsWorld);


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf  -- returns the first index of the character or string
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		if (newGreeting.startsWith("G")){
			System.out.println("Starts with 'G'");
		}

		int index = newGreeting.indexOf('o');  // will return 1 for the position of the first o
		System.out.println("index is " + index);
		int odIndex = newGreeting.indexOf("od");  // return 2 for the starting position of the string 'od
		System.out.println("odIndex is " + odIndex);

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();


		String hello1 = "Hello";
		String hello2 = new String ("Hello");  // will give us a new spot in the heap
//		String hello2 = "Hello";  // Java does this interning to save memory -- only creates one spot in the heap

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

//		hello1 = "Goodbye";
		System.out.println(hello2);

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
