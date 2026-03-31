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
        System.out.println("created costumer class object");
    }
    Costumer(int id,String Name,byte age,String address,long phoneNumber,String gender,String email,String region){
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
    void met1(int id){
        System.out.println("method with int input"+" id is "+id);
    }
    void met1(String name){
        System.out.println("method with string input"+" String given is "+name);
    }
    void met1(int id,String name){
        System.out.println("Method with both int and string input "+"id is : "+id+" string is : "+name);
    }


}
