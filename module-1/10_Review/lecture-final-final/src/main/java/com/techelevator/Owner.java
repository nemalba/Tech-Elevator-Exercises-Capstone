package com.techelevator;

import java.util.ArrayList;
import java.util.List;


public class Owner {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Pet> petList = new ArrayList<>();  // this is initializing the petList to be an ArrayList


    public Owner(String name, String address, String phoneNumber) {
        // constructor only requires name, address and phone
        // we can add pets using our add method below
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Owner(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    public void addPet(Pet newPet){  // pet is the variable of type Pet
        this.petList.add(newPet);
    }

    public void removePet(Pet petNoLongerPartOfMyFamily){  // local variable of type Pet called pet
        this.petList.remove(petNoLongerPartOfMyFamily);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", petList=" + petList +
                '}';
    }
}
