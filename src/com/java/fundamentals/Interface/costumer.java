package com.java.fundamentals.Interface;

import java.util.Scanner;

public class costumer {
    int id;
    String Name;
    byte age;
    String address;
    long phoneNumber;
    String gender;
    String email;
    String region;
    costumer(){
        System.out.println("created coustemer class object");
    }
    costumer(int id,String Name,byte age,String address,long phoneNumber,String gender,String email,String region){
        this.id=id;
        this.Name=Name;
        this.age=age;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.email=email;
        this.region=region;
    }
}
