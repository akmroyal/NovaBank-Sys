package com.novabank;

import com.novabank.account.SavingBankAccount;

// nova bank - System
public class Main {
    public static void main(String[] args) {
        SavingBankAccount a1 = new SavingBankAccount(5000.00, "Tulsi");

        System.out.println("Withdraw Successful, Balance : " + a1.withdraw(3000));
        System.out.println(a1.getBalance());
        System.out.println(a1.addInterest());

    }
}