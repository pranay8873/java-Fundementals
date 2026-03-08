package com.java.fundamentals;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
            byte age;
            Scanner scanner =new Scanner(System.in);
            System.out.println("Enter Age of The Employee : ");
            age = scanner.nextByte();
            System.out.println("Enter Id Of The Employee : ");
            short id = scanner.nextShort();
            System.out.println("Enter Salary Of Employee : ");
            int salary = scanner.nextInt();
            System.out.println("Enter Phone Number Of Employee : ");
            long phoneNumber = scanner.nextLong();
            System.out.println("Enter Percentage Of Growth In Last Year : ");
            float percentage = scanner.nextFloat();
            System.out.println("Enter Percentile In JEE : ");
            double percentile_jee = scanner.nextDouble();
            System.out.println("Enter Grade Of Employee : ");
            char grade = scanner.next().charAt(0);
            System.out.println("Is He Able To Solve Complex Problems : ");
            boolean isAble = scanner.hasNextBoolean();
            System.out.println("Age Of Employee is : "+age);
            System.out.println("Id Of Employee : "+ id);
            System.out.println("Salary Of The Employee Is : "+salary);
            System.out.println("Phone Number Of Employee Is : "+phoneNumber);
            System.out.println("Growth Percentage Of Employee Is : "+percentage);
            System.out.println("JEE Percentile Of Employee Is : "+percentile_jee);
            System.out.println("Grade Of Employee Is : "+grade);
            System.out.println("Is He Able To Handle Complex Problems : "+isAble);

     }
    }
