package com.company;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println("CBSC percentage calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Maths Marks");
        short Maths = sc.nextShort();
        System.out.println("Enter Your Physics Marks");
        short Physics = sc.nextShort();
        System.out.println("Enter Your chemistry Marks");
        short Chemistry = sc.nextShort();
        System.out.println("Enter Your Physical Education Marks");
        short Computer = sc.nextShort();
        System.out.println("Enter Your English Marks");
        short English = sc.nextShort();
         float totalScore = 500.0f;
         float obtainedScore = Maths+Physics+Chemistry+Computer+English;
         float percentage = (obtainedScore*100)/totalScore;
         System.out.println(percentage);
    }
}
