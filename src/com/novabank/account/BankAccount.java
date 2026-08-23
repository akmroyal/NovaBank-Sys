package com.novabank.account;


import com.novabank.common.util.AccountNumGenerator;
import com.novabank.customer.Customer;

public abstract class BankAccount {
    private double balance;
    private String accountNumber;
    private Customer accountHolder;

    public BankAccount(Customer accountHolder, double initalBalance){
        if (accountHolder == null){
            throw new IllegalArgumentException("Account holder cannot be null.");
        }

        if (initalBalance < 0){
            throw new IllegalArgumentException("Intial balance cannot be negative.");
        }

        // Value storing
        this.accountHolder = accountHolder;
        this.accountNumber = String.valueOf(AccountNumGenerator.generate());
        this.balance = initalBalance;

    }

    // Deposit an amount
    public double deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Amount cannot be negative or zero");
        }

        this.balance += amount;
        return balance;
    }

    // Withdraw an amount
    public abstract double withdraw(double amount);

    // Get balance
    public double getBalance(){
        return balance;
    }

    // set Balance
    protected void setBalance(double balance){
        this.balance = balance;
    }

    // get an Account Holder
    public Customer getAccountHolder(){
        return accountHolder;
    }

    // get an Account Number
    public String getAccountNumber(){
        return accountNumber;
    }

    @Override
    public String toString(){
        return String.format("Account[%s] Holder: [%s], Balance: ₹%.2f", accountNumber, accountHolder.getName(), balance);
    }
}
