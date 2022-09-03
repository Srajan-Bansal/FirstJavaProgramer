package com.company;

import java.util.Scanner;

public class try_catch_Nested {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
//        int ind = sc.nextInt();

//        try{
//            System.out.println("Welcome Srajan Bansal");
//            try {
//                System.out.println(marks[ind]);
//            } catch(ArrayIndexOutOfBoundsException e){
//                System.out.println("Sorry! This index doesn't exist");
//                System.out.println("Exception Level 2");
//            }
//        } catch (Exception e){
//            System.out.println("Exception Level 1");
//        }

        // Quick Quiz
        while(true) {
            System.out.println("Enter Your Number");
            int id = sc.nextInt();
                try {
                    System.out.println(marks[id]);
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry! This index doesn't exist");
                } catch (Exception e) {
                System.out.println("Please Enter a valid index");
            }
            System.out.println("Thanks for Using\n");
        }
    }
}
