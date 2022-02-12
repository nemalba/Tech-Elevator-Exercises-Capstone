package com.techelevator;
//import java.util.Scanner;
import java.util.Locale;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");
		int temperature = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit? ");
		String answer = scanner.nextLine();
		answer = answer.toUpperCase(Locale.ROOT);
		System.out.println(temperature + answer + " is " + convertTemperature(temperature, answer) + (answer.startsWith("F")?"C":"F") + ".");
	}

		public static int convertTemperature(int temperature, String answer)
		{
			if(answer.startsWith("F")) {
			int tempInCelsius = (int)(( temperature - 32) / 1.8);
			return tempInCelsius;
			} else{
			int tempInFahrenheit= ((int)(temperature * 1.8 + 32));
			return tempInFahrenheit;
		}



	}
}
