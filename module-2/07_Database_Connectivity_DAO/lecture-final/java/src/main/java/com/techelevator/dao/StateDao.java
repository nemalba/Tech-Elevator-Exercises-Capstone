package com.techelevator.dao;

import com.techelevator.model.State;

import java.util.List;

public interface StateDao {

    State getState(String stateAbbreviation);  // Read

    State getStateByCapital(long cityId);  //Read

    List<State> getStates();  //Read
}
