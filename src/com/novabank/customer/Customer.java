package com.novabank.customer;

public class Customer {
    private final String name;
    private final String email;
    private final String mobileNumber;


    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String name, String email, String mobileNumber){
        // account holder name validation
        if (name==null || email==null || mobileNumber==null){
            throw new IllegalArgumentException("Name, email address and mobile Number cannot be null");
        }

        // email validation
        if (!email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException("Invalid email address");
        }

        // mobile validation
        if (mobileNumber.length() != 10){
            throw new IllegalArgumentException("Invalid mobile number");
        }

        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
}
