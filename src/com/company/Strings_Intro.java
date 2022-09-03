package com.company;
import java.util.Scanner;

public class Strings_Intro {
    public static void main(String[] args) {
//        String name = new String("Srajan");
//        String name = "Srajan";
//        System.out.print("The name is: ");
//        System.out.print(name);

        int a = 6;
        float b = 5.655364f;
        System.out.printf("The value of a is %d and value of b is %8.6f " , a , b);
//        System.out.format("The value of a is %d and value of b is %f" , a , b);  // do work same as (printf)
//        Scanner sc =  new Scanner(System.in);
//        String str = sc. nextLine();
//        System.out.println(str);

        // String is Palindrome or not
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        if(str == null || str.length() == 0){
            return true;
        }
        for (int i = 0; i <= str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
