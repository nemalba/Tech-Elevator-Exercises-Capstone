package com.techelevator;

import java.util.Locale;
import java.util.Scanner;

public class LinearConvert {
    /*  Linear conversion
	Write a program that converts meters to feet and vice-versa.
		The foot to meter conversion formula is:
		m = f * 0.3048
		The meter to foot conversion formula is:
		f = m * 3.2808399

		Write a command-line program which prompts a user to enter a length,
		and whether the measurement is in (m)eters or (f)eet.
		Convert the length to the opposite measurement, and display the old and new measurements to the console.
		Please enter the length: 58
		Is the measurement in (m)eter, or (f)eet? f
		58f is 17m.
     */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the length: ");
		double length = Double.valueOf(scanner.nextLine());

		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
		String response = scanner.next();
		response = response.toLowerCase(Locale.ROOT);

		if(response.equals("f")){
			//The foot to meter conversion formula is:
			//m = f * 0.3048
			double lengthInMeter =length * 0.3048;
			int meterLength = (int)lengthInMeter;
			//58f is 17m.
			System.out.printf("%.0ff is %dm.",length, meterLength);
		}
		else{
			//The meter to foot conversion formula is:
			//		f = m * 3.2808399
			double lengthInFoot = length * 3.2808399;
			int footLength = (int)lengthInFoot;
			System.out.printf("%.0fm is %df.",length, footLength);
		}


	}

}
