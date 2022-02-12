package com.techelevator;

public abstract class Wall {

    private String name;
    private String color;

    //constructor
    public Wall(String name, String color){
        this.name = name;
        this.color = color;
    }

    //getArea() takes no parameters and returns an integer representing the total area of the wall
    public abstract int getArea();

    //return the name
    public String getName() {
        return name;
    }

    //return the color
    public String getColor() {
        return color;
    }

}
