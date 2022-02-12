package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //4. Instantiate an object, or objects, in `main()`/`Main()`, and use the objects to test your methods.
         FlowerShopOrder flowerShopOrder = new FlowerShopOrder("Wedding bouquet", 5);

		System.out.println(flowerShopOrder);

/*
In the main program class, within the main method, read in the provided csv file `FlowerInput.csv`,
and use it to populate a list of *Flower Shop Order* objects.

 */
		File orderFile = new File("FlowerInput.csv");
		List<FlowerShopOrder> flowerShopOrderList =new ArrayList<>();

		try (Scanner fileScan = new Scanner(orderFile)){
				while(fileScan.hasNextLine()){
					String line =fileScan.nextLine();
					String[] lineArr =line.split("\\,");

				FlowerShopOrder flowerShopOrder1 = new FlowerShopOrder()
				}

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
/*
5. Create a method that calculates the delivery total using input parameters
of a `bool`/`boolean` for `sameDayDelivery` and a string `zipCode`:
    * The delivery fee is $3.99 if the zip code falls between 20000 and 29999 (+$5.99 for same-day delivery).
    * The delivery fee is $6.99 if the zip code falls between 30000 and 39999 (+$5.99 for same-day delivery).
    * The delivery fee is waived ($0.00) if the zip code falls between 10000 and 19999.
    * All other zip codes cost $19.99 (same-day delivery is not an option).
 */

	public static BigDecimal deliveryTotal(boolean sameDayDelivery, int zipCode){
		 BigDecimal deliveryFee;
		 BigDecimal sameDayFee= new BigDecimal(5.99);

		 boolean twentyThousands = zipCode >=20000 && zipCode <=29999;
		 boolean thirtyThousands = zipCode >=30000 && zipCode <=39999;
		 boolean tenThousands = zipCode >10000 && zipCode <19999;
		 boolean sameDayEligibleZip = twentyThousands || thirtyThousands || tenThousands;

		 if(twentyThousands){
		 	deliveryFee = new BigDecimal(3.99);
		 }else if (thirtyThousands){
		 	deliveryFee = new BigDecimal(6.99);
		 }else if(tenThousands){
		 	deliveryFee = BigDecimal.ZERO;
		 }else{
		 	deliveryFee = new BigDecimal(19.99);
		 }
		//delivFee = (sameDay && !tenThousands && sameDayEligibleZip) ? delivFee.add(sameDayFee) : delivFee;

		//return delivFee.setScale(2, RoundingMode.HALF_UP);
		 deliveryFee = (sameDayFee && !tenThousands && sameDayEligibleZip)? deliveryFee.add(sameDayFee):deliveryFee;
	return deliveryFee.setScale(2, RoundingMode.HALF_UP);;

	}
	/*
public static BigDecimal getDeliveryFee(boolean sameDay, int zipNum) {

		BigDecimal delivFee;
		BigDecimal sameDayFee = new BigDecimal(5.99);

		// This makes the if statements we are about to write less wordy.
		// It will also help to waive all delivery fees:

		boolean twentyThousands = zipNum >= 20000 && zipNum <= 29999;
		boolean thirtyThousands =zipNum >= 30000 && zipNum <= 39999;
		boolean tenThousands = zipNum >= 10000 && zipNum <= 19999;
		boolean sameDayEligibleZip = twentyThousands || thirtyThousands || tenThousands;

		// Using the booleans above:
		if (twentyThousands) {
			delivFee = new BigDecimal(3.99);

		} else if (thirtyThousands) {
			delivFee = new BigDecimal(6.99);

		} else if (tenThousands) {
			delivFee = BigDecimal.ZERO;

		} else {
			delivFee = new BigDecimal(19.99);
		}

		delivFee = (sameDay && !tenThousands && sameDayEligibleZip) ? delivFee.add(sameDayFee) : delivFee;

		return delivFee.setScale(2, RoundingMode.HALF_UP);
	}
	 */

	/*

1. Create a new class that represents a *Flower Shop Order*.
2. Add a *bouquet type*, *number of roses*, and *subtotal* attribute/property to the Flower Shop Order class:
    * `bouquet type`: indicates the type of bouquet.
    * `number of roses`: indicates the number of roses added to the bouquet.
    * `subtotal`: indicates the order subtotal before shipping by adding $19.99 for the standard bouquet, plus $2.99 for each rose.
3. Create a constructor that accepts `bouquet type` and `number of roses`.
4. Instantiate an object, or objects, in `main()`/`Main()`, and use the objects to test your methods.
5. Create a method that calculates the delivery total using input parameters of a `bool`/`boolean` for `sameDayDelivery` and a string `zipCode`:
    * The delivery fee is $3.99 if the zip code falls between 20000 and 29999 (+$5.99 for same-day delivery).
    * The delivery fee is $6.99 if the zip code falls between 30000 and 39999 (+$5.99 for same-day delivery).
    * The delivery fee is waived ($0.00) if the zip code falls between 10000 and 19999.
    * All other zip codes cost $19.99 (same-day delivery is not an option).
6. Override the `toString()`/`ToString()` method and have it return `"ORDER - {bouquet type} - {number of roses} roses - {subtotal}"` where `{bouquet type}`, `{number of roses}`, and `{subtotal}` are placeholders for the actual values. The values from the object must be shown in the string where `{variable-name}` is indicated.
7. Implement unit tests to validate the functionality of:
    * The correct subtotal calculation
    * The delivery fee calculation
8. In the main program class, within the main method, read in the provided csv file `FlowerInput.csv`, and use it to populate a list of *Flower Shop Order* objects.
9. Add up the subtotal total for all of the orders in the list, and print it to the screen.
 */


}
