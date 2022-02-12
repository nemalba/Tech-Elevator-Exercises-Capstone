package com.techelevator;

public class RectangleWall extends Wall{

    //instance variables
    private int length;
    private int height;

    public RectangleWall(String name, String color, int length, int height){

        super(name, color);
        this.length = length;
        this.height = height;
    }

    @Override
    public int getArea() {
        return length * height;
    }

    @Override
    public String toString() {
        return super.getName() + " (" + length + "x" + height + ") rectangle";
    }

    // Getters
    public int getLength(){
        return length;
    }

    public int getHeight(){
        return height;
    }

}
