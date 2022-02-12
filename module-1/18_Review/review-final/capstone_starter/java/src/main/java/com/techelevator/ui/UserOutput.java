package com.techelevator.ui;

import com.techelevator.models.Instructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


/**
 * Responsibilities: This class should handle formatting and displaying ALL
 * messages to the user
 * 
 * Dependencies: None
 */
public class UserOutput
{

    public static void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public static void displayHomeScreen()
    {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayInstructorScreen() {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                    Instructor");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void listInstructors(List<Instructor> instructors){
        for (Instructor instructor: instructors){
//            System.out.println(instructor.getName() + " " + instructor.getAge() );
            // specifiers %s is string %15s means right justify the string in a width of 15 chars
            // %-15s left justify
            //  %d is for integers - %4d right justify in width of 4 chars
            //  Money is going %.2f - .2 means 2 decimal places to right of decimal point
            // %6.2f  mean right justify in width of 6 chars with 2 decimal places to right
            // f will work for double or bigDecimal -- f stands float
            System.out.printf("%-15s %4d\n", instructor.getName(), instructor.getAge());
        }
        System.out.println();
    }

}
