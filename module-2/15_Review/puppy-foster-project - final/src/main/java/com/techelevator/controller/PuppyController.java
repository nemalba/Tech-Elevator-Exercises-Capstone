package com.techelevator.controller;

import com.techelevator.dao.JdbcPuppyDao;
import com.techelevator.dao.PuppyDao;
import com.techelevator.model.Puppy;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PuppyController {

    private PuppyDao dao = new JdbcPuppyDao(new BasicDataSource())

}
