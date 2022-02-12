package com.techelevator;

public class Pet {
    // declare properties first
    private String name;
    private String type;
    private String gender;
    private int age;
    private boolean isFriendly;
    private String size;

    // constructors -- if you don't declare any constructors, java will give you a default -- com.techelevator.Pet()
    // if you declare a constructor, you have to declare ALL ones that you will need


    public Pet(String name, String type, String gender, int age, boolean isFriendly, String size) {
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.isFriendly = isFriendly;
        this.size = size;
    }

    // default constructor
    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
