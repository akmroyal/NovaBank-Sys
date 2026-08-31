package com.novabank.account;

import com.novabank.customer.Customer;

public class SavingAccount extends BankAccount {
    double interestRate = 4.5;
    double minBalance = 1000.0;

    public SavingAccount(Customer accountHolder, double amount){
        super(accountHolder, amount);
    }

    @Override
    public double withdraw(double amount){
        double bal = getBalance();

        if (amount < 0){
            throw new IllegalArgumentException("Amount is negative.");
        }
        if (amount > getBalance()){
            throw new IllegalArgumentException("Amount insufficient.");
        }
        if (bal - amount < minBalance){
            throw new IllegalArgumentException("Withdrawn canceled, Maintain minimum balance.");
        }


        setBalance(getBalance() - amount);
        return getBalance();
    }

    // make sure for interest
    public double addInterest(){
        double bal = getBalance();
        double interestAmount = (bal * interestRate) / 100;

        deposit(interestAmount);
        return getBalance();
    }
}
