package com.novabank;

import com.novabank.account.SavingAccount;

// nova bank - System
public class Main {
    public static void main(String[] args) {
        SavingAccount a1 = new SavingAccount(5000.00, "Tulsi");

        System.out.println("Withdraw Successful, Balance : " + a1.withdraw(3000));
        System.out.println(a1.getBalance());
        System.out.println(a1.addInterest());

    }
}