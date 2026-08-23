package com.novabank.customer;

public class Customer {
    private String name;
    private String email;
    private String mobileNumber;


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
        if (email.contains("@") && email.contains(".com")){
            throw new IllegalArgumentException("Invalid email address");
        }

        // mobile validation
        if (mobileNumber.length() <= 13){
            throw new IllegalArgumentException("Invalid mobile number");
        }


    }
}
