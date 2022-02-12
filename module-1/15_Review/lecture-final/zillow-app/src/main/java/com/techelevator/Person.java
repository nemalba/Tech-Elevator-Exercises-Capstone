package com.techelevator;

public class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override   // overriding the Object toString version (which prints out hashcodes not values of properties)
    public String toString() {
        return "name='" + name + '\'' +
                ", email='" + email ;
    }
}
