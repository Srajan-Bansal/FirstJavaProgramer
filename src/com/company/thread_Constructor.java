package com.company;

class Mythread extends Thread{
    public void Mythr(String name){
        System.out.println(name);
    }
    public void run(){
            System.out.println("I am a Thread");
    }
}

public class thread_Constructor {
    public static void main(String[] args) {
        Mythread th = new Mythread();
        th.Mythr("Srajan");
        th.start();
        System.out.println("The Id of the thread is "+ th.getId());
    }
}
