package com.techelevator;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private int balance = 0;

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(int amountToDeposit){
         balance = balance + amountToDeposit;
         return getBalance();
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        return getBalance();
    }
}
