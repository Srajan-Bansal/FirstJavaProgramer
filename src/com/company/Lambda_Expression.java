package com.company;

interface DemoAno{
    void meth1(int a);
//    void meth2();

}
//class AnonyDemo implements Demo{
//    public void display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}

public class Lambda_Expression {
    public static void main(String[] args) {
//        AnonyDemo obj = new AnonyDemo();
//        obj.meth1();

        //  Anonymuos Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

        // Lambda Expression
        DemoAno obj = (a)->{
            System.out.println("I am a method 1 " + a);
        };
        obj.meth1(45);
    }
}
