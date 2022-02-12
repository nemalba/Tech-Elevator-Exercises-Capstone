package com.techelevator.application;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

public class UseMenu
{
    public void run()
    {
        boolean shouldLoop = true;
        while(shouldLoop)
        {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("list"))
            {
                // display the instructors
                System.out.println("list all instructors");
                UserInput.pause();
            }
            else if(choice.equals("add"))
            {
                System.out.println("add new instructor");
                UserInput.pause();
            }
            else if(choice.equals("exit"))
            {
                System.out.println("Good Bye!");
                shouldLoop = false;
            }
        }
    }
    
}
