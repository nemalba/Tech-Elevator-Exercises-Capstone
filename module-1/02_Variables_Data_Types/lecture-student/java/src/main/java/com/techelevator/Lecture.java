package com.techelevator;

import java.sql.SQLOutput;

public class Lecture {

	public static void main(String[] args) {
		
		/* Exercise 1
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/


         int numberOfExercises = 26;
         System.out.println("The number of exercises is : " + numberOfExercises);

  
		/* Exercise 2
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
         double half = 0.5;
         System.out.println("The rate is " + half);


		/* Exercise 3
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
         String name ="TechElevator";
         System.out.println("I'm taking a bootcamp at" + name);

		/* Exercise 4
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
            int seasonsOfFirefly = 1;
            System.out.println("There is only " + seasonsOfFirefly);

		/* Exercise 5
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
              String myFavoriteLanguage = "Java";
              System.out.println("My favorite language is " + myFavoriteLanguage);

		/* Exercise 6
		6. Create a variable called pi and set it to 3.1416.
		*/
            double pi = 3.1416;
            System.out.println("The diameter is " + pi);


		/* Exercise 7
		7. Create and set a variable that holds your name.
		*/
              String myName = "Nema";
              System.out.println("My name is " + myName);


		/* Exercise 8
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

          int numberButtons = 2;
          System.out.println("The number of buttons of my mouse is " + numberButtons);

		/* Exercise 9
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/

           double percentBatteryLeft = 5;
               System.out.println("The percentage of battery left is" +  percentBatteryLeft);
		/* Exercise 10
		10. Create an int variable that holds the difference between 121 and 27.
		*/
            int difference = 121 -27;
            System.out.println("The difference between 121 and 27 is " + difference);


		/* Exercise 11
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
            double addition = 12.3 + 32.1;
            //System.out.printf("The sum is" + "%.2f " )+ addition);


		/* Exercise 12
		12. Create a String that holds your full name.
		*/
            String firstName = "Nema ";
            String lastName = "Aragones";
            String fullName = firstName + lastName;
            System.out.println("My name is " + fullName);



		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
            String greeting ="Hello";
            System.out.println(greeting + " " + fullName);



		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
           fullName = fullName + " Esquire";
           System.out.println("My full name " + fullName);

       /* Exercise 15
		15. Now do the same as exercise 14, but use the += operator.
		*/

        fullName += " Esquire";
        System.out.println("My full name " + fullName);

		/* Exercise 16
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
               String something = "Saw";
               String something1 = something + 2;

        /*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
              something += 0;


		/* Exercise 18
		18. What is 4.4 divided by 2.2?
		*/
          double dividend = 4.4 / 2.2;
        System.out.println("The answer is:" + dividend);



		/* Exercise 19
		19. What is 5.4 divided by 2?
		*/
         double divide = 5.4 / 2;
        System.out.println("5.4 / 2 is equal to: " + divide);




		/* Exercise 20
		20. What is 5 divided by 2?
		*/
        int number = 5/2;
        System.out.println("5 / 2 is equal: " + number);


		/* Exercise 21
		21. What is 5.0 divided by 2?
		*/
        double n = 5.0/2;
        System.out.println("5.0 /2 is equals to: " + n);


		/* Exercise 22
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/



		/* Exercise 23
		23. If I divide 5 by 2, what's my remainder?
		*/
            int remainder = 5 % 2;
            System.out.println("The remainder of 5 % 2 is: " + remainder);


		/* Exercise 24
		24. What is 1,000,000,000 * 3?
		*/
            double x = 1000000000 * 3;
            System.out.println("1000000000 * 3 is equals to: " + x);


		/* Exercise 25
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/

             boolean doneWithExercises = false;

		/*
		26. Now set doneWithExercise to true.
		*/
             boolean doneWithExercise = true;

		
	}

}
