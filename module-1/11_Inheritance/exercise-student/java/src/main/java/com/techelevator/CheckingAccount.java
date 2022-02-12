package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }


  /*  public int withdraw(int amountToWithdraw) {
        //return super.withdraw(amountToWithdraw);

        if((super.getBalance() - amountToWithdraw < 0) && (super.getBalance() - amountToWithdraw =100) ){
            super.withdraw(amountToWithdraw + 10);
                    return super.getBalance();
        } else if((super.getBalance() - amountToWithdraw >0) && (super.getBalance() - amountToWithdraw >= 100)){
            super.withdraw(amountToWithdraw );
            return super.getBalance();
        }
        return super.getBalance();
    }
*/
  @Override
public int withdraw(int amountToWithdraw){
            if (super.getBalance() - amountToWithdraw >= -100
                    && super.getBalance() - amountToWithdraw < 0) {
                super.withdraw(amountToWithdraw + 10);
                return getBalance();
            } else if (super.getBalance() - amountToWithdraw >= -100
                    && super.getBalance() - amountToWithdraw > 0) {
                super.withdraw(amountToWithdraw);
                return getBalance();
            } else
                return getBalance();

        }

    }