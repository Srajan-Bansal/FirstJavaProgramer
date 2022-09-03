package com.company;

public class Recursion {

    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    static int factorial_Iterative(int n){
        if (n==0 || n==1){
            return 1;
        } else {
        int product = 1;
        for (int i=n; i>=1; i--){
            product *= i;
        }
        return product;
     }
    }

    public static void main(String[] args) {

//        System.out.println("The Value of factorial n is: " + factorial(5));
        System.out.println("The Value of factorial n is: " + factorial_Iterative(5));
    }
}
