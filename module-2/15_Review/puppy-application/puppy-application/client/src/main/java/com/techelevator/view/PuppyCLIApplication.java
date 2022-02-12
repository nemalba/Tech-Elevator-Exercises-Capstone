package com.techelevator.view;

import com.techelevator.model.Puppy;
import com.techelevator.services.PuppyService;

public class PuppyCLIApplication {

    private final PuppyService puppyService = new PuppyService();
    public static void main(String[] args) {

        PuppyCLIApplication app = new PuppyCLIApplication();

        app.run();

    }

    private void run() {

        System.out.println("Welcome to our RESTful API Puppy Application!");
        System.out.println("Here is a list of all puppies: ");
        Puppy[] puppies = puppyService.getAllPuppies();
    }


}
