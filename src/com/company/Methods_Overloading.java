package com.company;

public class Methods_Overloading {

    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }

    static void change(int a){
        a = 63;
    }

    static void change2(int []arr){
        arr[0] = 63;
    }

    static void telljokes(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }
    static void bar(int a, int ...arr){
        System.out.println(a);
    }
    public static void main(String[] args) {
//        telljokes();

        // Case 1
        // Changing an Integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is: " + x);

        // Case 2
        // Changing an array
        int [] marks = {92, 69, 73, 88, 78};
        change2(marks);
        System.out.println("The value of marks after running change2 is: " + marks[0]);


        // Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);
        // Arguments are actual!

        bar(1);
    }
}
