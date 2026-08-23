package com.novabank.account;

public class BankAccount {
    protected double balance;
    private String accountHolder;
    private Long accountNumber;

    // Initial start of account number
    private static Long initialNum = 1000001L;

    public BankAccount(double openingBalance, String accountHolder){
        if (openingBalance < 0){
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }

        if (accountHolder == null || accountHolder.isBlank()){
            throw new IllegalArgumentException("Account holder cannot be null.");
        }

        // store in accountNumber
        this.accountNumber = accountNumGenerator();
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    private Long accountNumGenerator(){
        initialNum++;
        this.accountNumber = initialNum;
        return initialNum;
    }

    public double getBalance(){
        return balance;
    }

    public double setBalance(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        this.balance = amount;
        return balance;
    }


    public String getAccountHolder(){
        return accountHolder;
    }

    public double deposit(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative.");
        }

        this.balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        if (amount < 0 || amount > balance){
            throw new IllegalArgumentException("Amount should be withdrawn. Please re-Enter");
        }

        this.balance -= amount;
        return balance;
    }

    public Long getAccountNumber(){
        return accountNumber;
    }
}
