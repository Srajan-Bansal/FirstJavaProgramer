package com.company;
import java.util.Scanner;

class InvalidInputException extends Exception{
    public String toString() {
        return "Cannot add 8 & 9";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString() {
        return "Cannot Divide by 0 Exception";
    }
}
class MaxInputException extends Exception{
    public String toString() {
        return "Input cannot be greater than 1,00,000";
    }
}
class MaxMultiplierReachedException extends Exception{
    public String toString() {
        return "Input Cannot be greater than 7000";
    }
}
class CustomCalculator{
    double addition(double a, double b) throws InvalidInputException, CannotDivideByZeroException,
            MaxInputException, MaxMultiplierReachedException{
        if(a>=100000 || b>=100000){
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        if(a>=7000 || b>=7000){
            throw new MaxMultiplierReachedException();
        }
        return a+b;
    }
    double subtraction(double a, double b) throws MaxInputException, MaxMultiplierReachedException{
        if(a>=100000 || b>=100000){
            throw new MaxInputException();
        }
        if(a>=7000 || b>=7000){
            throw new MaxMultiplierReachedException();
        }
        return a-b;
    }
    double multiplication(double a, double b) throws MaxInputException, MaxMultiplierReachedException{
        if(a>=100000 || b>=100000){
            throw new MaxInputException();
        }
        if(a>=7000 || b>=7000){
            throw new MaxMultiplierReachedException();
        }
        return a*b;
    }
    double division(double a, double b) throws MaxInputException, CannotDivideByZeroException, MaxMultiplierReachedException{
        if(a>=100000 || b>=100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivideByZeroException();
        }
        if(a>=7000 || b>=7000){
            throw new MaxMultiplierReachedException();
        }
        return a/b;
    }
}
public class Exercise_6 {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException,
            MaxInputException, MaxMultiplierReachedException{
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1.  Addition
        2.  Subtraction
        3.  Multiplication
        4.  Division
        which throws following Exceptions:
        1. Invalid Input Exception
        2. Cannot divide by 0 Exception
        3. Max Input Exception (if any of the input is greater than 100000)
        4. Max Multiplier reached Exception - Do not allow any multiplication input to be greater than 7000
        */

        CustomCalculator c = new CustomCalculator();
//        c.addition(8,9);
//        c.subtraction(2,1);
        c.multiplication(10,70000);
//        c.division(5,0);
    }
}
