package com.java.fundamentals.Interface.Abstract;

public class Creditcardpayment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done successfully:  " + amount);
        return true;
    }
}
