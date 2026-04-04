package com.java.fundamentals.Interface;

public class Upipayment extends Payment{
    public UpiPayment(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }
    @Override
    public boolean pay(double amount){
        super.paymentDetails();
        System.out.println("Payment done successfully: " + amount);
        return true;
    }

}
