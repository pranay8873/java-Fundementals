package com.java.fundamentals.Interface.Abstract;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Volkswagon extends Service{
    Scanner sc=new Scanner(System.in);
    public Volkswagon(int id,String customername,String vehicle,String model){
        super(id,customername,vehicle,model);
        System.out.println("you have chosen volkswagon service center ");
    }
    @Override
    public void general(){
        System.out.println("For general service it costs about INR: 15000.00");
    }
    @Override
    public void repair(){
        System.out.println("for Repair it costs based upon your problem");
        System.out.println("Enter your problem scale from 1-10");
        System.out.println("1-minor dents and small scraches");
        System.out.println("2-4: broken parts and large dents");
        System.out.println("4-6 : engine and wiring issues");
        System.out.println("6-8 : loss or damage of parts");
        System.out.println("8-10 : full crash of car");
        int level=sc.nextInt();
        switch(level){
            case 1:
                System.out.println("it costs about 3-5k");
                break;
            case 2:
                System.out.println("small fixing costs 2-3k");
                break;
            case 3:
                System.out.println("new parts cost based on parts");
                break;
            case 4:
                System.out.println("cost of parts + INR: 1000.00 fitting charges");
                break;
            case 5:
                System.out.println("Mechanic charges INR: 2000.00 + engine parts cost");
                break;
            case 6:
                System.out.println("Senior mechanic charges INR: 2500.00 + cost of parts");
                break;
            case 7:
                System.out.println("Need to buy new parts and meachinery");



        }


    }

    }
