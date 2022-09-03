package com.company;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from The Scanner");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number 1");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter Number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();
//        int sum = a+b;
//        float sum = a + b;
//        System.out.println("the sum of these no. is");
//        System.out.println(sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
//        String poi = sc.next();
//        System.out.println(poi);
        String str = sc.nextLine();
        System.out.println(str);

    }
}
