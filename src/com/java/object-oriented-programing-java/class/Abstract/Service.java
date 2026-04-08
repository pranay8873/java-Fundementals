package com.java.fundamentals.Interface.Abstract;


public abstract class Service{
    int id;
    String customerName;
    String vehicle;
    String model;

     public Service(int id,String customerName,String vehicle,String model){
         this.id=id;
         this.customerName=customerName;
         this.vehicle=vehicle;
         this.model=model;
     }


    public abstract void repair();

     public abstract void general();





}
