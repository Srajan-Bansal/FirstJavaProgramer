package com.company;

class good extends Thread{
    public void run(){
        while(true) {
            System.out.println("Good Morning!");
        }
    }
}
class welcome extends Thread{
    public void run(){
//        while(true) {
//            try {
//                Thread.sleep(200);
//            } catch(Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Welcome!");
//        }
    }
}
public class Practise_Set13 {
    public static void main(String[] args) {
        // Problem 1
        good g1 = new good();
        welcome w1 = new welcome();
        g1.setPriority(6);
        w1.setPriority(9);
        System.out.println(g1.getPriority());
        System.out.println(w1.getPriority());
//        g1.start();
        w1.start();
        System.out.println(w1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}

