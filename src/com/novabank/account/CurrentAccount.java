package com.novabank.account;

import com.novabank.customer.Customer;

public class CurrentAccount extends BankAccount{
    private static final double MIN_BALANCE = 5000;

    public CurrentAccount(Customer accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
        if(initialBalance < MIN_BALANCE) {
            throw new IllegalArgumentException("Current account balance should be maintained minimum balance." + MIN_BALANCE);
        }
    }

    @Override
    public double withdraw(double amount) {
        if(amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if(amount > getBalance()){
            throw new IllegalArgumentException("Insufficient balance");
        }

        if (getBalance() - amount < MIN_BALANCE) {
            throw new IllegalArgumentException("Cannot withdraw - maintain minimum balance : " + MIN_BALANCE);
        }

        setBalance(getBalance() - amount);
        return amount;
    }
}
