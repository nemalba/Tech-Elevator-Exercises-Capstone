package com.techelevator.application;

import com.techelevator.models.VendableItems;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachine
{
    public VendingMachine() {
    }

    public void run()
    {
        while(true)
        {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                // display the vending machine slots
                System.out.println("Test Display Screen");
                VendableItems.CreateVendableItems();

            }
            else if(choice.equals("purchase"))
            {
                System.out.println("purchase");
            }
            else if(choice.equals("exit"))
            {
                System.out.println("Good Bye!");
                break;
            }
        }
    }

}







    

