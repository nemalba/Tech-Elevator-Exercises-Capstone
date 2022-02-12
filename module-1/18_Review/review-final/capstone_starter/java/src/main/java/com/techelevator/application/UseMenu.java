package com.techelevator.application;

import com.techelevator.logger.Logger;
import com.techelevator.models.Instructor;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UseMenu {

//    Logger logger = new Logger("myLog.txt");  // we have to initialize somewhere?

    public void run() throws IOException {
        // create a data structure for a list of instructor names
        List<Instructor> instructors = readFromFile();

        boolean shouldLoop = true;
        while(shouldLoop)
        {
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("list"))
            {
                // display the instructors
                UserOutput.displayMessage("list all instructors");
                Logger logger = new Logger("myLog.txt");  // we have to initialize somewhere?
                logger.write(LocalDateTime.now().toString() + "  listing all instructors");
                logger.close();
                listAllInstructors(instructors);
                UserInput.pause();
            }
            else if(choice.equals("add"))
            {
                UserOutput.displayMessage("add new instructor");

                Logger logger = new Logger("myLog.txt");  // we have to initialize somewhere?
                logger.write(LocalDateTime.now().toString() + "  adding a new instructor");
                logger.close();
                UserInput.pause();
            }
            else if(choice.equals("exit"))
            {
                UserOutput.displayMessage("Good Bye!");
                shouldLoop = false;
            }
        }
    }

    private List<Instructor> readFromFile() throws IOException {
        // need to read in from the file instructors.txt and load a List with the names
        // 1a.  need a File object to the String file name "instructors.txt" - X
        // 1c. create a local list to hold the names from the file - X
        // 1b. need a Scanner object to the file - X
        // 3.    need a try catch block - X
        // 2. while (file.hasNextLine()) - X
        // 4.    add the name from the file to the list

        File filePath = new File("instructors.txt"); // we can hardcode because the data will always be in this file
        List<Instructor>  localInstructors = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(filePath);
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();  // pick up one line from the file
                // split the file into name and age
                   String [] lineArray = line.split(",");
                   String name = lineArray[0];
                   int age = Integer.parseInt(lineArray[1]);
                // create an Instructor object (new Instructor(name, age)
                Instructor instructor = new Instructor(name, age);
                // add the object the list
                localInstructors.add(instructor);

//                localInstructors.add(fileScanner.nextLine());
                // need to fix to read in text and create an instructor object to load to list
            }
            Logger logger = new Logger("myLog.txt");  // we have to initialize somewhere?
            logger.write(LocalDateTime.now().toString() + " reading in the file!");
            logger.close();
        } catch (FileNotFoundException e) {
            //print out a custom error message and end
            UserOutput.displayMessage("Error reading from file -- ending program");
            Logger logger = new Logger("myLog.txt");  // we have to initialize somewhere?
            logger.write(LocalDateTime.now().toString() + " Error reading in file");
            logger.close();
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return localInstructors;
    }

    private void listAllInstructors(List<Instructor> instructors) {
        UserOutput.displayInstructorScreen();
        UserOutput.listInstructors(instructors);
    }

}
