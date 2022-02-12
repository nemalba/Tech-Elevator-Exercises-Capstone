package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Tutorial {
	
    public static void main(String[] args) {

    	// Step One: Declare a List

    	List<String> nameList = new ArrayList<>();


    	// Step Two: Add values to a List
        nameList.add("Ada");
        nameList.add("Grace");
        nameList.add("Margaret");
        nameList.add("Adele");

        // [ "Ada", "Grace", "Margaret", "Adele" ]

    	// Step Three: Looping through a List in a for loop
       for(int i=0; i<nameList.size(); i++){
           System.out.println("The name at index " + i + " is " + nameList.get(i));
       }
    	//The name at index 0 is Ada
        //The name at index 1 is Grace
        //The name at index 2 is Margaret
        //The name at index 3 is Adele

    	// Step Four: Remove an item
    	//nameList.remove("Ada");

        //nameList.remove("Ada");
        nameList.remove(3);
        System.out.print(nameList);

    	// Step Five: Looping through List in a for-each loop
        //[Ada, Grace, Margaret]
        for (String name : nameList) {
            System.out.println("Name: " + name);
        }

    }

}
