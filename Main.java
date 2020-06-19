package com.company;

import java.util.Scanner;

public class Main {

    {
        System.out.println("To check whether the no. is armstrong or not");
    }

    public void check( int n ) {
        int c, r, sum = 0, temp;
        temp = n;
        while (n != 0) {
            c = n % 10;  //153%10=3 ....15%10=5
            r = c * c * c;   //r=27,c=3.....and
            sum = sum + r; //27......so
            n = n / 10;  //15.3....on
        }
        if (sum == temp) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }
    }
        public static void main(String[]args)
        {
            // write your code here
            Main m1 = new Main();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number you want to check");
            int n = sc.nextInt();
            m1.check(n);

        }}

