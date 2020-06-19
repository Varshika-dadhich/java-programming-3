package com.company;
import java.util.Scanner;
class Rectangle{
   public int l,b;
    void setdim(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of length");
        l=sc.nextInt();
        System.out.println("enter the value of breadth");
        b=sc.nextInt();

    }
    int getarea(){
        int area=l*b;
        return area;
    }
}
class Area{

    public static void main(String[] args)
    {
        Rectangle r1=new Rectangle();
        r1.setdim();
     int a1= r1.getarea();
        System.out.println(a1);
    }
}
