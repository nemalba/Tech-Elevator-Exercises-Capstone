package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable{



    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();
    private int balance;

    @Override
    public int getBalance() {
        for(int i=0; i< accounts.size(); i++ ){
            balance += accounts.get(i).getBalance();
        }
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Accountable[] getAccounts() {
        Accountable [] accountsArray = new Accountable[accounts.size()];
        for(int i = 0; i< accounts.size(); i++){
            accountsArray[i] = accounts.get(i);
        }
        return accountsArray;
    }

    public void addAccount(Accountable newAccount){

        accounts.add(newAccount);

    }

    public boolean isVip() {

          return (getBalance() >=25000);
        }
    }




