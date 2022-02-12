package com.techelevator.tenmo.controller;

import com.techelevator.tenmo.dao.AccountDao;
import com.techelevator.tenmo.dao.TransferDao;
import com.techelevator.tenmo.dao.UserDao;
import com.techelevator.tenmo.model.Account;
import com.techelevator.tenmo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@PreAuthorize("isAuthenticated()")
@RestController
public class AccountController {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private TransferDao transferDao;

    @RequestMapping(path = "/balance", method = RequestMethod.GET)
    public Account getBalance(Principal principal){
        int id = userDao.findIdByUsername(principal.getName());
        Account balance = accountDao.viewBalance(id);
        return balance;
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
        public List<User> getUser(Principal principal){
        List<User> userList = new ArrayList<>();
        userList = userDao.findAllExceptCurrentUser(principal.getName());
        return userList;
    }




}
