package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGusses = 0;

    public int getNoOfGusses() {
        return noOfGusses;
    }

    public void setNoOfGusses(int noOfGusses) {
        this.noOfGusses = noOfGusses;
    }

    Game(){
        Random random = new Random();
        this.number = random.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGusses++;
        if (inputNumber==number){
            System.out.format("Yes! you guessed it right, it was %d\nYou guessed it in %d attempts",number,noOfGusses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too Low..");
        }
        else if(inputNumber>number){
            System.out.println("Too High..");
        }
        return false;
    }
}
public class Exercise_3 {
    public static void main(String[] args) {
        /*
          Create a class Game, which allows a user to play "Guess the Number" game once.
          Game should have the following methods:
          1. Constructor to generate the random number.
          2. takeUserInput() to take a user input of number.
          3. isCorrectNumber() to detect whether the number entered by the number by the user is true.
          4. getters and setters for noOfGuesses.
          Use properties such as noOfGuesses(int), etc to get this task done!
        */
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
