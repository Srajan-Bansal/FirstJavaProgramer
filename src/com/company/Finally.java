package com.company;

public class Finally {
    public static int greet(){
        try {
            int a =50;
            int b=10;
            int c =a/b;
            return c;
        } catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the End of Function");   // Will execute if Exception occur or not
        }
            System.out.println("This is the End of Function");  // Will not execute if Exception not occur
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

//        int a = 7;
//        int b = 7;
//        while(true) {
//            try {
//                System.out.println(a/b);
//            } catch (Exception e) {
//                System.out.println(e);
//                break;
//            } finally {
//            System.out.println("I am finally for value of b = " + b);
//            }
//            b--;
//        }

//        try{
//            System.out.println(50/0);
//        }
//        finally {
//            System.out.println("Yes! This is a valid JAVA code");
//        }
    }
}
