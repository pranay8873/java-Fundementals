package com.java.fundamentals.Interface;

public class Costumer {
    int id;
    String Name;
    byte age;
    String address;
    long phoneNumber;
    String gender;
    String email;
    String region;
    Costumer(){
        System.out.println("created coustemer class object");
    }
    void costumer(int id,String Name,byte age,String address,long phoneNumber,String gender,String email,String region){
        this.id=id;
        this.Name=Name;
        this.age=age;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.email=email;
        this.region=region;
    }
    void display_details(){
        System.out.println("Customer Id : " + id);
        System.out.println("Name : " + Name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Gender : " + gender);
        System.out.println("Email : " + email);
        System.out.println("Region : " + region);
    }
}
