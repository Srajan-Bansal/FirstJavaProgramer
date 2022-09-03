package com.company;

public class try_catch {
    public static void main(String[] args) {
        int a = 6888;
        int b = 0;
//        Without Try
//        int c =a/b;
//        System.out.println("The result is " + c);
//        With Try
        try {
            int c = a / b;
        } catch(Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of The Program");
    }
}
