package com.company;
import java.util.Scanner;
import java.util.Random;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

        Random random = new Random();
        int computer = random.nextInt(3);
        System.out.println(computer);
        // 0 = Rock
        // 1 = paper
        // 2 = Scissor

        if(user==0 && computer==1 || user==1 && computer==2 || user==2 && computer==0){
            System.out.println("Computer Won");
        } else if (user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1){
            System.out.println("You won");
        } else {
            System.out.println("Tie");
        }
    }
}
