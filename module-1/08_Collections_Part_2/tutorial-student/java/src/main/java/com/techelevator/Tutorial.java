package com.techelevator;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Tutorial {
	

    public static void main(String[] args) {

        // Step One: Declare a Map

    	/*Map<String, String> projects = new HashMap<>();
    	// Step Two: Add items to a Map
        projects.put("Ada", "Inventing Computer Programming");
        projects.put("Grace","COBOL");
        projects.put("Margaret", "Apollo Guidance Computer");
        projects.put("Adele", "Graphical User Interface");

        projects.remove("Grace");

    	// Step Three: Loop through a Map
        for(Map.Entry<String, String> project: projects.entrySet()){
            System.out.println("The key " + project.getKey() + " is linked to the value " + project.getValue());
        }*/

        /*Map<String, String> map = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
        map.put("FOO", "FOO");

        System.out.println(map.get("foo")); // FOO
        System.out.println(map.get("Foo")); // FOO
        System.out.println(map.get("FOO")); // FOO */

       /* Map <String, String> reservations = new HashMap<>();
        reservations.put("HY234-9234", "Rick");
        reservations.put("HY234-4235", "Beth");
        reservations.put("HY234-3234", "Jerry");
        for (Map.Entry<String, String> reservation: reservations.entrySet())
        {
            System.out.println(reservation.getKey() + " is for "  + reservation.getValue());
        }

        */
        Map<String, Double> isItOnSale = new HashMap<>();

        isItOnSale.put("KITCHEN4001",0.20 );
        isItOnSale.put("GARAGE1070",0.15);
        isItOnSale.put("LIVINGROOM",0.10 );
        isItOnSale.put("KITCHEN6073",0.40 );
        isItOnSale.put("BEDROOM3434",0.60 );
        isItOnSale.put("BATH0073",0.15 );

        if(isItOnSale.containsKey(itemNumber.toUpperCase(Locale.ROOT))){
            return isItOnSale.get(itemNumber.toUpperCase(Locale.ROOT));
        }

        return 0.00;
    }

}
