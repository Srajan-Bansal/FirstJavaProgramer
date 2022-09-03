package com.company;
import java.util.*;

public class if_else {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        short age = sc.nextShort();
        boolean cond = (age>30);

        if(cond){
            System.out.println("You are experienced!");
        }
        else if(age>25){
            System.out.println("You are semi-experienced!");
        }
        else if(age>20){
            System.out.println("You are semi semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }

//        Problem 1 Apna College
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float b = sc.nextFloat();
//
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//        System.out.println(a%b);

//        Problem 2 Apna College

//        short n  = sc.nextShort();
//
//        if(n==1) {
//            System.out.println("January");
//        } else if(n==2) {
//            System.out.println("February");
//        } else {
//            System.out.println("Please enter a number upto 2");
//        }
    }
}
