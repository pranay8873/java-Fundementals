package com.java.fundamentals.Interface;

public class Debitcardpayment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done successfully: " + amount);
        return true;
    }
    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
