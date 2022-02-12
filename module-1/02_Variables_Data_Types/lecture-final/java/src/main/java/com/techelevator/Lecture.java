package com.techelevator;

import java.sql.SQLOutput;

public class Lecture {

	public static void main(String[] args) {
		
		/* Exercise 1
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		int numberOfExercises;
		numberOfExercises = 26;
		System.out.println("Number 1 - Number Of Exercises");
		System.out.println(numberOfExercises); // prints the value stored inside the variable
		System.out.println(); // prints an empty line of code
		/* Exercise 2
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		double half = 0.5;
		System.out.println("Number 2 - half");
		System.out.println(half);  // keyboard shortcut is sout and tab or enter
		System.out.println();

		/* Exercise 3
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		String name = "Tech Elevator";
		System.out.println("Number 3 - name");
		System.out.println(name);
		System.out.println();

		/* Exercise 4
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		int seasonsOfFirefly = 1;
		// \n is the way to have an enter key in your output
		// + means concatentate or add to the line
		System.out.println("Number 4 - seasonsOfFirefly\n" + seasonsOfFirefly);
		System.out.println();

		/* Exercise 5
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		String myFavoriteLanguage = "Java";
		System.out.println("Number 5 - myFavoriteLanguage\n" + myFavoriteLanguage);
		System.out.println();

		/* Exercise 6
		6. Create a variable called pi and set it to 3.1416.
		*/
		double pi = 3.1416;
		System.out.println("Number 6 - pi\n" + pi);
		System.out.println();


		/* Exercise 7
		7. Create and set a variable that holds your name.
		*/
		String myName = "Margaret Green";
		System.out.println("Number 7 - myName\n" + myName);
		System.out.println();


		/* Exercise 8
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/
		int numberMouseButtons = 7;
		System.out.println("Number 8 - numberMouseButtons\n" + numberMouseButtons);
		System.out.println();


		/* Exercise 9
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		int phoneBatteryLife = 98;
		System.out.println("Number 9 - phoneBatteryLife\n" + phoneBatteryLife);
		System.out.println();


		/* Exercise 10
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		int num1 = 121;
		int num2 = 27;
		int difference = num1 - num2;
		System.out.println("Number 10 - difference");
		System.out.println(difference + "\n");
		// \n is called an escape sequence


		/* Exercise 11
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		double num3 = 12.3;
		double num4 = 32.1;
		double addition = num3 + num4;
		System.out.println("Number 11 = addition\n" + addition + "\n");
		// how can we make it only print 2 decimal places??
		System.out.printf("%.2f\n", addition);  // "%.2f specifies to only print 2 decimal places to the right of .


		/* Exercise 12
		12. Create a String that holds your full name.
		*/
		String fullName = "Margaret Green";
		System.out.println("Number 12 = fullName\n" + fullName + "\n");


		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		String greeting = "Hello, " + fullName;
		System.out.println("Number 13 - greeting\n" + greeting + "\n");

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
	//	fullName = fullName + " Esquire";
	//	System.out.println("Number 14 - fullName with Esquire\n" + fullName + "\n");

		/* Exercise 15
		15. Now do the same as exercise 14, but use the += operator.
		*/
		fullName += " Esquire";  // += is shortcut operator that means fullName = fullName +
		System.out.println("Number 15 - fullName with Esquire\n" + fullName + "\n");

		/* Exercise 16
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/



		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/



		/* Exercise 18
		18. What is 4.4 divided by 2.2?
		*/
		double numerator = 4.4;
		double denominator = 2.2;
		double answer = numerator / denominator;
		System.out.println("Number 18 - answer\n" + answer + "\n");


		/* Exercise 19
		19. What is 5.4 divided by 2?
		*/




		/* Exercise 20
		20. What is 5 divided by 2?
		*/



		/* Exercise 21
		21. What is 5.0 divided by 2?
		*/



		/* Exercise 22
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/



		/* Exercise 23
		23. If I divide 5 by 2, what's my remainder?
		*/



		/* Exercise 24
		24. What is 1,000,000,000 * 3?
		*/



		/* Exercise 25
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/



		/*
		26. Now set doneWithExercise to true.
		*/


		
	}

}
