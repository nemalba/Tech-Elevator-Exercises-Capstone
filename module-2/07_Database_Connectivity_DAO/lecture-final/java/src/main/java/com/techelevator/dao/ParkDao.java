package com.techelevator.dao;

import com.techelevator.model.Park;

import java.util.List;

public interface ParkDao {

    Park getPark(long parkId);  //Read

    List<Park> getParksByState(String stateAbbreviation);  //Read

    Park createPark(Park park);  //Create

    void updatePark(Park park);  //Update

    void deletePark(long parkId);  // Delete

    void addParkToState(long parkId, String stateAbbreviation);  //Create

    void removeParkFromState(long parkId, String stateAbbreviation);  //Delete
}
