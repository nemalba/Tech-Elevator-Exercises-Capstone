package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Owner extends Person{

    List<Dwelling> properties = new ArrayList<>();

    public Owner(String name, String email) {
        super(name, email);
    }

    public void addProperty(Dwelling dwelling){
        properties.add(dwelling);  // add the new dwelling to the list
    }

    public List<Dwelling> getProperties() {
        return properties;
    }

    public void removeProperty(Dwelling dwelling){
        properties.remove(dwelling);
    }
}
