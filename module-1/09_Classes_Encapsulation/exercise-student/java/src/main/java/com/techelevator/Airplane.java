package com.techelevator;

public class Airplane {
    //Implement the Airplane class

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int availableFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        availableFirstClassSeats = totalFirstClassSeats-bookedFirstClassSeats;
        return availableFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        availableCoachSeats = totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }


     public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {

       if (forFirstClass == true){
           if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
               bookedFirstClassSeats += totalNumberOfSeats;
               return true;
           } else {
               return false;
           }
       }
       else {

           if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
               bookedCoachSeats += totalNumberOfSeats;
               return true;
           } else {
               return false;
           }
       }
   }
}