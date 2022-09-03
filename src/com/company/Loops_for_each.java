package com.company;

public class Loops_for_each {
    public static void main(String[] args) {
//         float [] marks = {98.5f, 45.5f, 89.5f, 99.5f, 76.5f};
//        String [] students = {"Srajan", "Kriti", "Kiara", "Dia mirza", "Avneet"};
//        System.out.println(students.length);
//        System.out.println(students[1]);



        int [] marks = {98, 45, 89, 100, 76};
//        System.out.println(marks.length);

        //  Displaying the Arrays (Naive way)
        // System.out.println("Printing using Naive way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // Displaying the Arrays (for Loops)
//        System.out.println("Printing using for Loop");
//        for (int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }

        //Quick Quiz:  Displaying the Arrays in reverse order (for Loops)
//        System.out.println("Printing using for Loop in reverse order");
//        for (int i=marks.length -1; i>=0; i--){
//            System.out.println(marks[i]);
//        }


        // Displaying the Arrays in reverse order (for-each Loops)
        System.out.println("Printing using for-each Loop");
        for (int element: marks){
            System.out.print(element+" ");
        }
    }
}
