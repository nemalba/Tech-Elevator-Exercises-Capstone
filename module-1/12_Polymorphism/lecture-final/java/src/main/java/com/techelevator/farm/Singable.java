package com.techelevator.farm;

/*
An interface is a contract.  Interfaces
are implemented -- means
any class that implements this interface
will override the methods listed in the interface
 */
public interface Singable {

    // method contract -- abstract method (doesn't have a body)
    public String getSound();

    //interface methods always public
    String getName();

}
