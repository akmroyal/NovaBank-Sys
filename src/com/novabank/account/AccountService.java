package com.novabank.account;

import com.novabank.customer.Customer;

public class AccountService {
    // Open Saving Account
    public BankAccount openSavingsAccount(Customer accountHolder, double amount){
        return new SavingAccount(accountHolder, amount);
    }

    // Open Current Account
    public BankAccount openCurrentAccount(Customer accountHolder, double amount){
        return new CurrentAccount(accountHolder, amount);
    }

    // Deposit amount
    public void deposit(BankAccount account, double amount){
        account.deposit(amount);
        System.out.println("Deposited ₹" + amount + " | New Balance: ₹" + account.getBalance());
    }

    // Withdraw amount
    public void withdraw(BankAccount account, double amount){
        account.withdraw(amount);
        System.out.println("Withdrawn ₹" + amount +" | New Balance: ₹" + account.getBalance());
    }

    // Print account details
    public void printAccountDetails(BankAccount account){
        System.out.println("============ Account Details ==========");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder().getName());
        System.out.println("Balance: ₹" + account.getBalance());
        System.out.println("Type: " + account.getClass().getSimpleName());
    }
}
