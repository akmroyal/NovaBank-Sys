package com.novabank.account;

public class SavingAccount extends AccountServices{
    double interestRate = 4.5;
    double minBalance = 1000.0;

    public SavingAccount(double amount, String accountHolder){
        super(amount, accountHolder);
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

    public double addInterest(){
        double bal = getBalance();
        double interestAmount = (bal * interestRate) / 100;

        deposit(interestAmount);
        return getBalance();
    }
}
