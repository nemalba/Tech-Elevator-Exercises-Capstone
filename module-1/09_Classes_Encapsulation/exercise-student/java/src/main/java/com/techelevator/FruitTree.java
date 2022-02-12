package com.techelevator;

public class FruitTree {


    private String typeOfFruit;
    private int piecesOfFruitLeft;
    private int startingPiecesOfFruit;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove) {

        if(numberOfPiecesToRemove<=piecesOfFruitLeft) {
          piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        }else{
            return false;
        }

    }

    public String getTypeOfFruit() {

        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {

        return piecesOfFruitLeft;
    }
}
