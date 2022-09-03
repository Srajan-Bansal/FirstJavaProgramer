package com.company;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

      /* Classroom of 500 students - You have to store marks of these 500 students
      You have to options:
      1. Create 500 Variables
      2. Use Arrays (recommended)
       */
        //  there are three ways to write Arrays in java
        // 1. Declaration and memory allocation
        //  int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        //  int [] marks;
        //  marks = new int[50];
        // Initialization
//        marks[0] =100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;

        // 3. Declaration , memory allocation and initialization together
        int [] marks = {98, 45, 89, 100, 76};

        // marks[5] = 95; - throws an error
        System.out.println(marks[4]);





        // Problem 1 Apna college
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//
//        String [] name = new String[size];

//        input
//        for (int i=0; i<size; i++){
//            name[i] = sc.next();
//        }

//        output
//        for (int i=0; i<name.length; i++){
//            System.out.println("name " + (i+1) + " is : " + name[i]);
//        }


        // Problem 2 Apna College
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] numbers = new int[size];
//      input
        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

//        output

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i=0; i<numbers.length; i++){
            if (numbers[i]<min){
                min = numbers[i];
            }
            if (numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("The Minimum value in array is: " + min);
        System.out.println("The Maximun value in array is: " + max);
    }
}
