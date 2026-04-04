package com.java.fundamentals.Interface;

public class Payment extends Costumer{
    String id;
    String customerName;
    String paymentDate;
    String mode;

    public Payment(String id, String customerName, String paymentDate,String mode) {
        this.id = id;
        this.customerName = customerName;
        this.paymentDate = paymentDate;
        this.mode = mode;
    }
}
