package com.company;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 9;
        if(a<99){
            try {
//            throw new MyException();
            throw new ArithmeticException("This is an Exception");
            } catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }
    }
}
