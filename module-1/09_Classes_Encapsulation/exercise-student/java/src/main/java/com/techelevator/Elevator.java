package com.techelevator;

public class Elevator {

    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfLevels){
        this.numberOfFloors = numberOfLevels;
        currentFloor = 1;
    }


    // Methods

    public void openDoor(){
        //openDoor() opens the elevator door
        doorOpen = true;
    }

    public void closeDoor(){
        //closeDoor() closes the elevator door.
        doorOpen = false;
    }

    public void goUp(int desiredFloor){
      if(!doorOpen){
          if(desiredFloor <= numberOfFloors){
              if(desiredFloor > currentFloor){
                  currentFloor = desiredFloor;
              }
          }
      }
    }

    public void goDown(int desiredFloor){
        if(!doorOpen){
            if(desiredFloor >=1){
                if(desiredFloor < currentFloor){
                    currentFloor = desiredFloor;
                }
            }
        }
    }

    //Getters
    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

}
