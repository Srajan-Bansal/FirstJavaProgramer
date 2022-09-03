package com.company;

class Employee1{
    int salary;
    public int getSalary() {
        return salary;
    }

    String name;
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class cellPhone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}

class square{
    int side;
//    public int perimeter(){
//        return 4*side;
//    }
//    public int area(){
//        return side*side;
//    }

      public void perimeter(){
          System.out.println(4*side);
    }
    public void area(){
        System.out.println(side*side);
    }
}

class rectangle{
    int length;
    int breadth;
    public void perimeter(){
        System.out.println(2*(length+breadth));
    }
    public void area(){
        System.out.println(length*breadth);
    }
}

class TommyVecetti{
    public void hit(){
        System.out.println("Hitting");
    }
    public void run(){
        System.out.println("Running");
    }
    public void fire(){
        System.out.println("Firing");
    }
}

class circle {
    int side;
    public int perimeter(){
        return 2*side*22/7;
    }
    public int area(){
        return side*side*22/7;
    }
}

class Practice_Set8 {
    public static void main(String[] args) {

        // Problem 1
//        Employee1 srajan = new Employee1();
//
//        srajan.salary = 2800000;
//        System.out.println(srajan.getSalary());
//
//        srajan.setName("Srajan Bansal");
//        System.out.println(srajan.getName());

        // Problem 2
//        cellPhone samsung = new cellPhone();
//        samsung.ring();
//        samsung.vibrate();

        // Problem 3
//        square a = new square();
//        a.side = 5;

//        System.out.println(a.perimeter());
//        System.out.println(a.area());

//        a.perimeter();
//        a.area();

        // Problem 4
//        rectangle a = new rectangle();
//        a.length = 5;
//        a.breadth = 6;
//        a.perimeter();
//        a.area();

        // Problem 5
//        TommyVecetti RockStar_Games = new TommyVecetti();
//        RockStar_Games.hit();
//        RockStar_Games.run();
//        RockStar_Games.fire();

        // Problem 6
        circle r = new circle();
        r.side = 7;
        System.out.println(r.perimeter());
        System.out.println(r.area());
    }
}
