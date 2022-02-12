package com.techelevator.farm;

public class Tractor implements Singable {
    //when you implement an interface, that means you are
    // providing the method bodies -- what does it mean
    // to getSound()
    @Override
    public String getSound() {
        return "Vrrroooooom";
    }

    @Override
    public String getName() {
        return "Tractor";
    }
}
