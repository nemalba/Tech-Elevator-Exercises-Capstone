package com.techelevator;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {

        if (super.getBalance() - amountToWithdraw < 150
                && super.getBalance() - amountToWithdraw > 0) {
            super.withdraw(amountToWithdraw + 2);
            return getBalance();
        } else if (super.getBalance() - amountToWithdraw < 0) {
            return getBalance();
        } else {
            super.withdraw(amountToWithdraw);
            return super.getBalance();
        }
    }
}

