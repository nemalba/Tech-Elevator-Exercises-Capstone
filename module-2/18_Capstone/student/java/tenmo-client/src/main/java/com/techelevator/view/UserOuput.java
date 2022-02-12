package com.techelevator.view;

import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.AuthenticatedUser;

public class UserOuput {

    public static void displayAccountBalance(Account account){
        AuthenticatedUser authenticatedUser = new AuthenticatedUser();
        System.out.println("Your current account balance is: $" + account.getBalance());


    }
}
