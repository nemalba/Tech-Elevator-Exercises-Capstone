package com.techelevator.controller;

import com.techelevator.dao.PuppyDao;
import com.techelevator.model.Puppy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PuppyController {

    @Autowired
    private PuppyDao dao;  // @autowired lets SpringBoot be in charge of wiring our dao for us

    /**
     * return all puppies
     */
    @RequestMapping(path="/puppies", method = RequestMethod.GET)
    public List<Puppy>  getAllPuppies() {
        List<Puppy> puppyList = dao.getAllPuppies();
        return puppyList;
    }



}
