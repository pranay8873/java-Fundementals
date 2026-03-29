package com.java.fundamentals.Interface;

public class Diamond_costumer extends Costumer{
    float Discount=50;
    Diamond_costumer(){
        super();
        System.out.println("Since you are a diamond costumer you'll get 50% discount ");
    }
    Diamond_costumer(int id,String Name,byte age,String address,long phoneNumber,String gender,String email,String region) {
        super();
        System.out.println("you are a diamond costumer");
        System.out.println("since you are a gold costumer you get 50% extra discount");
    }


}
