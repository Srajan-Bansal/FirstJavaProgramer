package com.company;


class NegativeRadiusException extends Exception{
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class Throw_vs_Throws {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI*r*r;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) throws NegativeRadiusException {

//        try{
//            int c = divide(6,0);
//            System.out.println(c);
//        } catch (Exception e){
//            System.out.println("Exception");
//        }

        try {
            double a = area(-1);
        } catch (NegativeRadiusException e){
            System.out.println(e.getMessage());
        }
    }
}
