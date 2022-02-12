package com.green;

public enum Coin {
   /* class Coin
    This will be an enum type and will be accepting 5 different coins 5, 10, 20, 50, 100
    Which will representing all coins inserted by the machine
    What is an enum type in Java?
An enum type is a special data type that enables
for a variable to be a set of predefined constants.
The variable must be equal to one of the values that have been predefined for it.
 Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.
    */

    FIVE_CENTS(5), TEN_CENTS(10), TWENTY_CENTS(20), FIFTY_CENTS(50), HUNDRED_CENTS(100);

    //For each coin we need to know its value
    private int value;

//   private Coin(int value){
//        this.value = value;
//    }


    private Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int[] parseCoins(String coins){
        String[] numberCoinsInText = coins.split(",");
        int[] result = new int[numberCoinsInText.length];

        for(int index=0; index<numberCoinsInText.length; index++){
            result[index] = Integer.parseInt(numberCoinsInText[index]);
        }
       return result;

    }

}
