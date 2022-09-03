package com.company;
import java.util.Scanner;

public class Geeks_For_Geeks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // sc.nextLine();
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
