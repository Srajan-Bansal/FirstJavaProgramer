package com.company;
import java.util.Scanner;

class error extends Exception{
    @Override
    public String getMessage() {
        return "Exception";
    }
}

class CustomException extends Exception{
    @Override
    public String getMessage() {
        return "Your Max. retries has reached";
    }
}

public class Practise_Set_14{
    public static int greet(int a, int b) throws IllegalArgumentException,ArithmeticException {
        return a/b;
    }
    public static void main(String[] args) throws CustomException {
        Scanner sc = new Scanner(System.in);

        // Problem 2    // Doubt
//        error er  = new error();
//        try {
//            er.greet(1,1);
//        } catch(IllegalArgumentException e){
//        System.out.println("HiHi");
//        } catch(ArithmeticException e) {
//            System.out.println("HaHa");
//        }

        // Problem 3
//        int a = 0;
//        int marks[] = {1,2,3,4,5};
//        int index;
//        while(a<=5){
//            System.out.println("Enter valid Index");
//            index = sc.nextInt();
//            try{
//                System.out.println("This is a marks is " + marks[index]);
//                break;
//            } catch(Exception e){
//                System.out.println("This is not a valid Index Try Again: ");
//            }
//            a++;
//        }
//        if(a>5){
//            System.out.println("Error");
//        }

        // Problem 4
//        CustomException modify = new CustomException();
//        int a = 0;
//        int marks[] = {1,2,3,4,5};
//        int index;
//        while(a<=5){
//            System.out.println("Enter valid Index");
//            index = sc.nextInt();
//            try{
//                System.out.println("This is a marks is " + marks[index]);
//                break;
//            } catch(Exception e){
//                System.out.println("This is not a valid Index Try Again: ");
//            }
//            a++;
//        }
//        if(a>5){
//            System.out.println(modify.getMessage());
//        }
    }
}
