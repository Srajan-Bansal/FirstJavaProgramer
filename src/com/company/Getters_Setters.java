package com.company;

class myEmployee{
    private int id;
    private String name;

    public void setName(String n){
//      name = n;
        this.name = n;
    }
    public String getName() { return name; }
    public void setId(int i){
//        id = i;
        this.id = i;
    }
    public int getId() { return id; }
}

class circle1{
    private int radius;
    private int perimeter;
    private int area;

        public void setRadius ( int r){
        this.radius = r;
    }
        public int getRadius () {
        return radius;
    }

        public void setPerimeter ( int p){
        this.perimeter = p;
    }
        public void getPerimeter () {
            if(perimeter == 2*radius*22/7) {
                System.out.println(perimeter);
            }
            else {
                System.out.println("Value of perimeter is not correct");
            }
    }

        public void setArea ( int a){
        this.area = a;
    }
        public void getArea () {
            if (area == radius*radius*22/7) {
                System.out.println(area);
            } else {
                System.out.println("Value of area is not correct");
            }
    }
}
public class Getters_Setters {
    public static void main(String[] args) {
        myEmployee srajan = new myEmployee();
//        srajan.id = 45;
//        srajan.name = "Srajan Bansal";  ---> Throws an error due to private access modifier

//        srajan.setName("Srajan Bansal");
//        srajan.setId(45);
//        System.out.println(srajan.getName());
//        System.out.println(srajan.getId());


        circle1 side = new circle1();
        side.setRadius(7);
        side.setPerimeter(45);
        side.setArea(144);

        System.out.println(side.getRadius());
        side.getPerimeter();
        side.getArea();
    }
}
