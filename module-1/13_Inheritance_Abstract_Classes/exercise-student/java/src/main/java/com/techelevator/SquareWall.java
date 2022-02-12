package com.techelevator;

public class SquareWall extends RectangleWall{

    private int sideLength;

public SquareWall(String name, String color, int sideLength){
    super(name, color, sideLength, sideLength);
    this.sideLength = sideLength;

}

    @Override
    public String toString() {
    //Add a toString() method that returns a String
    // in the following format: name (sideLengthxsideLength) square

        return super.getName() + " (" + sideLength + "x" + sideLength + ") square";

    }

}
