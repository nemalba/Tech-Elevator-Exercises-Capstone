package com.techelevator.models;

public class Instructor {

    private String name;
    private int age;

    public Instructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
