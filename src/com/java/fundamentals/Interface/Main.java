package com.java.fundamentals.Interface;

public class Main {
    public static void main(String[] args) {
        Costumer coustemer1=new Costumer();
        Gold_costumer costumer2=new Gold_costumer();
        Diamond_costumer costumer3=new Diamond_costumer();
        String S1;
        int r=90;
        String S2=String.valueOf(r);
        System.out.println(S2.getClass().getName());
        Verification v1=new Verification();
        v1.displaydetailsobj(costumer3);
        coustemer1.met1(20);
        coustemer1.met2("pranay");

    }
}
