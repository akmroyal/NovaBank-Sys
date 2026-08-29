package com.novabank;


import com.novabank.account.BankAccount;
import com.novabank.customer.Customer;
import com.novabank.account.AccountService;

// nova bank - System
public class Main {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer("Indramani", "indra@gmail.com", "9034823395");

            // Create Account Service
            AccountService service = new AccountService();

            // Open savings Account
            BankAccount savings = service.openSavingsAccount(customer, 5000);
            service.printAccountDetails(savings);

            // Deposit
            service.deposit(savings, 300);
            service.printAccountDetails(savings);

            // Withdraw
            service.withdraw(savings, 1200);
            service.printAccountDetails(savings);

            service.withdraw(savings, 5000);

        }catch (IllegalArgumentException e){
            System.out.println("Something went wrong !! : " + e.getMessage());
        }
    }
}