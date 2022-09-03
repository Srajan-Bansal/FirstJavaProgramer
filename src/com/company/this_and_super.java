package com.company;

class ekClass{
    int a;

    public int getA() {
        return a;
    }
    public ekClass(int v) {
        this.a = v;
    }
    public int returnnone(){
        return 1;
    }
}

class doClass extends ekClass{
    doClass(int c){
       super(c);
       System.out.println("I am a constructor");
    }
}
public class this_and_super {
    public static void main(String[] args) {
        ekClass e = new ekClass(5);
        System.out.println(e.getA());


        doClass d = new doClass(5);
    }
}
