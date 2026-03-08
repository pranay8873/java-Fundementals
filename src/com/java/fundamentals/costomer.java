package com.java.fundamentals;

import java.util.Objects;
import java.util.Scanner;

public class costomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter costomer name : ");
        String name = sc.nextLine();
        System.out.println("Enter costomer e-mail :");
        String email = sc.nextLine();
        System.out.println("enter costomer phone number : ");
        long p_Number= sc.nextLong();
        System.out.println("Enter Age Of The Costomer : ");
        byte age = sc.nextByte();
        System.out.println("Enter Membership Daimond-D,Gold-G,Silver_S :");
        String membership = sc.next();
        double price = 10000;
        System.out.println("Name : "+name+"\nE-mail :"+email+"\nPhone number : "+p_Number+"\nAge : "+age+"\nMembership : "+membership);
        if(age>50 && membership.equals("G")){
            price = price-((price*50)/100);
            double cgst= (price*5)/100;
            double sgst= (price*5)/100;
            price= price+cgst+sgst;
            System.out.println("After 50% discount plus 5% CGST = "+cgst+", and 5% SGST = "+sgst+"\nThe Amount To Be Paid Is :"+price);
        } else if (age>50 && membership.equals("S")) {
            price = price-((price*40)/100);
            double cgst= (price*5)/100;
            double sgst= (price*5)/100;
            price= price+cgst+sgst;
            System.out.println("After 40% discount plus 5% CGST = "+cgst+", and 5% SGST = "+sgst+"\nThe Amount To Be Paid Is :"+price);
        }else if (age>50 && membership.equals("D")) {
            price = price-((price*60)/100);
            double cgst= (price*5)/100;
            double sgst= (price*5)/100;
            price= price+cgst+sgst;
            System.out.println("After 60% discount plus 5% CGST = "+cgst+", and 5% SGST = "+sgst+"\nThe Amount To Be Paid Is :"+price);
        }else {
            price = price-((price*10)/100);
            double cgst= (price*5)/100;
            double sgst= (price*5)/100;
            price= price+cgst+sgst;
            System.out.println("After 10% discount plus 5% CGST = "+cgst+", and 5% SGST = "+sgst+"\nThe Amount To Be Paid Is :"+price);

        }
    }

}
