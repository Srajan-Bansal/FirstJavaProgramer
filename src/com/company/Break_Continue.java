package com.company;

public class Break_Continue {
    public static void main(String[] args) {

        // Break and continue using Loops
//        for (int i=0; i<5; i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if (i==2){
//                System.out.println("Ending the Loop");
//                break;
//            }
//        }

//        int i = 1;
//        while (i<=5){
//            System.out.println(i);
//            if (i==2){
//                System.out.println("Ending the Loop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loops end here");




//            for (int i=0; i<5; i++){
//            if (i==2){
//                System.out.println("Ending the Loop");
//                continue;
//            }
//                   System.out.println(i);
//                   System.out.println("Java is great");
//        }




        int i = 0;
         do {
             i++;
             if (i == 2) {
                 System.out.println("Ending the Loop");
                 continue;
             }
             System.out.println(i);
             System.out.println("JAva is great");
         }
             while (i<5);{
            System.out.println("Loops end here");
             }
    }
}
