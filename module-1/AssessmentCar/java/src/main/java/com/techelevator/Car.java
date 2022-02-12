package com.techelevator;

//Create a new class that represents a Car.
public class Car {

    private String year;
    private String make;
    private int age; //age: indicates the age (in years) of the car from the current year.
    private boolean isClassicCar; //is classic car: indicates if the car is a classic car.

    /*
    Create a constructor that accepts year, make, and is classic car.
Instantiate an object, or objects, in main()/Main() and use the objects to test your methods.
     */
    public Car(String year, String make, boolean isClassicCar) {
        this.year = year;
        this.make = make;
        this.isClassicCar = isClassicCar;
    }

    /*
    Create a method to determine if a car must receive an e-check using an input parameter: int yearToCheck.
    Return true under the following conditions:
    Even-model year vehicles must be tested if yearToCheck is even.
    Odd-model year vehicles must be tested if yearToCheck is odd.
    Return false if an e-check isn't needed or the car is exempt:
    A vehicle is exempt if it's under 4 years of age.
    A vehicle is exempt if it's over 25 years of age.
    Classic cars are always exempt.
     */
    public boolean mustReceiveEcheck(int yearToCheck) {
        if (yearToCheck % 2 == 0) {
            return true;
        } else if (yearToCheck % 2 == 1) {
            return true;
        }else if(age < 4 || age >25){
            return false;
        }
        else {
            return false;
        }


    }
}
