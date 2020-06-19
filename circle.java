package com.company;

class circle{
    private double radius=1.0;
    String color="red";

    circle(){
        System.out.println("default constructor");
    }
    circle(double radius){
        this.radius=radius;
        System.out.println("Radius is "+radius);
    }
    public double getRadius(){
  this.radius=radius;
        return radius;
    }
    public double getArea(){

        return Math.PI * radius * radius;

    }

    public static void main(String[] args){
        circle r=new circle();
        System.out.println("Radius: "+r.getRadius());
        System.out.println("Area of circle: "+r.getArea());
    }


}