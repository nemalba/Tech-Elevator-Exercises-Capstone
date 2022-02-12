package com.techelevator.bank;

public class BankAccount
{
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public int getBalance()
    {
        return balance;
    }

    public int deposit(int amount)
    {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount)
    {
        if (balance - amount > 0)
        {
            balance -= amount;
        }
        return getBalance();
    }

}