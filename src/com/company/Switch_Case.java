package com.company;
import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short var = sc.nextShort();

        switch (var) {
            case 18: System.out.println("You are going to become an Adult!");
                break;
            case 23: System.out.println("You are going to join a Job!");
                break;
            case 68: System.out.println("You are going to get retired");
                break;
            default: System.out.println("Enjoy your life");
        }
    }
}
