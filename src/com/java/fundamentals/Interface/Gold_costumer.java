package com.java.fundamentals.Interface;

public class Gold_costumer extends Costumer {
    float Discount=30;
    Gold_costumer(){
        System.out.println("you are a gold costumer");
        System.out.println("since you are a gold costumer you get 30% extra discount");
    }
    Gold_costumer(int id,String Name,byte age,String address,long phoneNumber,String gender,String email,String region) {
//        super();
        System.out.println("you are a gold costumer");
        System.out.println("since you are a gold costumer you get 30% extra discount");
    }
    @Override
    void display(){
        super.display();
        System.out.println("display method from gold class");
    }

    }
